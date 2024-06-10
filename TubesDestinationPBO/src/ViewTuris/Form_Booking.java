/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ViewTuris;

import Database.Database;
import Model.*;
import controller.PesanTiket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author puris
 */
public class Form_Booking extends javax.swing.JPanel {

    private ArrayList<TempatWisata> destinasi;
    private DefaultListModel tabelDestinasi;
    

    public Form_Booking() {
        initComponents();
        destinasi = new ArrayList();
        tabelDestinasi = new DefaultListModel();
        
        BNI.setActionCommand("BNI");
        BCA.setActionCommand("BCA");
        DANA.setActionCommand("DANA");
        PayPal.setActionCommand("PayPal");
        
        ShowTabel();
        btnPesan.addActionListener(evt -> handleBooking()); 
    }

    private void handleBooking() {
        String paymentMethod =  buttonGroup1.isSelected(BCA.getModel()) || buttonGroup1.isSelected(BNI.getModel()) || buttonGroup1.isSelected(DANA.getModel()) || buttonGroup1.isSelected(PayPal.getModel())
                                ? buttonGroup1.getSelection().getActionCommand() 
                                : "";  
                
        if (paymentMethod.isEmpty()) {
             JOptionPane.showMessageDialog(null, "Silahkan pilih 1 metode pembayaran");
        } else {
            System.out.println("tes : " + textNama.getText() +  textNo.getText() + textTanggal.getText());
            PesanTiket controllerBooking = new PesanTiket(listDestinasi, textNama, textNo, textTanggal, btnPesan, paymentMethod);
            controllerBooking.actionPerformed(null);
        }
    
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listDestinasi = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        textNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textNo = new javax.swing.JTextField();
        textTanggal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BCA = new javax.swing.JRadioButton();
        PayPal = new javax.swing.JRadioButton();
        DANA = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        BNI = new javax.swing.JRadioButton();
        btnPesan = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(227, 242, 253));

        jScrollPane1.setViewportView(listDestinasi);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Nama Lengkap");

        textNama.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textNama.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Nomor Handphone");

        textNo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textNo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        textTanggal.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textTanggal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Payment Methods");

        buttonGroup1.add(BCA);
        BCA.setText("BCA");
        BCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCAActionPerformed(evt);
            }
        });

        buttonGroup1.add(PayPal);
        PayPal.setText("PayPal");
        PayPal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PayPalActionPerformed(evt);
            }
        });

        buttonGroup1.add(DANA);
        DANA.setText("DANA");
        DANA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DANAActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Pilih Tanggal");

        buttonGroup1.add(BNI);
        BNI.setText("BNI");
        BNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNIActionPerformed(evt);
            }
        });

        btnPesan.setBackground(new java.awt.Color(144, 202, 249));
        btnPesan.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnPesan.setText("Pesan Tiket");
        btnPesan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        btnPesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(146, 146, 146))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(textNo, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(56, 56, 56))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(textTanggal)
                                            .addGap(56, 56, 56))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DANA)
                                        .addGap(215, 215, 215))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BNI)
                                            .addComponent(PayPal)
                                            .addComponent(BCA))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(btnPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(BNI)
                        .addGap(18, 18, 18)
                        .addComponent(BCA)
                        .addGap(18, 18, 18)
                        .addComponent(DANA)
                        .addGap(18, 18, 18)
                        .addComponent(PayPal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btnPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesanActionPerformed

    }//GEN-LAST:event_btnPesanActionPerformed

    private void BNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNIActionPerformed
        BNI.setActionCommand("BNI");
    }//GEN-LAST:event_BNIActionPerformed

    private void BCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCAActionPerformed
        BCA.setActionCommand("BCA");
    }//GEN-LAST:event_BCAActionPerformed

    private void DANAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DANAActionPerformed
        DANA.setActionCommand("DANA");
    }//GEN-LAST:event_DANAActionPerformed

    private void PayPalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PayPalActionPerformed
        PayPal.setActionCommand("PayPal");
    }//GEN-LAST:event_PayPalActionPerformed

    public void ShowTabel() {
        try {
            Database db = new Database();
            String sql = "select * from tempat_Wisata";
            ResultSet rs = db.getData(sql);
            while (rs.next()) {
                TempatWisata tw = new TempatWisata(rs.getString("nama_destinasi"), rs.getString("deskripsi_destinasi"), rs.getString("lokasi_destinasi"), rs.getInt("harga_destinasi"));
                destinasi.add(tw);
                tabelDestinasi.addElement(tw.getNamaDestinasi());
            }
            listDestinasi.setModel(tabelDestinasi);
        } catch (SQLException ex) {
            Logger.getLogger(Form_Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BCA;
    private javax.swing.JRadioButton BNI;
    private javax.swing.JRadioButton DANA;
    private javax.swing.JRadioButton PayPal;
    private javax.swing.JButton btnPesan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listDestinasi;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textNo;
    private javax.swing.JTextField textTanggal;
    // End of variables declaration//GEN-END:variables
}
