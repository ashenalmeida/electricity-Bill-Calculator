package Interfaces;

import Class.BillDetails;
import Class.Customerdetails;
import Class.DBConnetion;
import Class.NonEditableTableModel;
import com.formdev.flatlaf.FlatClientProperties;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MonthlySummery extends javax.swing.JFrame {

    Connection conn = new DBConnetion().connect();

    PreparedStatement pst;
    NonEditableTableModel model = new NonEditableTableModel(new String[]{"Customer Name", "Contact No", "Monthly Units", "Payment"}, 0);

    public MonthlySummery() {
        initComponents();
        table.setModel(model);
        loadMonthlySummary();
        PlaceHolder();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        printbtn = new javax.swing.JButton();
        exitebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        searchtf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        printbtn.setBackground(new java.awt.Color(0, 102, 255));
        printbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        printbtn.setForeground(new java.awt.Color(255, 255, 255));
        printbtn.setText("PRINT");
        printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbtnActionPerformed(evt);
            }
        });

        exitebtn.setBackground(new java.awt.Color(0, 102, 255));
        exitebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitebtn.setForeground(new java.awt.Color(255, 255, 255));
        exitebtn.setText("EXIT");
        exitebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitebtnActionPerformed(evt);
            }
        });

        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        backbtn.setText("←");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Search");

        jScrollPane1.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Monthly Summery");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exitebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchtf, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitebtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitebtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
      new MainMenu().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void printbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printbtnActionPerformed

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
            java.util.logging.Logger.getLogger(MonthlySummery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonthlySummery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonthlySummery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonthlySummery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonthlySummery().setVisible(true);
            }
        });
    }
    
      private void PlaceHolder() {
        if (searchtf != null) {
            searchtf.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, " Search");
        }
     }

    private void loadMonthlySummary() {
        try {
            String sql
                    = "SELECT customer_info.name, customer_info.contact_no, calculate_bill.units, calculate_bill.payment "
                    + "FROM customer_info "
                    + // ← note the trailing space
                    "INNER JOIN calculate_bill "
                    + // ← trailing space
                    "ON customer_info.id = calculate_bill.cus_id"; // this line doesn’t need an extra space

            pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            boolean hasData = false;
            while (rs.next()) {
                hasData = true;
                String name = rs.getString("name");
                String contact = rs.getString("contact_no");
                int units = rs.getInt("units");
                String payment = rs.getString("payment");

                model.addRow(new Object[]{name, contact, units, payment});
            }

            if (!hasData) {
                System.out.println("Query ran, but no rows returned.");
            }

            rs.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                    null, "Error loading summary: " + e.getMessage()
            );
        }
    }

    //////////////////search data//////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Clears the current table model and reloads only those rows where the
     * customer name, NIC or any other searchable field contains the keyword.
     */
 
    
    public void search() {
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        String keyword = searchtf.getText().trim();

        if (keyword.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Please enter a value to search!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }

        // 1) Build your SQL with three placeholders (?)
        String sql =
            "SELECT c.name, c.contact_no, b.units, b.payment " +
            "FROM customer_info c " +
            "JOIN calculate_bill b ON c.nic = b.nic " +
            "WHERE c.name LIKE ? OR c.nic LIKE ? OR c.contact_no LIKE ?";

        pst = conn.prepareStatement(sql);

        // 2) Bind the wildcarded keyword to each of the three parameters
        String pattern = "%" + keyword + "%";
        pst.setString(1, pattern);
        pst.setString(2, pattern);
        pst.setString(3, pattern);

        // 3) Execute the query
        rs = pst.executeQuery();

        // 4) Clear any existing rows from your table model
        model.setRowCount(0);

        // 5) Loop through the ResultSet and add rows to the model
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("name"),
                rs.getString("contact_no"),
                rs.getInt("units"),
                rs.getString("payment")
            });
        }

        // Optional: if you want feedback when nothing was found
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null,"No matching records found.","Search", JOptionPane.INFORMATION_MESSAGE );
        }

    } catch (SQLException e) {e.printStackTrace();JOptionPane.showMessageDialog( null,  "Database Error: " + e.getMessage(),  "Error", JOptionPane.ERROR_MESSAGE );
    } finally {
        // 6) Always close resources
        try {
            if (rs  != null) rs.close();
            if (pst != null) pst.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton exitebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printbtn;
    private javax.swing.JTextField searchtf;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
