package oe;

import java.util.Date;
import java.util.Calendar;

import java.text.MessageFormat;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.DefaultListModel;

public class Order {
    private static int nextOrderId = 100;
    private int id;
    private Date orderDate;
    private String shipMode;
    private double orderTotal;
    private String status;
    private Customer customer;
    //private ArrayList items;
    private DefaultListModel jList1 = null;

    public Order() {
        id = nextOrderId++;
        orderTotal = 0.0;
        orderDate = new Date();
        //items = new ArrayList(10);
        jList1 = new DefaultListModel();
    }

    public Order(Date newOrderDate, String newShipMode) {
        this();
        orderDate = newOrderDate;
        shipMode = newShipMode;
    }

    public int getId() {
        return id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getShipDate(char region) {
        int daysToShip = Util.getDaysToShip(region);
        Calendar c = Calendar.getInstance();
        c.setTime(orderDate);
        c.add(Calendar.DAY_OF_MONTH, daysToShip);
        return c.getTime().toString();
    }

    public String getShipMode() {
        return shipMode;
    }

    public double getOrderTotal() {
        return orderTotal;
    }

    public String getstatus() {
        return status;
    }

    public void setId(int newId) {
        id = newId;
    }

    public void setOrderDate(int d, int m, int y) {
        int daysInMonth = Util.lastDayInMonth(m, y);

        if (d > 0 && d <= daysInMonth) {
            if ((m > 0 && m <= 12) && (y > 0)) {
                Calendar c = Calendar.getInstance();
                c.set(y, m - 1, d);
                orderDate = c.getTime();
            }
        }
    }

    public void setOrderDate(Date newOrderDate) {
        orderDate = newOrderDate;
    }

    public void setShipMode(String newShipMode) {
        shipMode = newShipMode;
    }

    public void setOrderTotal(double newOrderTotal) {
        orderTotal = newOrderTotal;
    }

    public void setStatus(String newStatus) {
        status = newStatus;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer newCustomer) {
        customer = newCustomer;
    }

    public String toString() {
        /*
    // For Les08 lab 4a.
    return "Order: " + id +
           " Date: " + Util.toDateString(orderDate) +
           " Shipped: " + shipMode +
           " (" + Util.toMoney(getOrderTotal()) + ")";
*/
        Object[] msgVals =
        { new Integer(id), Util.toDateString(orderDate), shipMode,
          Util.toMoney(getOrderTotal()) };
        return MessageFormat.format("Order: {0} Date: {1} Shipped: {2} (Total: {3})",
                                    msgVals);
    }

    public void addOrderItem(int productId) {
        OrderItem item = null;
        boolean productFound = false;
        for (int i = 0; i < jList1.size() && !productFound; i++) {
            item = (OrderItem)jList1.get(i);
            productFound = (item.getProduct().getId() == productId);
        }
        if (productFound) {
            item.setQuantity(item.getQuantity() + 1);
        } else {
            try {
                Product p = DataMan.findProductById(productId);
                item = new OrderItem(p);
                //items.add(item);
                jList1.addElement(item);
                item.setLineNbr(jList1.size());
            } catch (NotFoundException e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
                return;
            }
        }
        orderTotal += item.getUnitPrice();
    }

    public void removeOrderItem(int productId) {
        OrderItem item = null;
        int idx = 0;
        for (int i = 0; i < jList1.size(); i++) {
            item = (OrderItem)jList1.get(i);
            idx = i;
            if (item.getProduct().getId() == productId) {
                item.setQuantity(item.getQuantity() - 1);
                if (item.getQuantity() == 0) {
                    jList1.remove(idx);
                    for (; idx < jList1.size(); idx++) {
                        item = (OrderItem)jList1.get(idx);
                        item.setLineNbr(idx + 1);
                    }
                }
                orderTotal -= item.getUnitPrice();
            }
        }
    }

    public void showOrder() {
        double taxTotal = 0.0;

        System.out.println(toString());
        if (customer != null) {
            System.out.println("Customer: " + customer);
        }
        System.out.println("Items:");
        /*for (Iterator it = items.iterator(); it.hasNext(); ) {
            OrderItem item = (OrderItem)it.next();
            taxTotal += item.getTax();
            System.out.println(item.toString());
        }*/
        System.out.println("Total tax: " + Util.toMoney(taxTotal));
        System.out.println("Order total including tax: " +
                           Util.toMoney(orderTotal + taxTotal));
        System.out.println();
    }
    
    public DefaultListModel getModel() { 
        return jList1;
    }

}
