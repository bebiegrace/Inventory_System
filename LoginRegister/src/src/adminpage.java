/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static src.Unapproveusers.jTable10;
import static src.adminregistrants.jTable1;
import static src.cashierregistrants.jTable2;
import static src.category.jTable6;
import static src.inventorypersonregistrants.jTable3;
import static src.soldproducts.jTable5;


/**
 *
 * @author 1styrGroupB
 */
public class adminpage extends javax.swing.JFrame {

    /**
     * Creates new form adminpage
     */
    public adminpage() {
        initComponents();
          Connect();
    }
    
     Connection con;
    PreparedStatement pst;
    PreparedStatement pst1;
    ResultSet rs;
    DefaultTableModel df;
    
    public void Connect()
  {
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bebieinventorysystem", "root", "");
    } catch (ClassNotFoundException ex){
         Logger.getLogger(bookshop.class.getName()).log(Level.SEVERE, null, ex);
    }   catch (SQLException ex) {
            Logger.getLogger(bookshop.class.getName()).log(Level.SEVERE, null, ex);
        }
    
  }
     public static void AddRowToJadminTable(Object[] dataRow)   
     {
       DefaultTableModel modelu = (DefaultTableModel)jTable10.getModel(); 
       modelu.addRow(dataRow);
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        activeuser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlogin = new javax.swing.JButton();
        jlogin1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jinventory1 = new javax.swing.JLabel();
        jcash = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jsold = new javax.swing.JLabel();
        jcategory = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));

        activeuser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        activeuser.setText("Admin user");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jlogin.setBackground(new java.awt.Color(255, 255, 204));
        jlogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlogin.setText("Sign-In");
        jlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginActionPerformed(evt);
            }
        });

        jlogin1.setBackground(new java.awt.Color(255, 255, 204));
        jlogin1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlogin1.setText("Sign-up");
        jlogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlogin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jlogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(activeuser, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(activeuser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setBackground(new java.awt.Color(255, 255, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("System Users");

        jinventory1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jinventory1.setForeground(new java.awt.Color(255, 51, 51));
        jinventory1.setText("Inventory Person");
        jinventory1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jinventory1MouseClicked(evt);
            }
        });

        jcash.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcash.setForeground(new java.awt.Color(255, 51, 51));
        jcash.setText("Cashier");
        jcash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcashMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Admin");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Followup for Approval");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jinventory1)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcash)
                                    .addComponent(jLabel6)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel7)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addComponent(jinventory1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcash)
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        jLabel5.setBackground(new java.awt.Color(255, 255, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Product/sales");

        jsold.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jsold.setForeground(new java.awt.Color(255, 51, 51));
        jsold.setText("Sold Poducts");
        jsold.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsoldMouseClicked(evt);
            }
        });

        jcategory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcategory.setForeground(new java.awt.Color(255, 51, 51));
        jcategory.setText("Available Products");
        jcategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcategoryMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jcategory))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel5)))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jsold)
                .addGap(99, 99, 99))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(48, 48, 48)
                .addComponent(jcategory)
                .addGap(49, 49, 49)
                .addComponent(jsold)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Admin System Management");

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(254, 254, 254))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mainform main = new mainform();
        main.setVisible(true);
        main.pack();
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        
              System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginActionPerformed
        // TODO add your handling code here:

        loginadmin logad = new loginadmin();
        logad.setVisible(true);
        logad.pack();
        logad.setLocationRelativeTo(null);
        logad.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jloginActionPerformed

    private void jlogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlogin1ActionPerformed
         registeradmin regadmin = new  registeradmin();
         regadmin.setVisible(true);
         regadmin.pack();
         regadmin.setLocationRelativeTo(null);
         regadmin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         this.dispose();
    }//GEN-LAST:event_jlogin1ActionPerformed

    private void jinventory1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jinventory1MouseClicked
        // TODO add your handling code here:

        inventorypersonregistrants inventory = new inventorypersonregistrants();
        inventory.setVisible(true);
        inventory.pack();
        inventory.setLocationRelativeTo(null);
        inventory.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dispose();

        try {
            Statement st = con.createStatement();
            String query1 = "select * from `inventoryperson_users` ";
            ResultSet rs1 = st.executeQuery(query1);

            while(rs1.next()){
                //data wil added until finished..
                String Id1 = rs1.getString("Id");
                String username1 = rs1.getString("Username");
                String password1 = rs1.getString("Password");
                String email_id1 = rs1.getString("Email_id");
                String gender1 = rs1.getString("Gender");
                String age1 = rs1.getString("Age");

                //string array for store data into jtable..
                String tbData[] = {Id1,username1,password1,email_id1,gender1,age1};
                DefaultTableModel tblModel = (DefaultTableModel)jTable3.getModel();

                //add string array data into jtable..

                tblModel.addRow(tbData);

            }

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(registeradmin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jinventory1MouseClicked

    private void jcashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcashMouseClicked
        // TODO add your handling code here:

        cashierregistrants cash = new cashierregistrants();
        cash.setVisible(true);
        cash.pack();
        cash.setLocationRelativeTo(null);
        cash.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dispose();

        try {
            Statement st = con.createStatement();
            String query1 = "select * from `cashier_users` ";
            ResultSet rs1 = st.executeQuery(query1);

            while(rs1.next()){
                //data wil added until finished..
                String Id1 = rs1.getString("Id");
                String username1 = rs1.getString("Username");
                String password1 = rs1.getString("Password");
                String email_id1 = rs1.getString("Email_id");
                String gender1 = rs1.getString("Gender");
                String age1 = rs1.getString("Age");

                //string array for store data into jtable..
                String tbData[] = {Id1,username1,password1,email_id1,gender1,age1};
                DefaultTableModel tblModel = (DefaultTableModel)jTable2.getModel();

                //add string array data into jtable..

                tblModel.addRow(tbData);

            }

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(registeradmin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jcashMouseClicked

    private void jsoldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsoldMouseClicked
        // TODO add your handling code here:

        soldadmin sold = new soldadmin();
        sold.setVisible(true);
        sold.pack();
        sold.setLocationRelativeTo(null);
        sold.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dispose();

        try {
            Statement st = con.createStatement();
            String query1 = "select * from `sales_products` ";
            ResultSet rs1 = st.executeQuery(query1);

            while(rs1.next()){
                //data wil added until finished..
                String bid = rs1.getString("Id");
                String salesid = rs1.getString("sales_id");
                String bookn = rs1.getString("bookname");
                String price = rs1.getString("price");
                String qty = rs1.getString("quantity");
                String totl = rs1.getString("total");

                //string array for store data into jtable..
                String tbData[] = {bid,salesid,bookn,price,qty,totl};
                DefaultTableModel tblModel = (DefaultTableModel)jTable5.getModel();

                //add string array data into jtable..

                tblModel.addRow(tbData);

            }

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(registeradmin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jsoldMouseClicked

    private void jcategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcategoryMouseClicked
        // TODO add your handling code here:

        category cat = new category();
        cat.setVisible(true);
        cat.pack();
        cat.setLocationRelativeTo(null);
        cat.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.dispose();

        try {
            Statement st = con.createStatement();
            String query1 = "select * from `book`";
            ResultSet rs1 = st.executeQuery(query1);

            while(rs1.next()){
                //data wil added until finished..

                String bid = rs1.getString("id");
                String bookn = rs1.getString("bookname");
                String qtys = rs1.getString("quantity");
                String price2 = rs1.getString("price");

                //string array for store data into jtable..
                String tbData[] = {bid,bookn,qtys,price2};
                DefaultTableModel tblModel = (DefaultTableModel)jTable6.getModel();

                //add string array data into jtable..

                tblModel.addRow(tbData);

            }

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(registeradmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcategoryMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        
            adminregistrants adminregis = new adminregistrants();
            adminregis.setVisible(true);
            adminregis.pack();
            adminregis.setLocationRelativeTo(null);
            adminregis.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.dispose();
        
         try {
            Statement st = con.createStatement();
            String query1 = "select * from `admin_users` ";
            ResultSet rs1 = st.executeQuery(query1);
            
            while(rs1.next()){
                //data wil added until finished..
                
                String username1 = rs1.getString("Username");
                String password1 = rs1.getString("Password");
                String email_id1 = rs1.getString("Email_id");
                String gender1 = rs1.getString("Gender");
                String age1 = rs1.getString("Age");
                
                //string array for store data into jtable..
                String tbData[] = {username1,password1,email_id1,gender1,age1};
                  DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();

                //add string array data into jtable..
                
                tblModel.addRow(tbData);

            }
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(registeradmin.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        
           JOptionPane.showMessageDialog(null, "Welcome!");
            Unapproveusers cashregis = new  Unapproveusers();
            cashregis.setVisible(true);
            cashregis.pack();
            cashregis.setLocationRelativeTo(null);
            cashregis.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.dispose();
        
         try {
            Statement st = con.createStatement();
            String query1 = "select * from `user_applicant`";
            ResultSet rs1 = st.executeQuery(query1);

            while(rs1.next()){
                //data wil added until finished..

                String username1 = rs1.getString("username");
                String password1 = rs1.getString("password");
                String email_id1 = rs1.getString("email_id");
                String gender1 = rs1.getString("gender");
                String age1 = rs1.getString("age");
                String rol= rs1.getString("role");
                String sts = rs1.getString("status");
                
                

                //string array for store data into jtable..
                String tbData[] = {username1,password1,email_id1,gender1,age1,rol,sts};
             
                DefaultTableModel modelu = (DefaultTableModel)jTable10.getModel(); 
   

                //add string array data into jtable..

                modelu.addRow(tbData);

            }

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(registeradmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    
                           
         
    }//GEN-LAST:event_jLabel7MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activeuser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jcash;
    private javax.swing.JLabel jcategory;
    private javax.swing.JLabel jinventory1;
    private javax.swing.JButton jlogin;
    private javax.swing.JButton jlogin1;
    private javax.swing.JLabel jsold;
    // End of variables declaration//GEN-END:variables
}