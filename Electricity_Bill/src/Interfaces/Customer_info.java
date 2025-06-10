package Interfaces;

import Class.DBConnetion;
import Class.Customerdetails;
import Class.NonEditableTableModel;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import com.formdev.flatlaf.FlatClientProperties;

public class Customer_info extends javax.swing.JFrame {

    Connection conn = new DBConnetion().connect();
    PreparedStatement pst;
    NonEditableTableModel model = new NonEditableTableModel(new String[]{"ID", "Name", "Address", "NIC", "Contact"}, 0);
    ArrayList<Customerdetails> temp;
    ArrayList<Integer> ids = new ArrayList<>();

    public Customer_info() {
        initComponents();
        table.setModel(model);
        setDefault();
        hideColumns();
        PlaceHolder();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addressvalidation = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        namebox = new javax.swing.JTextField();
        addressbox = new javax.swing.JTextField();
        nicbox = new javax.swing.JTextField();
        contactbox = new javax.swing.JTextField();
        namevalidation = new javax.swing.JLabel();
        addressvalidation1 = new javax.swing.JLabel();
        nicvalidation = new javax.swing.JLabel();
        contactvalidation = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        searchbox = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        exitebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        insertbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        addressvalidation.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Address");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("NIC No");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Contact No");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Name");

        backbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        backbtn.setText("←");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        namebox.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nameboxCaretUpdate(evt);
            }
        });
        namebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameboxActionPerformed(evt);
            }
        });

        addressbox.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                addressboxCaretUpdate(evt);
            }
        });
        addressbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressboxActionPerformed(evt);
            }
        });

        nicbox.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                nicboxCaretUpdate(evt);
            }
        });
        nicbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicboxActionPerformed(evt);
            }
        });

        contactbox.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                contactboxCaretUpdate(evt);
            }
        });

        namevalidation.setForeground(new java.awt.Color(255, 0, 0));

        addressvalidation1.setForeground(new java.awt.Color(255, 0, 0));

        nicvalidation.setForeground(new java.awt.Color(255, 0, 0));

        contactvalidation.setForeground(new java.awt.Color(255, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Customer");

        javax.swing.GroupLayout addressvalidationLayout = new javax.swing.GroupLayout(addressvalidation);
        addressvalidation.setLayout(addressvalidationLayout);
        addressvalidationLayout.setHorizontalGroup(
            addressvalidationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressvalidationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(addressvalidationLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(addressvalidationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addressvalidationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(addressvalidationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contactvalidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contactbox, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                    .addComponent(nicvalidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nicbox)
                    .addComponent(addressvalidation1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addressbox)
                    .addComponent(namevalidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namebox))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addressvalidationLayout.setVerticalGroup(
            addressvalidationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressvalidationLayout.createSequentialGroup()
                .addGroup(addressvalidationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addressvalidationLayout.createSequentialGroup()
                        .addGroup(addressvalidationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addressvalidationLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7))
                            .addGroup(addressvalidationLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(addressvalidationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(namebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namevalidation, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addressbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressvalidation1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nicbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nicvalidation, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contactbox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addressvalidationLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactvalidation, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        searchbox.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                searchboxCaretUpdate(evt);
            }
        });
        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });

        jComboBox1.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Address", "NIC", "Contact" }));

        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        exitebtn.setBackground(new java.awt.Color(0, 102, 255));
        exitebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitebtn.setForeground(new java.awt.Color(255, 255, 255));
        exitebtn.setText("EXIT");
        exitebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitebtnActionPerformed(evt);
            }
        });

        deletebtn.setBackground(new java.awt.Color(0, 102, 255));
        deletebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        updatebtn.setBackground(new java.awt.Color(0, 102, 255));
        updatebtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        clearbtn.setBackground(new java.awt.Color(0, 102, 255));
        clearbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(255, 255, 255));
        clearbtn.setText("CLEAR");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        insertbtn.setBackground(new java.awt.Color(0, 102, 255));
        insertbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        insertbtn.setForeground(new java.awt.Color(255, 255, 255));
        insertbtn.setText("INSERT");
        insertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(insertbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exitebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addressvalidation, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(addressvalidation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(382, 382, 382))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 876, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1112, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(871, 754));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyReleased
        loadSelectedCourseData();

    }//GEN-LAST:event_tableKeyReleased

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        loadSelectedCourseData();
    }//GEN-LAST:event_tableMouseClicked

    private void searchboxCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_searchboxCaretUpdate
        searchCustomerData();
    }//GEN-LAST:event_searchboxCaretUpdate

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        new MainMenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void exitebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitebtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitebtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        Cleardata();
        ClearValidation();
    }//GEN-LAST:event_clearbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        deleteData();
    }//GEN-LAST:event_deletebtnActionPerformed

    private void insertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbtnActionPerformed
        insertData();
    }//GEN-LAST:event_insertbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        updateData();
    }//GEN-LAST:event_updatebtnActionPerformed

    private void nameboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameboxActionPerformed
        addressbox.grabFocus();
    }//GEN-LAST:event_nameboxActionPerformed

    private void addressboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressboxActionPerformed
        nicbox.grabFocus();
    }//GEN-LAST:event_addressboxActionPerformed

    private void nameboxCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nameboxCaretUpdate
        CheckName();
    }//GEN-LAST:event_nameboxCaretUpdate

    private void addressboxCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_addressboxCaretUpdate
        CheckAddress();
    }//GEN-LAST:event_addressboxCaretUpdate

    private void nicboxCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_nicboxCaretUpdate
        CheckNic();
    }//GEN-LAST:event_nicboxCaretUpdate

    private void contactboxCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_contactboxCaretUpdate
        CheckContact();
    }//GEN-LAST:event_contactboxCaretUpdate

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchboxActionPerformed

    private void nicboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicboxActionPerformed
        contactbox.grabFocus();
    }//GEN-LAST:event_nicboxActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_info().setVisible(true);
            }
        });
    }

    private void PlaceHolder() {
        if (namebox != null) {
            namebox.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "EX : Ashen Almeida");
        }
        
        if (addressbox != null) {
            addressbox.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "EX : No 04, kuda payagala, payagala");
        }
        
        if (nicbox != null) {
            nicbox.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "EX : 200418403077");
        }
        
        if (contactbox != null) {
            contactbox.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "EX : 0702154418");
        }
        
         if (searchbox != null) {
            searchbox.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, " Search");
        }
    }
    ////////////////////insert data///////////////////////////////////////////////////////////////////////////////////////

    private void insertData() {
        String name = namebox.getText().trim();
        String address = addressbox.getText().trim();
        String nic = nicbox.getText().trim();
        String contact = contactbox.getText().trim();

        if (!finalCheck()) {
            return;
        }

        if (isDuplicateRecord(nic, contact, -1)) {
            return;
        }
        int insertConfirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to insert this customer?", "Confirm Insert", JOptionPane.YES_NO_OPTION);
        if (insertConfirm == JOptionPane.YES_OPTION) {
            try {
                String qry = "INSERT INTO customer_info ( name, address ,nic, contact_no) VALUES (?,?, ?,?)";
                PreparedStatement pst = conn.prepareStatement(qry);
                pst.setString(1, name);
                pst.setString(2, address);
                pst.setString(3, nic);
                pst.setString(4, contact);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Customer has been added successfully.");
                setDefault();
                Cleardata();
                ClearValidation();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error while inserting customer: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }

    ////////////////////clear data///////////////////////////////////////////////////////////////////////////////////////
    private void Cleardata() {

        namebox.setText("");
        addressbox.setText("");
        nicbox.setText("");
        contactbox.setText("");

    }
    ////////////////////set data///////////////////////////////////////////////////////////////////////////////////////

    private ArrayList<Customerdetails> getCustomertList(String query) {
        ArrayList<Customerdetails> obj = new ArrayList<>();

        Statement st;
        ResultSet rs;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);

            Customerdetails course;
            while (rs.next()) {
                course = new Customerdetails(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getString("nic"),
                        rs.getString("contact_no")
                );
                obj.add(course);
                ids.add(rs.getInt("id")); // Store IDs
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Cannot display results: " + e.getMessage());
            System.out.println("Cannot display results: " + e.getMessage());
            e.printStackTrace();
        }

        return obj;
    }

    private void setCustomerTableData(String query) {
        model.setRowCount(0);
        ArrayList<Customerdetails> temp = getCustomertList(query);

        for (Customerdetails Customer : temp) {
            int a = Customer.getCustomerid();
            String b = Customer.getCusname();
            String c = Customer.getCusaddress();
            String d = Customer.getCusnic();
            String e = Customer.getContact();

            model.addRow(new Object[]{a, b, c, d, e});
        }
    }

    private void setDefault() {
        String query = "SELECT*FROM customer_info";
        getCustomertList(query);
        setCustomerTableData(query);
    }

    private void hideColumns() {
        table.getColumnModel().getColumn(0).setMinWidth(0);
        table.getColumnModel().getColumn(0).setMaxWidth(0);
        table.getColumnModel().getColumn(0).setWidth(0);

    }

    ////////////////////load data///////////////////////////////////////////////////////////////////////////////////////
    private void loadSelectedCourseData() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            namebox.setText(model.getValueAt(selectedRow, 1).toString());
            addressbox.setText(model.getValueAt(selectedRow, 2).toString());
            nicbox.setText(table.getValueAt(selectedRow, 3).toString());
            contactbox.setText(model.getValueAt(selectedRow, 4).toString());

        } else {
            JOptionPane.showMessageDialog(null, "Please select a Customer from the table.");
        }
    }
    ///////////////////update data/////////////////////////////////////////////////////////////////////////////////////

    private void updateData() {
        int selectedRow = table.getSelectedRow(); // Replace with your JTable variable name
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a customer to update.");
            return;
        }

        // Get ID from the selected row (assuming ID is in column 0)
        int id = (int) table.getValueAt(selectedRow, 0);

        String name = namebox.getText();
        String address = addressbox.getText();
        String nic = nicbox.getText();
        String contact = contactbox.getText();

        try {
            String sql = "UPDATE customer_info SET name=?, address=?, nic=?, contact_no=? WHERE id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, address);
            pst.setString(3, nic);
            pst.setString(4, contact);
            pst.setInt(5, id);

            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                setDefault();
                Cleardata();
                ClearValidation();
                JOptionPane.showMessageDialog(this, "Customer data updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "No customer found with the given ID to update!");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating data: " + e.getMessage());
            e.printStackTrace();
        }
    }

    //////////////////////delete data//////////////////////////////////////////////////////////////////////////////////
    private void deleteData() {
        int selectedRow = table.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a customer from the table.");
            return;
        }

        int check = JOptionPane.showConfirmDialog(this, "Do you want to delete this customer?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

        if (check == 0) {
            try {
                int id = ids.get(selectedRow);

                // Disable foreign key checks
                Statement stmt = conn.createStatement();
                stmt.execute("SET FOREIGN_KEY_CHECKS = 0");

                // Delete the course
                String sqlDeleteCourse = "DELETE FROM customer_info WHERE id = ?";
                PreparedStatement pstDeleteCourse = conn.prepareStatement(sqlDeleteCourse);
                pstDeleteCourse.setInt(1, id);
                pstDeleteCourse.executeUpdate();

                // Re-enable foreign key checks
                stmt.execute("SET FOREIGN_KEY_CHECKS = 1");

                setDefault();
                Cleardata();
                ClearValidation();
                JOptionPane.showMessageDialog(null, "Customer Successfully deleted!");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Unable to delete the customer.");
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    //////////////////search data//////////////////////////////////////////////////////////////////////////////////////////////
    private void searchCustomerData() {
        String searchType = jComboBox1.getSelectedItem().toString(); // Get selected search type from combo box
        String searchValue = searchbox.getText(); // Get the search input from text field

        // Reload all data if search field is empty
        if (searchValue.isEmpty()) {
            setDefault(); // Call method to load all data
            return;
        }

        // Validate search type and value
        if (searchType.equals("Select Search Type")) {
            JOptionPane.showMessageDialog(this, "Please select a valid search type.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = "";
        switch (searchType) {
            case "Id":
                query = "SELECT * FROM customer_info WHERE id LIKE ?";
                break;
            case "Name":
                query = "SELECT * FROM customer_info WHERE name LIKE ?";
                break;
            case "Address":
                query = "SELECT * FROM customer_info WHERE address LIKE ?";
                break;
            case "NIC":
                query = "SELECT * FROM customer_info WHERE nic LIKE ?";
                break;
            case "Contact":
                query = "SELECT * FROM customer_info WHERE contact_no LIKE ?";
                break;
            default:
                JOptionPane.showMessageDialog(this, "Invalid search type selected.", "Input Error", JOptionPane.ERROR_MESSAGE);
                return;
        }

        try {
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, "%" + searchValue + "%"); // Use wildcard for partial match
            ResultSet rs = pst.executeQuery();

            // Clear existing table rows
            model.setRowCount(0);

            // Populate table with search results
            while (rs.next()) {
                Object[] rowData = {
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("address"),
                    rs.getString("nic"),
                    rs.getString("contact_no")};
                model.addRow(rowData);
            }

            // Notify if no results are found
            if (model.getRowCount() == 0) {
                // JOptionPane.showMessageDialog(this, "No customers found matching the search criteria.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(this, "No Course found matching the search criteria.", "Search Result", JOptionPane.INFORMATION_MESSAGE);
            e.printStackTrace();
        }
    }

    /////////////////////Validation/////////////////////////////////////////////////////////////////////////
    private boolean CheckName() {
        if (namebox.getText().isBlank()) {
            namevalidation.setText("Name can not be Empty");
            return false;
        }
        if (!Pattern.matches("^[A-Z][0-9 a-zA-Z,'./-]{1,100}$", namebox.getText())) {
            namevalidation.setText("Enter a valid name: first must start with capital, no numbers.");
            return false;
        }
        namevalidation.setText("");
        return true;
    }

    private boolean CheckAddress() {
        if (addressbox.getText().isBlank()) {
            addressvalidation1.setText("Address can not be Empty");
            return false;
        }
        if (!Pattern.matches("^[A-Z][0-9 a-zA-Z,'./-]{1,100}$", addressbox.getText())) {
            addressvalidation1.setText("Invalid Address first letter must be a capital");
            return false;
        }
        addressvalidation1.setText("");
        return true;
    }

    private boolean CheckNic() {
        if (nicbox.getText().isBlank()) {
            nicvalidation.setText("NIC can not be Empty");
            return false;
        }
        if (!Pattern.matches("^[0-9]{12}$", nicbox.getText())) {
            nicvalidation.setText("Invalid NIC");
            return false;
        }
        nicvalidation.setText("");
        return true;
    }

    private boolean CheckContact() {
        if (contactbox.getText().isBlank()) {
            contactvalidation.setText("Number can not be Empty");
            return false;
        }
        if (!Pattern.matches("^[0-9]{10}$", contactbox.getText())) {
            contactvalidation.setText("Invalid Number");
            return false;
        }
        contactvalidation.setText("");
        return true;
    }

    private boolean finalCheck() {
        if (CheckName() && CheckAddress() && CheckNic() && CheckContact()) {

            return true;

        }
        return false;
    }
///////////////////////Clear Validation//////////////////////////////////////////

    private void ClearValidation() {

        namevalidation.setText("");
        addressvalidation1.setText("");
        nicvalidation.setText("");
        contactvalidation.setText("");

    }

    ///////////////////////Server Validation//////////////////////////////////////////
    private boolean isDuplicateRecord(String nic, String contact, int currentId) {
        try {
            // Check for duplicate nic
            String queryCourseCode = "SELECT COUNT(*) FROM customer_info WHERE nic = ? AND id != ?";
            PreparedStatement pstCustomer = conn.prepareStatement(queryCourseCode);
            pstCustomer.setString(1, nic);
            pstCustomer.setInt(2, currentId);
            ResultSet rsCustomerNic = pstCustomer.executeQuery();

            if (rsCustomerNic.next() && rsCustomerNic.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "The customer NIC already exists. Please use a unique customer NIC.", "Duplicate Customer NIC", JOptionPane.WARNING_MESSAGE);
                return true;
            }

            // Check for duplicate 
            String queryCourseNameLevel = "SELECT COUNT(*) FROM customer_info WHERE contact_no = ? AND id != ?";
            PreparedStatement pstCourseNameLevel = conn.prepareStatement(queryCourseNameLevel);
            pstCourseNameLevel.setString(1, contact);
            pstCourseNameLevel.setInt(2, currentId);
            ResultSet rsCustomerContact = pstCourseNameLevel.executeQuery();

            if (rsCustomerContact.next() && rsCustomerContact.getInt(1) > 0) {
                JOptionPane.showMessageDialog(null, "The customer contact number already exists. Please use a unique customer contct number.", "Duplicate Customer contact number", JOptionPane.WARNING_MESSAGE);
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database error during validation: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressbox;
    private javax.swing.JPanel addressvalidation;
    private javax.swing.JLabel addressvalidation1;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton clearbtn;
    private javax.swing.JTextField contactbox;
    private javax.swing.JLabel contactvalidation;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton exitebtn;
    private javax.swing.JButton insertbtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namebox;
    private javax.swing.JLabel namevalidation;
    private javax.swing.JTextField nicbox;
    private javax.swing.JLabel nicvalidation;
    private javax.swing.JTextField searchbox;
    private javax.swing.JTable table;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
