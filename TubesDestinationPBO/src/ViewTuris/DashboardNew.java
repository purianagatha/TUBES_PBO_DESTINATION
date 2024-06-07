package ViewTuris;

import tubesdestinationpbo.LogIn;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DashboardNew extends javax.swing.JFrame {

    public DashboardNew() {
        initComponents();
        list1.setVisible(false);
        jTabbedPaneDashboard.setVisible(false);
        list3.setVisible(false);
        jPanel4.setVisible(false);
    }
    
    private void scaleImage(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/Icon&Image/Profile (2).png"));
        Image img = icon.getImage();
        Image scale = img.getScaledInstance(jLabelForPictureProfile.getWidth(), jLabelForPictureProfile.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scale);
        jLabelForPictureProfile.setIcon(scaledIcon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelDashboard = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        PanelHistoryBooking = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PanelSearch = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PanelProfile = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        PanelLogOut = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanelDashboard = new javax.swing.JPanel();
        list1 = new java.awt.List();
        jTabbedPaneDashboard = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        list2 = new java.awt.List();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanelHistoryBooking = new javax.swing.JPanel();
        list3 = new java.awt.List();
        jPanel4 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jPanelSearch = new javax.swing.JPanel();
        listSearch = new java.awt.List();
        jTabbedPaneSearch = new javax.swing.JTabbedPane();
        jPanel19 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        list5 = new java.awt.List();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jPanelProfile = new javax.swing.JPanel();
        jLabelForPictureProfile = new javax.swing.JLabel();
        jPanelProfileDalam = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanelLogOut = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 102, 102));

        jPanel2.setBackground(new java.awt.Color(3, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TravelTrax");

        PanelDashboard.setBackground(new java.awt.Color(53, 143, 128));
        PanelDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelDashboard.setMaximumSize(null);
        PanelDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelDashboardMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelDashboardMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                PanelDashboardMouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Dashboard");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout PanelDashboardLayout = new javax.swing.GroupLayout(PanelDashboard);
        PanelDashboard.setLayout(PanelDashboardLayout);
        PanelDashboardLayout.setHorizontalGroup(
            PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDashboardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(76, 76, 76))
        );
        PanelDashboardLayout.setVerticalGroup(
            PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelHistoryBooking.setBackground(new java.awt.Color(53, 143, 128));
        PanelHistoryBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelHistoryBookingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelHistoryBookingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelHistoryBookingMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("History Booking");

        javax.swing.GroupLayout PanelHistoryBookingLayout = new javax.swing.GroupLayout(PanelHistoryBooking);
        PanelHistoryBooking.setLayout(PanelHistoryBookingLayout);
        PanelHistoryBookingLayout.setHorizontalGroup(
            PanelHistoryBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHistoryBookingLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelHistoryBookingLayout.setVerticalGroup(
            PanelHistoryBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHistoryBookingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelSearch.setBackground(new java.awt.Color(53, 143, 128));
        PanelSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelSearchMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search");

        javax.swing.GroupLayout PanelSearchLayout = new javax.swing.GroupLayout(PanelSearch);
        PanelSearch.setLayout(PanelSearchLayout);
        PanelSearchLayout.setHorizontalGroup(
            PanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSearchLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelSearchLayout.setVerticalGroup(
            PanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelProfile.setBackground(new java.awt.Color(53, 143, 128));
        PanelProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelProfileMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Profile");

        javax.swing.GroupLayout PanelProfileLayout = new javax.swing.GroupLayout(PanelProfile);
        PanelProfile.setLayout(PanelProfileLayout);
        PanelProfileLayout.setHorizontalGroup(
            PanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelProfileLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(99, 99, 99))
        );
        PanelProfileLayout.setVerticalGroup(
            PanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelLogOut.setBackground(new java.awt.Color(53, 143, 128));
        PanelLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelLogOutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelLogOutMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Log Out");

        javax.swing.GroupLayout PanelLogOutLayout = new javax.swing.GroupLayout(PanelLogOut);
        PanelLogOut.setLayout(PanelLogOutLayout);
        PanelLogOutLayout.setHorizontalGroup(
            PanelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogOutLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLogOutLayout.setVerticalGroup(
            PanelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelDashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelHistoryBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(PanelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelHistoryBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel3.setBackground(new java.awt.Color(3, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jPanel3.setLayout(new java.awt.CardLayout());

        jPanelDashboard.setBackground(new java.awt.Color(3, 102, 102));

        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });

        jTabbedPaneDashboard.setBackground(new java.awt.Color(3, 102, 102));
        jTabbedPaneDashboard.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPaneDashboard.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setText("   ");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Deskripsi Destinasi");

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel27.setText("Lokasi");

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel28.setText("   ");
        jLabel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel29.setText("Harga");

        jLabel30.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel30.setText("   ");
        jLabel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPaneDashboard.addTab("Detail", jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("List Nama Review");

        list2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setText("Nama");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setText("Rating");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel14.setText("Review");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setText("   ");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel16.setText("   ");
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel17.setText("   ");
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(list2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11))
                .addGap(17, 17, 17))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(7, 7, 7)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                    .addComponent(list2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneDashboard.addTab("Review & Rating", jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel18.setText("Nama Lengkap");

        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel19.setText("No.Hp");

        jTextField2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel20.setText("Pilih Tanggal");

        jTextField3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel21.setText("Payment Methods");

        jRadioButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jRadioButton1.setText("PayPal");

        jRadioButton2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jRadioButton2.setText("BCA");

        jRadioButton3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jRadioButton3.setText("ShoppePay");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18)
                    .addComponent(jTextField1)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2)
                    .addComponent(jLabel20)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPaneDashboard.addTab("Booking", jPanel15);

        javax.swing.GroupLayout jPanelDashboardLayout = new javax.swing.GroupLayout(jPanelDashboard);
        jPanelDashboard.setLayout(jPanelDashboardLayout);
        jPanelDashboardLayout.setHorizontalGroup(
            jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDashboardLayout.setVerticalGroup(
            jPanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneDashboard)
                .addContainerGap())
        );

        jPanel3.add(jPanelDashboard, "card2");

        jPanelHistoryBooking.setBackground(new java.awt.Color(3, 102, 102));

        jPanel4.setBackground(new java.awt.Color(3, 102, 102));

        jLabel64.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Nama Destinasi Wisata");

        jLabel65.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("  ");
        jLabel65.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel66.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Kode Pemesanan");

        jLabel67.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("   ");
        jLabel67.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel68.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Tanggal Pemesanan");

        jLabel69.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("   ");
        jLabel69.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(jLabel66)
                    .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addGap(18, 18, 18)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel67)
                .addGap(18, 18, 18)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelHistoryBookingLayout = new javax.swing.GroupLayout(jPanelHistoryBooking);
        jPanelHistoryBooking.setLayout(jPanelHistoryBookingLayout);
        jPanelHistoryBookingLayout.setHorizontalGroup(
            jPanelHistoryBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHistoryBookingLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelHistoryBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(list3, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanelHistoryBookingLayout.setVerticalGroup(
            jPanelHistoryBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHistoryBookingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(list3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanelHistoryBooking, "card3");

        jPanelSearch.setBackground(new java.awt.Color(3, 102, 102));

        listSearch.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jTabbedPaneSearch.setBackground(new java.awt.Color(3, 102, 102));
        jTabbedPaneSearch.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPaneSearch.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jLabel43.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel43.setText("   ");
        jLabel43.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel44.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel44.setText("Deskripsi Destinasi");

        jLabel45.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel45.setText("Lokasi");

        jLabel46.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel46.setText("   ");
        jLabel46.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel47.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel47.setText("Harga");

        jLabel48.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel48.setText("   ");
        jLabel48.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel44)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPaneSearch.addTab("Detail", jPanel19);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel49.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel49.setText("List Nama Review");

        list5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel50.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel50.setText("Nama");

        jLabel51.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel51.setText("Rating");

        jLabel52.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel52.setText("Review");

        jLabel53.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel53.setText("   ");
        jLabel53.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel54.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel54.setText("   ");
        jLabel54.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel55.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel55.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(list5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel49))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addGap(7, 7, 7)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(jLabel53))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(jLabel54))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                    .addComponent(list5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneSearch.addTab("Review & Rating", jPanel20);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel56.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel56.setText("Nama Lengkap");

        jTextField5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel57.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel57.setText("No.Hp");

        jTextField6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jLabel58.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel58.setText("Pilih Tanggal");

        jTextField7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jLabel59.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel59.setText("Payment Methods");

        jRadioButton4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jRadioButton4.setText("PayPal");

        jRadioButton5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jRadioButton5.setText("BCA");

        jRadioButton6.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jRadioButton6.setText("ShoppePay");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton5)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel56)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6)
                    .addComponent(jLabel58)
                    .addComponent(jTextField7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPaneSearch.addTab("Booking", jPanel21);

        jTextFieldSearch.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTextFieldSearch.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldSearch.setText("Search your destination");

        jButtonSearch.setText("Search");

        javax.swing.GroupLayout jPanelSearchLayout = new javax.swing.GroupLayout(jPanelSearch);
        jPanelSearch.setLayout(jPanelSearchLayout);
        jPanelSearchLayout.setHorizontalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneSearch)
                .addContainerGap())
            .addGroup(jPanelSearchLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSearchLayout.createSequentialGroup()
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSearch)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSearchLayout.setVerticalGroup(
            jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSearchLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPaneSearch)
                .addContainerGap())
        );

        jPanel3.add(jPanelSearch, "card4");

        jPanelProfile.setBackground(new java.awt.Color(3, 102, 102));

        jLabelForPictureProfile.setText("jLabel10");
        jLabelForPictureProfile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jPanelProfileDalam.setBackground(new java.awt.Color(3, 102, 102));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username");

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("   ");
        jLabel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Email");

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("   ");
        jLabel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));

        javax.swing.GroupLayout jPanelProfileDalamLayout = new javax.swing.GroupLayout(jPanelProfileDalam);
        jPanelProfileDalam.setLayout(jPanelProfileDalamLayout);
        jPanelProfileDalamLayout.setHorizontalGroup(
            jPanelProfileDalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileDalamLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelProfileDalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanelProfileDalamLayout.setVerticalGroup(
            jPanelProfileDalamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileDalamLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(35, 35, 35)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelProfileLayout = new javax.swing.GroupLayout(jPanelProfile);
        jPanelProfile.setLayout(jPanelProfileLayout);
        jPanelProfileLayout.setHorizontalGroup(
            jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelForPictureProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelProfileDalam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelProfileLayout.setVerticalGroup(
            jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProfileLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelProfileDalam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelForPictureProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(jPanelProfile, "card5");

        jPanelLogOut.setBackground(new java.awt.Color(3, 102, 102));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LOGOUT");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("TRAVELTRAX");

        javax.swing.GroupLayout jPanelLogOutLayout = new javax.swing.GroupLayout(jPanelLogOut);
        jPanelLogOut.setLayout(jPanelLogOutLayout);
        jPanelLogOutLayout.setHorizontalGroup(
            jPanelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogOutLayout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(jPanelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogOutLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogOutLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(104, 104, 104))))
        );
        jPanelLogOutLayout.setVerticalGroup(
            jPanelLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogOutLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel10)
                .addGap(36, 36, 36)
                .addComponent(jLabel25)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jPanel3.add(jPanelLogOut, "card6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelDashboardMouseEntered
        PanelDashboard.setBackground(new Color(86, 171, 145));
    }//GEN-LAST:event_PanelDashboardMouseEntered

    private void PanelDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelDashboardMouseExited
        PanelDashboard.setBackground(new Color(53,143,128));
    }//GEN-LAST:event_PanelDashboardMouseExited

    private void PanelDashboardMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelDashboardMousePressed
        PanelDashboard.setBackground(new Color(53,143,128));
    }//GEN-LAST:event_PanelDashboardMousePressed

    private void PanelDashboardMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelDashboardMouseReleased
        PanelDashboard.setBackground(new Color(86, 171, 145));
    }//GEN-LAST:event_PanelDashboardMouseReleased

    private void PanelHistoryBookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelHistoryBookingMouseEntered
        PanelHistoryBooking.setBackground(new Color(86, 171, 145));
    }//GEN-LAST:event_PanelHistoryBookingMouseEntered

    private void PanelHistoryBookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelHistoryBookingMouseExited
        PanelHistoryBooking.setBackground(new Color(53,143,128));
    }//GEN-LAST:event_PanelHistoryBookingMouseExited

    private void PanelSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSearchMouseEntered
        PanelSearch.setBackground(new Color(86, 171, 145));
    }//GEN-LAST:event_PanelSearchMouseEntered

    private void PanelSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSearchMouseExited
        PanelSearch.setBackground(new Color(53,143,128));
    }//GEN-LAST:event_PanelSearchMouseExited

    private void PanelProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelProfileMouseEntered
        PanelProfile.setBackground(new Color(86, 171, 145));
    }//GEN-LAST:event_PanelProfileMouseEntered

    private void PanelProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelProfileMouseExited
        PanelProfile.setBackground(new Color(53,143,128));
    }//GEN-LAST:event_PanelProfileMouseExited

    private void PanelLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelLogOutMouseEntered
        PanelLogOut.setBackground(new Color(86, 171, 145));
    }//GEN-LAST:event_PanelLogOutMouseEntered

    private void PanelLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelLogOutMouseExited
        PanelLogOut.setBackground(new Color(53,143,128));
    }//GEN-LAST:event_PanelLogOutMouseExited

    private void PanelDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelDashboardMouseClicked
        jPanelSearch.setVisible(false);
        jPanelProfile.setVisible(false);
        jPanelLogOut.setVisible(false);
        jPanelHistoryBooking.setVisible(false);
        jPanelDashboard.setVisible(true);
        list1.setVisible(true);
        jTabbedPaneDashboard.setVisible(true);
    }//GEN-LAST:event_PanelDashboardMouseClicked

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        
    }//GEN-LAST:event_list1ActionPerformed

    private void PanelHistoryBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelHistoryBookingMouseClicked
        jPanelDashboard.setVisible(false);
        jPanelSearch.setVisible(false);
        jPanelProfile.setVisible(false);
        jPanelLogOut.setVisible(false);
        jPanelHistoryBooking.setVisible(true);
        list3.setVisible(true);
        jPanel4.setVisible(true);
        
    }//GEN-LAST:event_PanelHistoryBookingMouseClicked

    private void PanelSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSearchMouseClicked
        jPanelDashboard.setVisible(false);
        jPanelProfile.setVisible(false);
        jPanelLogOut.setVisible(false);
        jPanelHistoryBooking.setVisible(false);
        jPanelSearch.setVisible(true);
        jTextFieldSearch.setVisible(true);
        jButtonSearch.setVisible(true);
        listSearch.setVisible(true);
        jTabbedPaneSearch.setVisible(true);
    }//GEN-LAST:event_PanelSearchMouseClicked

    private void PanelProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelProfileMouseClicked
        jPanelDashboard.setVisible(false);
        jPanelHistoryBooking.setVisible(false);
        jPanelSearch.setVisible(false);
        jPanelLogOut.setVisible(false);
        jPanelProfile.setVisible(true);
        jLabelForPictureProfile.setVisible(true);
        jPanelProfileDalam.setVisible(true);
    }//GEN-LAST:event_PanelProfileMouseClicked

    private void PanelLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelLogOutMouseClicked
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Apakah anda yakin akan Log Out?");
        if (dialogResult == 0){
            LogIn logIn = new LogIn();
            logIn.setVisible(true);
            this.setVisible(false);
        }else{
            this.setVisible(true);
        }
        
    }//GEN-LAST:event_PanelLogOutMouseClicked

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
            java.util.logging.Logger.getLogger(DashboardNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardNew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDashboard;
    private javax.swing.JPanel PanelHistoryBooking;
    private javax.swing.JPanel PanelLogOut;
    private javax.swing.JPanel PanelProfile;
    private javax.swing.JPanel PanelSearch;
    private javax.swing.JButton jButtonSearch;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelForPictureProfile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelDashboard;
    private javax.swing.JPanel jPanelHistoryBooking;
    private javax.swing.JPanel jPanelLogOut;
    private javax.swing.JPanel jPanelProfile;
    private javax.swing.JPanel jPanelProfileDalam;
    private javax.swing.JPanel jPanelSearch;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JTabbedPane jTabbedPaneDashboard;
    private javax.swing.JTabbedPane jTabbedPaneSearch;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextFieldSearch;
    private java.awt.List list1;
    private java.awt.List list2;
    private java.awt.List list3;
    private java.awt.List list5;
    private java.awt.List listSearch;
    // End of variables declaration//GEN-END:variables

}
