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
        tbl_Consumer.setAutoCreateRowSorter(true);
        tab_main.setSelectedComponent(login);
        setResizable(false);
        btn_manageProducer.setVisible(false);
        btn_manageProduct.setVisible(false);
        btn_manageConsumer.setVisible(false);
        jLabel1.setVisible(false);
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
        manageConsumer = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbl_CId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_CName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_CAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_CNumber = new javax.swing.JTextField();
        btn_CAdd = new javax.swing.JButton();
        btn_CEdit = new javax.swing.JButton();
        btn_CDelete = new javax.swing.JButton();
        btn_CReset = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_Consumer = new javax.swing.JTable();
        manageProducer = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lbl_PId = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_PName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_PAddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_PNumber = new javax.swing.JTextField();
        btn_PAdd = new javax.swing.JButton();
        btn_PEdit = new javax.swing.JButton();
        btn_PDelete = new javax.swing.JButton();
        btn_PReset = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_Producer = new javax.swing.JTable();
        manageProducts = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbl_PDId = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_PDName = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_PDQuantity = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_PDPrice = new javax.swing.JTextField();
        btn_PDAdd = new javax.swing.JButton();
        btn_PDEdit = new javax.swing.JButton();
        btn_PDDelete = new javax.swing.JButton();
        btn_PDReset = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbl_Products = new javax.swing.JTable();
        btn_manageConsumer = new javax.swing.JButton();
        btn_manageProducer = new javax.swing.JButton();
        btn_manageProduct = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 140));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(148, 148, 148))
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_loginId, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(37, 37, 37)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        tab_main.addTab("tab7", login);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Id:");

        lbl_CId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name:");

        txt_CName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CNameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Address:");

        txt_CAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CAddressActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Number:");

        btn_CAdd.setText("Add");
        btn_CAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CAddActionPerformed(evt);
            }
        });

        btn_CEdit.setText("Edit");
        btn_CEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CEditActionPerformed(evt);
            }
        });

        btn_CDelete.setText("Delete");
        btn_CDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CDeleteActionPerformed(evt);
            }
        });

        btn_CReset.setText("Reset");
        btn_CReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CResetActionPerformed(evt);
            }
        });

        tbl_Consumer.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_Consumer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ConsumerMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbl_Consumer);

        javax.swing.GroupLayout manageConsumerLayout = new javax.swing.GroupLayout(manageConsumer);
        manageConsumer.setLayout(manageConsumerLayout);
        manageConsumerLayout.setHorizontalGroup(
            manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageConsumerLayout.createSequentialGroup()
                .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(manageConsumerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(manageConsumerLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(manageConsumerLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txt_CNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btn_CReset, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(btn_CEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_CDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(manageConsumerLayout.createSequentialGroup()
                                .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(manageConsumerLayout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_CAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, manageConsumerLayout.createSequentialGroup()
                                        .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_CName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_CId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_CAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        manageConsumerLayout.setVerticalGroup(
            manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageConsumerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageConsumerLayout.createSequentialGroup()
                        .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_CId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_CName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_CAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageConsumerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_CEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_CDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(manageConsumerLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_CAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(manageConsumerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_CNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_CReset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        tab_main.addTab("tab4", manageConsumer);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Id:");

        lbl_PId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Name:");

        txt_PName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PNameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Address:");

        txt_PAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PAddressActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Number:");

        btn_PAdd.setText("Add");
        btn_PAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PAddActionPerformed(evt);
            }
        });

        btn_PEdit.setText("Edit");
        btn_PEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PEditActionPerformed(evt);
            }
        });

        btn_PDelete.setText("Delete");
        btn_PDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PDeleteActionPerformed(evt);
            }
        });

        btn_PReset.setText("Reset");
        btn_PReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PResetActionPerformed(evt);
            }
        });

        tbl_Producer.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_Producer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ProducerMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbl_Producer);

        javax.swing.GroupLayout manageProducerLayout = new javax.swing.GroupLayout(manageProducer);
        manageProducer.setLayout(manageProducerLayout);
        manageProducerLayout.setHorizontalGroup(
            manageProducerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageProducerLayout.createSequentialGroup()
                .addGroup(manageProducerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(manageProducerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(manageProducerLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(manageProducerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(manageProducerLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txt_PNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btn_PReset, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(btn_PEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_PDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(manageProducerLayout.createSequentialGroup()
                                .addGroup(manageProducerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(manageProducerLayout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_PAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, manageProducerLayout.createSequentialGroup()
                                        .addGroup(manageProducerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(manageProducerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_PName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_PId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_PAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        manageProducerLayout.setVerticalGroup(
            manageProducerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageProducerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageProducerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageProducerLayout.createSequentialGroup()
                        .addGroup(manageProducerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_PId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(manageProducerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_PName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_PAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(manageProducerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageProducerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(manageProducerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_PEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_PDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(manageProducerLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(manageProducerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_PAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(manageProducerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_PNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_PReset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        tab_main.addTab("tab4", manageProducer);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Id:");

        lbl_PDId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Name:");

        txt_PDName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PDNameActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Quantity:");

        txt_PDQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PDQuantityActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Price:");

        btn_PDAdd.setText("Add");
        btn_PDAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PDAddActionPerformed(evt);
            }
        });

        btn_PDEdit.setText("Edit");
        btn_PDEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PDEditActionPerformed(evt);
            }
        });

        btn_PDDelete.setText("Delete");
        btn_PDDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PDDeleteActionPerformed(evt);
            }
        });

        btn_PDReset.setText("Reset");
        btn_PDReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PDResetActionPerformed(evt);
            }
        });

        tbl_Products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Name", "Quantity", "Price"
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
        tbl_Products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ProductsMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbl_Products);

        javax.swing.GroupLayout manageProductsLayout = new javax.swing.GroupLayout(manageProducts);
        manageProducts.setLayout(manageProductsLayout);
        manageProductsLayout.setHorizontalGroup(
            manageProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageProductsLayout.createSequentialGroup()
                .addGroup(manageProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(manageProductsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(manageProductsLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(manageProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(manageProductsLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(txt_PDPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_PDReset, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(btn_PDEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_PDDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(manageProductsLayout.createSequentialGroup()
                                .addGroup(manageProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, manageProductsLayout.createSequentialGroup()
                                        .addGroup(manageProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(manageProductsLayout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, manageProductsLayout.createSequentialGroup()
                                                .addComponent(jLabel13)
                                                .addGap(18, 18, 18)))
                                        .addGroup(manageProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_PDName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_PDId, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(manageProductsLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_PDQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_PDAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        manageProductsLayout.setVerticalGroup(
            manageProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(manageProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageProductsLayout.createSequentialGroup()
                        .addGroup(manageProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_PDId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(manageProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_PDName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_PDAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(manageProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageProductsLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(manageProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_PDEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_PDDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(manageProductsLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(manageProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_PDQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(manageProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_PDPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_PDReset, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        tab_main.addTab("tab4", manageProducts);

        getContentPane().add(tab_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, -21, 690, 460));

        btn_manageConsumer.setText("Manage Consumer");
        btn_manageConsumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageConsumerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_manageConsumer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, -1));

        btn_manageProducer.setText("Manage Producer");
        btn_manageProducer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageProducerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_manageProducer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, -1));

        btn_manageProduct.setText("Manage Product");
        btn_manageProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_manageProductActionPerformed(evt);
            }
        });
        getContentPane().add(btn_manageProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 90, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        boolean log = loginClass.login(txt_loginId.getText(), txt_loginPassword.getText());
        if (log == true) {
            currentLogin = txt_loginId.getText();
            updateTable("consumer");
            resetForm("consumer");
            tab_main.setSelectedComponent(manageConsumer);
            txt_loginId.setText("");
            txt_loginPassword.setText("");
            btn_manageProducer.setVisible(true);
            btn_manageProduct.setVisible(true);
            btn_manageConsumer.setVisible(true);
            jLabel1.setVisible(true);
        }

    }//GEN-LAST:event_btn_loginActionPerformed

    private void tbl_ConsumerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ConsumerMouseClicked
        // TODO add your handling code here:
        btn_CAdd.setVisible(false);
        btn_CEdit.setVisible(true);
        btn_CDelete.setVisible(true);
        int i = tbl_Consumer.getSelectedRow();
        TableModel model = tbl_Consumer.getModel();
        lbl_CId.setText(model.getValueAt(i, 0).toString());
        txt_CName.setText(model.getValueAt(i, 1).toString());
        txt_CAddress.setText(model.getValueAt(i, 2).toString());
        txt_CNumber.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_tbl_ConsumerMouseClicked

    private void btn_CResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CResetActionPerformed
        // TODO add your handling code here:
        resetForm("consumer");
    }//GEN-LAST:event_btn_CResetActionPerformed

    private void btn_CDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CDeleteActionPerformed
        // TODO add your handling code here:
        String deleteName = txt_CName.getText() + " " + txt_CAddress.getText();
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to \"PERMANENTLY DELETE\" " + deleteName + "'s data", "Delete", JOptionPane.YES_NO_OPTION);
        if (confirm == 1) {
            return;
        }
        manageConsumersClass.deleteConsumer(lbl_CId.getText());
        updateTable("consumer");
        resetForm("consumer");
    }//GEN-LAST:event_btn_CDeleteActionPerformed

    private void btn_CEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CEditActionPerformed
        // TODO add your handling code here:
        if (!validateData("consumer")) {
            return;
        }
        manageConsumersClass.updateConsumer(txt_CName.getText(), txt_CAddress.getText(), txt_CNumber.getText(), lbl_CId.getText());
        updateTable("consumer");
        resetForm("consumer");
    }//GEN-LAST:event_btn_CEditActionPerformed

    private void btn_CAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CAddActionPerformed
        // TODO add your handling code here:
        if (!validateData("consumer")) {
            return;
        }
        manageConsumersClass.addConsumer(txt_CName.getText(), txt_CAddress.getText(), txt_CNumber.getText());
        updateTable("consumer");
        resetForm("consumer");
    }//GEN-LAST:event_btn_CAddActionPerformed

    private void txt_CAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CAddressActionPerformed

    private void txt_CNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CNameActionPerformed

    private void txt_PNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PNameActionPerformed

    private void txt_PAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PAddressActionPerformed

    private void btn_PAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PAddActionPerformed
        // TODO add your handling code here:
        if (!validateData("producer")) {
            return;
        }
        manageProducerClass.addProducer(txt_PName.getText(), txt_PAddress.getText(), txt_PNumber.getText());
        updateTable("producer");
        resetForm("producer");
    }//GEN-LAST:event_btn_PAddActionPerformed

    private void btn_PEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PEditActionPerformed
        // TODO add your handling code here:
        if (!validateData("producer")) {
            return;
        }
        manageProducerClass.updateProducer(txt_PName.getText(), txt_PAddress.getText(), txt_PNumber.getText(), lbl_PId.getText());
        updateTable("producer");
        resetForm("producer");
    }//GEN-LAST:event_btn_PEditActionPerformed

    private void btn_PDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PDeleteActionPerformed
        // TODO add your handling code here:
        if (!validateData("producer")) {
            return;
        }
        manageProducerClass.deleteProducer(lbl_PId.getText());
        updateTable("producer");
        resetForm("producer");
    }//GEN-LAST:event_btn_PDeleteActionPerformed

    private void btn_PResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PResetActionPerformed
        // TODO add your handling code here:
        resetForm("producer");
    }//GEN-LAST:event_btn_PResetActionPerformed

    private void tbl_ProducerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ProducerMouseClicked
        // TODO add your handling code here:
        btn_PAdd.setVisible(false);
        btn_PEdit.setVisible(true);
        btn_PDelete.setVisible(true);
        int i = tbl_Producer.getSelectedRow();
        TableModel model = tbl_Producer.getModel();
        lbl_PId.setText(model.getValueAt(i, 0).toString());
        txt_PName.setText(model.getValueAt(i, 1).toString());
        txt_PAddress.setText(model.getValueAt(i, 2).toString());
        txt_PNumber.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_tbl_ProducerMouseClicked

    private void txt_PDNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PDNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PDNameActionPerformed

    private void txt_PDQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PDQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PDQuantityActionPerformed

    private void btn_PDAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PDAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_PDAddActionPerformed

    private void btn_PDEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PDEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_PDEditActionPerformed

    private void btn_PDDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PDDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_PDDeleteActionPerformed

    private void btn_PDResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PDResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_PDResetActionPerformed

    private void tbl_ProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ProductsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_ProductsMouseClicked

    private void btn_manageProducerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageProducerActionPerformed
        // TODO add your handling code here:
        tab_main.setSelectedComponent(manageProducer);
        updateTable("producer");
        resetForm("producer");
    }//GEN-LAST:event_btn_manageProducerActionPerformed

    private void btn_manageProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageProductActionPerformed
        // TODO add your handling code here:
        tab_main.setSelectedComponent(manageProducts);
        updateTable("product");
        resetForm("product");
    }//GEN-LAST:event_btn_manageProductActionPerformed

    private void btn_manageConsumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_manageConsumerActionPerformed
        // TODO add your handling code here:
        tab_main.setSelectedComponent(manageConsumer);
        updateTable("consumer");
        resetForm("consumer");
    }//GEN-LAST:event_btn_manageConsumerActionPerformed

    public void resetForm(String who) {
        switch (who) {
            case "consumer" -> {
                btn_CAdd.setVisible(true);
                btn_CEdit.setVisible(false);
                btn_CDelete.setVisible(false);
                lbl_CId.setText("");
                txt_CName.setText("");
                txt_CAddress.setText("");
                txt_CNumber.setText("");
            }
            case "producer" -> {
                btn_PAdd.setVisible(true);
                btn_PEdit.setVisible(false);
                btn_PDelete.setVisible(false);
                lbl_PId.setText("");
                txt_PName.setText("");
                txt_PAddress.setText("");
                txt_PNumber.setText("");
            }
            case "product" -> {
                btn_PDAdd.setVisible(true);
                btn_PDEdit.setVisible(false);
                btn_PDDelete.setVisible(false);
                lbl_PDId.setText("");
                txt_PDName.setText("");
                txt_PDQuantity.setText("");
                txt_PDPrice.setText("");
            }
        }

    }

    public boolean validateData(String who) {
        boolean name = false, address = false, number = false;
        name = txt_CName.getText().isEmpty();
        address = txt_CAddress.getText().isEmpty();
        number = txt_CNumber.getText().isEmpty();
        if (name || address || number) {
            JOptionPane.showMessageDialog(null, "Make sure none of the fields are empty!");
            return true;
        }
        return true;
    }

    public void updateTable(String who) {
        switch (who) {
            case "consumer" -> {
                ArrayList<Users> list = manageConsumersClass.getAllConsumers();
                TableColumnModel columnModel = tbl_Consumer.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(30);
                columnModel.getColumn(1).setPreferredWidth(100);
                columnModel.getColumn(2).setPreferredWidth(100);
                columnModel.getColumn(3).setPreferredWidth(80);
                DefaultTableModel tableModel = (DefaultTableModel) tbl_Consumer.getModel();
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
            case "producer" -> {
                ArrayList<Users> list = manageProducerClass.getAllProducers();
                TableColumnModel columnModel = tbl_Producer.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(30);
                columnModel.getColumn(1).setPreferredWidth(100);
                columnModel.getColumn(2).setPreferredWidth(100);
                columnModel.getColumn(3).setPreferredWidth(80);
                DefaultTableModel tableModel = (DefaultTableModel) tbl_Producer.getModel();
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
            case "product" -> {
                ArrayList<Users> list = manageProductClass.getAllProducts();
                TableColumnModel columnModel = tbl_Products.getColumnModel();
                columnModel.getColumn(0).setPreferredWidth(30);
                columnModel.getColumn(1).setPreferredWidth(100);
                columnModel.getColumn(2).setPreferredWidth(100);
                columnModel.getColumn(3).setPreferredWidth(80);
                DefaultTableModel tableModel = (DefaultTableModel) tbl_Products.getModel();
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
            java.util.logging.Logger.getLogger(mainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CAdd;
    private javax.swing.JButton btn_CDelete;
    private javax.swing.JButton btn_CEdit;
    private javax.swing.JButton btn_CReset;
    private javax.swing.JButton btn_PAdd;
    private javax.swing.JButton btn_PDAdd;
    private javax.swing.JButton btn_PDDelete;
    private javax.swing.JButton btn_PDEdit;
    private javax.swing.JButton btn_PDReset;
    private javax.swing.JButton btn_PDelete;
    private javax.swing.JButton btn_PEdit;
    private javax.swing.JButton btn_PReset;
    private javax.swing.JToggleButton btn_login;
    private javax.swing.JButton btn_manageConsumer;
    private javax.swing.JButton btn_manageProducer;
    private javax.swing.JButton btn_manageProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lbl_CId;
    private javax.swing.JLabel lbl_PDId;
    private javax.swing.JLabel lbl_PId;
    private javax.swing.JPanel login;
    private javax.swing.JPanel manageConsumer;
    private javax.swing.JPanel manageProducer;
    private javax.swing.JPanel manageProducts;
    private javax.swing.JTabbedPane tab_main;
    private javax.swing.JTable tbl_Consumer;
    private javax.swing.JTable tbl_Producer;
    private javax.swing.JTable tbl_Products;
    private javax.swing.JTextField txt_CAddress;
    private javax.swing.JTextField txt_CName;
    private javax.swing.JTextField txt_CNumber;
    private javax.swing.JTextField txt_PAddress;
    private javax.swing.JTextField txt_PDName;
    private javax.swing.JTextField txt_PDPrice;
    private javax.swing.JTextField txt_PDQuantity;
    private javax.swing.JTextField txt_PName;
    private javax.swing.JTextField txt_PNumber;
    private javax.swing.JTextField txt_loginId;
    private javax.swing.JTextField txt_loginPassword;
    // End of variables declaration//GEN-END:variables
}
