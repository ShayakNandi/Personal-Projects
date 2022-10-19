package pharmacymanagement;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class mainFrame extends javax.swing.JFrame {

    String attendanceDate, attendanceGrade, editAttendanceGrade, currentLogin, currentLoginType, oldEmail;
    int studentsSize, staffsSize;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public mainFrame() {
        initComponents();
        tbl_editConsumer.setAutoCreateRowSorter(true);
        tab_main.setSelectedComponent(login);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab_main = new javax.swing.JTabbedPane();
        login = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_loginId = new javax.swing.JTextField();
        txt_loginPassword = new javax.swing.JTextField();
        btn_login = new javax.swing.JToggleButton();
        mainMenu = new javax.swing.JPanel();
        btn_manageConsumer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_logOut = new javax.swing.JButton();
        manageConsumer = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_newId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_newName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_newAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_newNumber = new javax.swing.JTextField();
        btn_addSubmit = new javax.swing.JButton();
        btn_editSubmit = new javax.swing.JButton();
        btn_deleteSubmit = new javax.swing.JButton();
        btn_resetForm = new javax.swing.JButton();
        btn_mainMenu = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_editConsumer = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("ID:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel17.setText("Pharmacy Management System");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("Password:");

        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_loginId, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(283, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(148, 148, 148))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel17)
                .addGap(39, 39, 39)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_loginId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        tab_main.addTab("tab7", login);

        mainMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_manageConsumer.setText("Manage Students");
        btn_manageConsumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageConsumerActionPerformed(evt);
            }
        });
        mainMenu.add(btn_manageConsumer, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 192, 171, 56));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel1.setText("Main Menu");
        mainMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(359, 48, -1, 40));

        btn_logOut.setText("Log Out");
        btn_logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logOutActionPerformed(evt);
            }
        });
        mainMenu.add(btn_logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 365, 96, 42));

        tab_main.addTab("tab4", mainMenu);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Manage Student Info");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Id:");

        lbl_newId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Address:");

        txt_newAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_newAddressActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Number:");

        btn_addSubmit.setText("Add");
        btn_addSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addSubmitActionPerformed(evt);
            }
        });

        btn_editSubmit.setText("Edit");
        btn_editSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editSubmitActionPerformed(evt);
            }
        });

        btn_deleteSubmit.setText("Delete");
        btn_deleteSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteSubmitActionPerformed(evt);
            }
        });

        btn_resetForm.setText("Reset");
        btn_resetForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetFormActionPerformed(evt);
            }
        });

        btn_mainMenu.setText("Main Menu");
        btn_mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mainMenuActionPerformed(evt);
            }
        });

        tbl_editConsumer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Address", "Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_editConsumer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_editConsumerMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_editConsumer);

        javax.swing.GroupLayout manageConsumerLayout = new javax.swing.GroupLayout(manageConsumer);
        manageConsumer.setLayout(manageConsumerLayout);
        manageConsumerLayout.setHorizontalGroup(
            manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageConsumerLayout.createSequentialGroup()
                .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageConsumerLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_addSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(btn_editSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deleteSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(manageConsumerLayout.createSequentialGroup()
                        .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageConsumerLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_newNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(manageConsumerLayout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_newName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(manageConsumerLayout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(manageConsumerLayout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl_newId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(manageConsumerLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(btn_mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(manageConsumerLayout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel8))))
                            .addGroup(manageConsumerLayout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addComponent(btn_resetForm, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(manageConsumerLayout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(txt_newAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        manageConsumerLayout.setVerticalGroup(
            manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageConsumerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_newId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_newName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_newAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_newNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_addSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deleteSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btn_resetForm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        tab_main.addTab("tab4", manageConsumer);

        getContentPane().add(tab_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -21, 880, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_manageConsumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageConsumerActionPerformed
        // TODO add your handling code here:
        updateTable("consumer");
        resetForm("consumer");
        tab_main.setSelectedComponent(manageConsumer);
    }//GEN-LAST:event_btn_manageConsumerActionPerformed


    private void btn_resetFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetFormActionPerformed
        // TODO add your handling code here:
        resetForm("consumer");
    }//GEN-LAST:event_btn_resetFormActionPerformed

    private void btn_deleteSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteSubmitActionPerformed
        // TODO add your handling code here:
        String deleteName = txt_newName.getText() + " " + txt_newAddress.getText();
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to \"PERMANENTLY DELETE\" " + deleteName + "'s data", "Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == 1) {
            return;
        }
        manageConsumersClass.deleteConsumer(lbl_newId.getText());
        updateTable("consumer");
        resetForm("consumer");
    }//GEN-LAST:event_btn_deleteSubmitActionPerformed

    private void btn_editSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editSubmitActionPerformed
        // TODO add your handling code here:
        if (!validateData("consumer")) {
            return;
        }
        manageConsumersClass.updateConsumer(txt_newName.getText(), txt_newAddress.getText(), txt_newNumber.getText(), lbl_newId.getText());
        updateTable("consumer");
        resetForm("consumer");
    }//GEN-LAST:event_btn_editSubmitActionPerformed

    private void btn_mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainMenuActionPerformed
        // TODO add your handling code here:
        tab_main.setSelectedComponent(mainMenu);
    }//GEN-LAST:event_btn_mainMenuActionPerformed

    private void tbl_editConsumerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_editConsumerMouseClicked
        // TODO add your handling code here:
        btn_addSubmit.setVisible(false);
        btn_editSubmit.setVisible(true);
        btn_deleteSubmit.setVisible(true);
        int i = tbl_editConsumer.getSelectedRow();
        TableModel model = tbl_editConsumer.getModel();
        lbl_newId.setText(model.getValueAt(i, 0).toString());
        txt_newName.setText(model.getValueAt(i, 1).toString());
        txt_newAddress.setText(model.getValueAt(i, 2).toString());
        txt_newNumber.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_tbl_editConsumerMouseClicked

    private void btn_addSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addSubmitActionPerformed
        // TODO add your handling code here:
        if (!validateData("consumer")) {
            return;
        }
        manageConsumersClass.addConsumer(txt_newName.getText(), txt_newAddress.getText(), txt_newNumber.getText());
        updateTable("consumer");
        resetForm("consumer");
    }//GEN-LAST:event_btn_addSubmitActionPerformed


    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        boolean log = loginClass.login(txt_loginId.getText(), txt_loginPassword.getText());
        if (log == true) {
            currentLogin = txt_loginId.getText();
            tab_main.setSelectedComponent(mainMenu);
            currentLoginType = "consumer";
            txt_loginId.setText("");
            txt_loginPassword.setText("");
        }

    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logOutActionPerformed
        // TODO add your handling code here:
        tab_main.setSelectedComponent(login);
    }//GEN-LAST:event_btn_logOutActionPerformed

    private void txt_newAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_newAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_newAddressActionPerformed

    public void resetForm(String who) {
        btn_addSubmit.setVisible(true);
        btn_editSubmit.setVisible(false);
        btn_deleteSubmit.setVisible(false);
        lbl_newId.setText("");
        txt_newName.setText("");
        txt_newAddress.setText("");
        txt_newNumber.setText("");

    }

    public boolean validateData(String who) {
        boolean name = false, address = false, number = false;
        name = txt_newName.getText().isEmpty();
        address = txt_newAddress.getText().isEmpty();
        number = txt_newNumber.getText().isEmpty();

        if (name || address || number) {
            JOptionPane.showMessageDialog(null, "Make sure none of the fields are empty!");
            return false;
        }
        return true;
    }

    public void updateTable(String who) {
        ArrayList<Users> list = manageConsumersClass.getAllConsumers();
        TableColumnModel columnModel = tbl_editConsumer.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(30);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(80);
        DefaultTableModel tableModel = (DefaultTableModel) tbl_editConsumer.getModel();
        studentsSize = list.size();
        tableModel.setRowCount(0);
        Object[] row = new Object[5];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getAddress();
            row[3] = list.get(i).getNumber();
            tableModel.addRow(row);
        }

    }

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addSubmit;
    private javax.swing.JButton btn_deleteSubmit;
    private javax.swing.JButton btn_editSubmit;
    private javax.swing.JButton btn_logOut;
    private javax.swing.JToggleButton btn_login;
    private javax.swing.JButton btn_mainMenu;
    private javax.swing.JButton btn_manageConsumer;
    private javax.swing.JButton btn_resetForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_newId;
    private javax.swing.JPanel login;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel manageConsumer;
    private javax.swing.JTabbedPane tab_main;
    private javax.swing.JTable tbl_editConsumer;
    private javax.swing.JTextField txt_loginId;
    private javax.swing.JTextField txt_loginPassword;
    private javax.swing.JTextField txt_newAddress;
    private javax.swing.JTextField txt_newName;
    private javax.swing.JTextField txt_newNumber;
    // End of variables declaration//GEN-END:variables
}
