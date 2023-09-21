package oe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import java.util.Date;

public class OrderEntry {
    public static void main(String[] args) throws Exception {
        Order order = new Order();
        double orderTotal;
        boolean exceedsLimit;
        double taxRate = 0.0825;
        double taxValue;

        System.out.println("Order Entry Application");
        orderTotal = order.getOrderTotal();
        System.out.println("Order Total: " + orderTotal);

        taxValue = orderTotal * taxRate;
        System.out.println("Tax Value:   " + taxValue);

        orderTotal += taxValue;
        System.out.println("Final Total: " + orderTotal);

        exceedsLimit = orderTotal > 10.00;
        System.out.println("Total Exceeds $10.00: " + exceedsLimit);

        // order.setOrderDate(27, 1, 2001);
        order.setOrderDate(27, 2, 2001);
        char region = 'A';
        String shipDate = order.getShipDate(region);
        System.out.println("Order Date:         " + order.getOrderDate());
        System.out.println("Days till shipping: " + 
                           Util.getDaysToShip(region));
        System.out.println("Expected Ship Date: " + shipDate);

        //customer1.setId(1);
        //customer1.setName("Gary Williams");
        //customer1.setAddress("Houston TX");
        //customer1.setPhone("713.555.8765");

        //customer2.setId(2);
        //customer2.setName("Lynn Munsinger");
        //customer2.setAddress("Orlando FL");
        //customer2.setPhone("407.695.2210");

        System.out.println("\nCustomers:");
        System.out.println(DataMan.findCustomerById(1).toString());
        System.out.println(DataMan.findCustomerById(2).toString());

        order.setCustomer(DataMan.customers[1]);
        order.showOrder();

        //Order order2 = new Order(new Date(), "overnight");
        Order order2 = new Order(Util.getDate(7, 3,   2002), "overnight");
        order2.setCustomer(DataMan.customer6);
        order2.showOrder();
        /*
        String fileName ="customer.txt";
        PrintWriter pw =new PrintWriter(fileName);
        
        pw.println(DataMan.customer1);
        pw.println(DataMan.customer1);
        pw.println(DataMan.customer3);
        pw.println(DataMan.customer4);
        pw.close();
        
        FileInputStream fis = new FileInputStream(customer.txt);
        
        int fileSize = fis.available();
        
        byte[] bbuf = new byte[fileSize];
        
        fis.close();
        
        for(int cx = 0; cx < fileSize; cx++){
            System.out.println(bbuf[cx])
            
        }
        
        InputStreamreader isr = new InputStreamReader(new FileInputStream("customer.txt"))
        char[] cbuf = new char [fileSize];
        isr.read(cbuf);
        System.out.println(cbuf);
        
        isr.close();
       
       
       ObjectOutputStream cs new ObjectOutputStream(new FileOutputStream("customer.ser"));
    
        cs.writeObject(DataMan.customer1);
        cs.close();
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customer.ser"));
        Customer restCut1 = (Customer)ois.readObject();
        ois.close();
        
     *//   
        
    }
}
