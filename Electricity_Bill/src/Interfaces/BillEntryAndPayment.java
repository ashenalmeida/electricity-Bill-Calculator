package Interfaces;

import Class.Customerdetails;
import Class.BillDetails;
import Class.DBConnetion;
import Class.NonEditableTableModel;
import com.formdev.flatlaf.FlatClientProperties;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class BillEntryAndPayment extends javax.swing.JFrame {

    Connection conn = new DBConnetion().connect();

    public BillEntryAndPayment() {
        initComponents();
        PlaceHolder();

    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cidtf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        nictf1 = new javax.swing.JTextField();
        mothscbox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        unittf = new javax.swing.JTextField();
        calculatebtn = new javax.swing.JButton();
        totaltf = new javax.swing.JTextField();
        paymentcbox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        exitebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        insertbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchtf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Customer ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 174, 166, -1));
        jPanel1.add(cidtf, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 178, 340, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("NIC No");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 166, -1));
        jPanel1.add(nictf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 224, 340, -1));

        mothscbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(mothscbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 268, 340, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Month");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 264, 166, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Monthly units");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 308, 166, -1));

        unittf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unittfActionPerformed(evt);
            }
        });
        jPanel1.add(unittf, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 312, 340, -1));

        calculatebtn.setBackground(new java.awt.Color(0, 102, 255));
        calculatebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        calculatebtn.setForeground(new java.awt.Color(255, 255, 255));
        calculatebtn.setText("Calculate");
        calculatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatebtnActionPerformed(evt);
            }
        });
        jPanel1.add(calculatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 352, 136, -1));

        totaltf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totaltfActionPerformed(evt);
            }
        });
        jPanel1.add(totaltf, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 406, 340, -1));

        paymentcbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paid", "Not Paid" }));
        jPanel1.add(paymentcbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 449, 340, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Total");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 402, 172, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("Payment States");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 445, 172, -1));

        exitebtn.setBackground(new java.awt.Color(0, 102, 255));
        exitebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitebtn.setForeground(new java.awt.Color(255, 255, 255));
        exitebtn.setText("EXIT");
        exitebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitebtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 499, 115, 33));

        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        backbtn.setText("←");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jPanel1.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 73, 33));

        insertbtn.setBackground(new java.awt.Color(0, 102, 255));
        insertbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        insertbtn.setForeground(new java.awt.Color(255, 255, 255));
        insertbtn.setText("INSERT");
        insertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbtnActionPerformed(evt);
            }
        });
        jPanel1.add(insertbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 499, 131, 33));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Search NIC");

        searchtf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchtfKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtfKeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchtf, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 753, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bill Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 6, 628, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calculatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatebtnActionPerformed
        CalculationOperation();
    }//GEN-LAST:event_calculatebtnActionPerformed

    private void exitebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitebtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitebtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void insertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbtnActionPerformed
        Insertdata();
         Cleardata();
    }//GEN-LAST:event_insertbtnActionPerformed

    private void unittfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unittfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unittfActionPerformed

    private void totaltfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totaltfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totaltfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        searchCustomer();
  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchtfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtfKeyPressed
//        if (evt.getKeyCode() == KeyEvent.VK_UP ){
//            System.out.println("up");
//        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN){
//            System.out.println("Down");
//        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER){}
    }//GEN-LAST:event_searchtfKeyPressed

    private void searchtfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtfKeyReleased
//        if (evt.getKeyCode()!= KeyEvent.VK_UP && evt.getKeyCode()!= KeyEvent.VK_DOWN && evt.getKeyCode()!= KeyEvent.VK_ENTER){
//        String text = searchtf.getText().trim();
//        searchlist.setd
//        }
    }//GEN-LAST:event_searchtfKeyReleased

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
            java.util.logging.Logger.getLogger(BillEntryAndPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillEntryAndPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillEntryAndPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillEntryAndPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillEntryAndPayment().setVisible(true);
            }
        });
    }
    
     private void PlaceHolder() {
        if (searchtf != null) {
            searchtf.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, " Search");
        }
     }
    //////////////////Calculate operation//////////////////////////////////////////////////////////////////////////////////////////////

    private double CalculationOperation() {
        double total = 0.0;
        String value = unittf.getText().trim();

        if (value.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter the number of units!", "Warning", JOptionPane.WARNING_MESSAGE);
            return 0.0; // Return 0 if no input
        }

        try {
            // Parse units from the text field
            int units = Integer.parseInt(value);

            // Calculate total bill based on units
            if (units <= 30) {
                total = units * 7.85;
            } else if (units <= 60) {
                total = (30 * 7.85) + ((units - 30) * 7.85);
            } else if (units <= 90) {
                total = (30 * 7.85) + (30 * 7.85) + ((units - 60) * 10.00);
            } else {
                total = (30 * 7.85) + (30 * 7.85) + (30 * 10.00) + ((units - 90) * 27.75);
            }

            // Set the calculated totalBill to lblBill text, formatting to 2 decimal places
            totaltf.setText(String.format("%.2f", total)); // Format to 2 decimal places

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter a valid number for units.", "Error", JOptionPane.ERROR_MESSAGE);
            return 0.0; // Return 0 if the input is not a valid number
        }

        return total;
    }

    //////////////////search data//////////////////////////////////////////////////////////////////////////////////////////////
    public void searchCustomer() { // Make it static

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String nic = searchtf.getText().trim();

            if (nic.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter a NIC number!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String sql = "SELECT  id , nic FROM customer_info WHERE nic = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, nic);

            rs = pst.executeQuery();

            if (rs.next()) {
                cidtf.setText(String.valueOf(rs.getInt("id")));
                nictf1.setText(rs.getString("nic"));

            } else {
                JOptionPane.showMessageDialog(null, "Customer not found!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    ////////////////////insert data///////////////////////////////////////////////////////////////////////////////////////

    private void Insertdata() {
        int insertconform = JOptionPane.showConfirmDialog(this, "Are You Sure ", "", JOptionPane.YES_NO_OPTION);
        if (insertconform == JOptionPane.YES_OPTION) {

            String customerid = cidtf.getText();
            String nic = nictf1.getText();
            String month = mothscbox.getSelectedItem().toString();
            String units = unittf.getText();
            String total = totaltf.getText();
            String payment = paymentcbox.getSelectedItem().toString();
            
             if (isDuplicateRecord(nic, -1)) {
            return;
        }
            try {
                String sql = "INSERT INTO calculate_bill VALUES(null,? ,?,?,?,?,?)";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, customerid);
                pst.setString(2, nic);
                pst.setString(3, month);
                pst.setString(4, units);
                pst.setString(5, total);
                pst.setString(6, payment);
                pst.execute();
                Cleardata();
                JOptionPane.showMessageDialog(this, "Successfuly Insert");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }
    ////////////////////Clear data///////////////////////////////////////////////////////////////////////////////////////

    private void Cleardata() {
        cidtf.setText("");
        nictf1.setText("");
        unittf.setText("");
        totaltf.setText("");
        searchtf.setText("");

    }
    
     ///////////////////////Server Validation//////////////////////////////////////////
    private boolean isDuplicateRecord(String nic,int currentId) {
        try {
            // Check for duplicate nic
            String queryCourseCode = "SELECT COUNT(*) FROM calculate_bill WHERE nic = ? AND bill_id != ?";
            PreparedStatement pstCustomer = conn.prepareStatement(queryCourseCode);
            pstCustomer.setString(1, nic);
            pstCustomer.setInt(2, currentId);
            ResultSet rsCustomerNic = pstCustomer.executeQuery();

            if (rsCustomerNic.next() && rsCustomerNic.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "The customer NIC already exists. Please use a unique customer NIC.", "Duplicate Customer NIC", JOptionPane.WARNING_MESSAGE);
                return true;
            }

           
            }
         catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error during validation: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return false;
    }
    
      
    
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton calculatebtn;
    private javax.swing.JTextField cidtf;
    private javax.swing.JButton exitebtn;
    private javax.swing.JButton insertbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> mothscbox;
    private javax.swing.JTextField nictf1;
    private javax.swing.JComboBox<String> paymentcbox;
    private javax.swing.JTextField searchtf;
    private javax.swing.JTextField totaltf;
    private javax.swing.JTextField unittf;
    // End of variables declaration//GEN-END:variables
}
