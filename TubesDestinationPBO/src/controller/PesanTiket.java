package controller;

import Database.*;
import static Model.CurrentUser.getEmail;
import Model.*;
import static Model.CurrentUser.getIDTuris;
import Model.Tiket;
import ViewTuris.Form_Home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ginas
 */
public class PesanTiket implements ActionListener {

    private JList listDestinasi = new JList();
    private JTextField namaTuris = new JTextField();
    private JTextField noTelp = new JTextField();
    private JTextField tanggal = new JTextField();
    private JButton button = new JButton();
    private ArrayList<TempatWisata> destinasi = new ArrayList();
    private DefaultListModel tabelDestinasi = new DefaultListModel();
    private ArrayList<Tiket> tabelTiket = new ArrayList();
    public ResultSet rs;
    public Tiket tiket = new Tiket();
    TempatWisata tw = new TempatWisata();
    private String metodePembayaran;
    

    public PesanTiket(JList listDestinasi, JTextField namaTuris, JTextField noTelp, JTextField tanggal, JButton button, String metodePembayaran) {
        this.listDestinasi = listDestinasi;
        this.namaTuris = namaTuris;
        this.noTelp = noTelp;
        this.tanggal = tanggal;
        this.button = button;
        this.button.addActionListener(this);
        this.metodePembayaran = metodePembayaran;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        int idx = listDestinasi.getSelectedIndex();
       
        System.out.println("Selected index: " + idx);
        
        try {
            System.out.println(getIDTuris());
        } catch (SQLException ex) {
            System.out.println("aaaaaaaa" + ex.getMessage());
        }
        
        if (idx != -1) {
            System.out.println("Index within range, proceeding...");
            try {
                rs = tw.showTempat();
                if (rs.next()){
                    tw = new TempatWisata(rs.getString("nama_destinasi"));
                }else{
                    System.out.println("No data Found");
                }
                
                System.out.println("tw :" + tw.getNamaDestinasi() + " tanggal: " + tanggal.getText() + " bayar : " + metodePembayaran + " user id : " + getIDTuris());
                System.out.println("user aktif" + getEmail());
                destinasi.add(tw);
                
                if (idx < destinasi.size()) {
                    String namaDestinasi = destinasi.get(idx).getNamaDestinasi();
                    System.out.println("idx" + idx);
                    System.out.println("tabel tiket size " + destinasi.size());
                    if (idx < destinasi.size()) {
                        System.out.println("masuk");
                        System.out.println("Ticket found: " + destinasi.get(idx).getNamaDestinasi());
                        storedTiket();
                        storedTanggal(tanggal.getText());
                        JOptionPane.showMessageDialog(null, getEmail());
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid ticket index.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, idx);
                }
            } catch (SQLException ex) {
                Logger.getLogger(PesanTiket.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "An error occurred.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No destination selected.");
        }
    }

    public void loadTiket(String email, String namaDestinasi) throws SQLException {
        Database db = new Database();
        rs = tiket.ShowTiket(email, namaDestinasi);
        tabelTiket.clear(); // Ensure previous tickets are cleared before loading new ones
        while (rs.next()) {
            tiket = new Tiket(rs.getString("nama_destinasi"), rs.getString("tanggal"), rs.getString("nama_turis"), rs.getString("no_telepon_turis"));
            tabelTiket.add(tiket);
        }
    }

    public void storedTiket() throws SQLException {
        try {
            tiket.insertPesanTiket(tanggal.getText(), metodePembayaran, getIDTuris(), listDestinasi.getSelectedIndex() + 1);
        } catch (SQLException ex) {
            Logger.getLogger(PesanTiket.class.getName()).log(Level.SEVERE, null, ex);
        }
        resetText();
    }
    

    public void storedTanggal(String tanggalPesan) throws SQLException {
        try {
            tiket.AddTanggal(tabelTiket.get(0).getTanggal(), tabelTiket.get(0).getIdTuris(), tabelTiket.get(0).getIdDestinasi());
        } catch (SQLException ex) {
            Logger.getLogger(PesanTiket.class.getName()).log(Level.SEVERE, null, ex);
        }
        resetText();
    }

    private void resetText() {
        namaTuris.setText("");
        noTelp.setText("");
        tanggal.setText("");
    }
}
