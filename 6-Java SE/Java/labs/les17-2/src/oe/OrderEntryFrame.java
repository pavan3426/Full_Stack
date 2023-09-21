package oe;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.GridLayout;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class OrderEntryFrame extends JInternalFrame {
    BorderLayout borderLayout1 = new BorderLayout();
    private JPanel jPanel1 = new JPanel();
    private GridLayout gridLayout1 = new GridLayout();
    private JPanel jPanel2 = new JPanel();
    private JScrollPane jScrollPane1 = new JScrollPane();
    private JLabel jLabel1 = new JLabel();
    private JTextField jTextField1 = new JTextField();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JLabel jLabel5 = new JLabel();
    private JTextField jTextField2 = new JTextField();
    private JTextField jTextField3 = new JTextField();
    private JTextField jTextField4 = new JTextField();
    private JTextField jTextField5 = new JTextField();
    private JButton jButton1 = new JButton();
    private JList jList1 = new JList();
    private JLabel jLabel6 = new JLabel();
    private JTextField jTextField6 = new JTextField();
    private JButton jButton2 = new JButton();
    private JLabel jLabel7 = new JLabel();
    private JLabel jLabel8 = new JLabel();
    private JLabel jLabel9 = new JLabel();
    private JLabel jLabel10 = new JLabel();
    Order order = null;
    private static int x = 0;
    private static int y = 0;
    private static final int OFFSET = 20;
    private static final int MAX_OFFSET = 200;


    public OrderEntryFrame() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setBounds(0, 0, 400, 300);
        this.getContentPane().setLayout(borderLayout1);
        jPanel1.setLayout(gridLayout1);
        gridLayout1.setColumns(1);
        gridLayout1.setRows(2);
        jPanel2.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        jPanel2.setLayout(null);
        jLabel1.setText("Order Id");
        jLabel1.setBounds(new Rectangle(10, 10, 50, 25));
        jTextField1.setBounds(new Rectangle(60, 15, 85, 20));
        jLabel2.setText("Customer Id");
        jLabel2.setBounds(new Rectangle(10, 55, 75, 15));
        jLabel3.setText("Address");
        jLabel3.setBounds(new Rectangle(10, 90, 50, 15));
        jLabel4.setText("Name");
        jLabel4.setBounds(new Rectangle(10, 70, 50, 15));
        jLabel5.setText("Phone ");
        jLabel5.setBounds(new Rectangle(10, 110, 45, 15));
        jTextField2.setBounds(new Rectangle(90, 110, 120, 20));
        jTextField3.setBounds(new Rectangle(90, 90, 120, 20));
        jTextField4.setBounds(new Rectangle(90, 70, 120, 20));
        jTextField5.setBounds(new Rectangle(90, 50, 60, 20));
        jButton1.setText("Find");
        jButton1.setBounds(new Rectangle(160, 45, 73, 22));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
        jLabel6.setText("Product Id");
        jLabel6.setBounds(new Rectangle(220, 85, 75, 15));
        jTextField6.setBounds(new Rectangle(295, 85, 95, 20));
        jButton2.setText("Add");
        jButton2.setBounds(new Rectangle(225, 105, 73, 22));
        jButton2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton2_actionPerformed(e);
                }
            });
        jLabel7.setText("Order Date");
        jLabel7.setBounds(new Rectangle(240, 10, 65, 15));
        jLabel8.setBounds(new Rectangle(310, 10, 70, 15));
        jLabel8.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        jLabel9.setText("Order Total");
        jLabel9.setBounds(new Rectangle(240, 35, 65, 15));
        jLabel10.setBounds(new Rectangle(310, 35, 70, 15));
        jLabel10.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        jPanel2.add(jLabel10, null);
        jPanel2.add(jLabel9, null);
        jPanel2.add(jLabel8, null);
        jPanel2.add(jLabel7, null);
        jPanel2.add(jButton2, null);
        jPanel2.add(jTextField6, null);
        jPanel2.add(jLabel6, null);
        jPanel2.add(jButton1, null);
        jPanel2.add(jTextField5, null);
        jPanel2.add(jTextField4, null);
        jPanel2.add(jTextField3, null);
        jPanel2.add(jTextField2, null);
        jPanel2.add(jLabel5, null);
        jPanel2.add(jLabel4, null);
        jPanel2.add(jLabel3, null);
        jPanel2.add(jLabel2, null);
        jPanel2.add(jTextField1, null);
        jPanel2.add(jLabel1, null);
        jScrollPane1.getViewport().add(jList1, null);
        jPanel1.add(jPanel2, null);
        jPanel1.add(jScrollPane1, null);
        this.getContentPane().add(jPanel1, BorderLayout.CENTER);
        this.setMaximizable(true);
        this.setIconifiable(true);
        this.setClosable(true);
        initOrder();
        setBounds();
    }

    private void initOrder() {
        order = new Order();
        jTextField1.setText(Integer.toString(order.getId()));
        jLabel8.setText(Util.toDateString(order.getOrderDate()));
        jLabel10.setText(Util.toMoney(order.getOrderTotal()));
    }

    private void setBounds() {
        this.setResizable(true);
        this.setBounds(x, y, this.getWidth(), this.getHeight());
        x = (x + OFFSET) % MAX_OFFSET;
        y = (y + OFFSET) % MAX_OFFSET;
    }

    public void setActive(boolean active) {
        try {
            this.setSelected(active);
        } catch (Exception e) {
        }
        this.setVisible(active);
        if (active) {
            this.toFront();
        }
    }


    private void jButton1_actionPerformed(ActionEvent e) {
        int custId = 0;
        Customer customer = null;
        if (jTextField5.getText().length() > 0) {
            try {
                custId = Integer.parseInt(jTextField5.getText());
                customer = DataMan.findCustomerById(custId);
                order.setCustomer(customer);
                jTextField3.setText(customer.getName());
                jTextField4.setText(customer.getAddress());
                jTextField2.setText(customer.getPhone());
            } catch (NumberFormatException err) {
                JOptionPane.showMessageDialog(this,
                                              "The Customer Id: " + err.getMessage() +
                                              " is not a valid number",
                                              "Error",
                                              JOptionPane.ERROR_MESSAGE);
                jTextField2.setText("");
            } catch (NotFoundException err) {
                JOptionPane.showMessageDialog(this, err.getMessage(), "Error",
                                              JOptionPane.ERROR_MESSAGE);
                jTextField2.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a Customer Id",
                                          "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void jButton2_actionPerformed(ActionEvent e) {
        Product p = null;
        int prodId = 0;
        
        //orderItemList.setModel(order.getModel());
        jList1.setModel(order.getModel());
        if (jTextField6.getText().length() > 0) {
            try {
                prodId = Integer.parseInt(jTextField6.getText());
                p = DataMan.findProductById(prodId);
                order.addOrderItem(p.getId());
                jLabel10.setText(Util.toMoney(order.getOrderTotal()));
            } catch (Exception err) {
                String message = err.getMessage();
                if (err instanceof NumberFormatException) {
                    message =
                            "Product id '" + message + "' is not a valid number";
                }
                JOptionPane.showMessageDialog(this, message, "Error",
                                              JOptionPane.ERROR_MESSAGE);
                jTextField6.setText("");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a Product Id",
                                          "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
