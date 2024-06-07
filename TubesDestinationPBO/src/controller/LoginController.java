/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.Database;
import Model.Turis;
import ViewTuris.DashboardNew;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ginas
 */
public class LoginController implements ActionListener {
    private JTextField email = new JTextField();
    private JTextField password = new JTextField();
    private JLabel message = new JLabel();
    private JFrame loginPage = new JFrame();
    private ArrayList<Turis> akun_turis = new ArrayList();

    public LoginController(JTextField email, JTextField password, JLabel message, JFrame loginPage) {
        this.email = email;
        this.password = password;
        this.message = message;
        this.loginPage = loginPage;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Database db = new Database();
            ResultSet rs;
            Turis turis = new Turis(email.getText(), password.getText());
            rs = turis.Login(email.getText(), password.getText());
            akun_turis.add(turis);
            ResetText();
                
            DashboardNew dashboardUser = new DashboardNew();
            dashboardUser.setVisible(true);
                
            loginPage.dispose();
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            message.setText("Password atau Email Salah!");
        }
        
        
    }
    
    public void ResetText() {
        email.setText("");
        password.setText("");
    }
    
}
