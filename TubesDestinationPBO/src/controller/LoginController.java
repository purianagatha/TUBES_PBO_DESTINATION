/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.Database;
import Model.CurrentUser;
import Model.Pengguna;
import Model.Turis;
//import ViewAdmin.MainAdmin;
import ViewTuris.MainTuris;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ginas
 */
public class LoginController implements ActionListener {
    private JTextField textEmail = new JTextField();
    private JTextField textPassword = new JTextField();
    private JLabel message = new JLabel();
    private JFrame loginPage = new JFrame();
    private ArrayList<Turis> akun_turis = new ArrayList();
    
    private String role;
    private Pengguna user;

    public LoginController(JTextField email, JTextField password, JLabel message, JFrame loginPage) {
        this.textEmail = email;
        this.textPassword = password;
        this.message = message;
        this.loginPage = loginPage;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean check = AkunPenggguna(textEmail.getText(), textPassword.getText());
        
        if (!check) {
            message.setText("Password atau Email Salah!");
        } else {
            akun_turis.clear();
            loginPage.dispose();
            if(role.equals("admin")) {
//                MainAdmin admin = new MainAdmin();
//                admin.setVisible(true);
            } else if(role.equals("turis")) {
                MainTuris mainTuris = new MainTuris();
                mainTuris.setVisible(true);
            }
        }
      
    }
    
    public boolean AkunPenggguna(String email, String password) {
        boolean hasil = false;
        
        try { 
            Database db = new Database();
            ResultSet rs = null;
            Turis turis = new Turis(email,password);
            rs = turis.Login(email, password);
            
            CurrentUser current = new CurrentUser(email);
            
            if(rs.next()) {
                Pengguna user = new Pengguna(" ",rs.getString("email"), rs.getString("password")){};
                if (user.getEmail_pengguna().equals("admin") && user.getPassword_pengguna().equals("admin")) {
                    role = "admin";
                    hasil = true;
                } else if (user.getEmail_pengguna().equals(email) && user.getPassword_pengguna().equals(password)) {
                    role = "turis";
                    hasil = true;
                }
            }
            
        }   catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }
    
    public void ResetText() {
        textEmail.setText("");
        textPassword.setText("");
    }

}
