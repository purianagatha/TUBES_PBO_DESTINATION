/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Turis;
import ViewTuris.DashboardNew;
import ViewTuris.MainTuris;
import tubesdestinationpbo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ginas
 */
public class SignupController implements ActionListener {
    private JTextField username = new JTextField();
    private JTextField email = new JTextField();
    private JTextField password = new JTextField();
    private JTextField rePassword = new JTextField();
    private JLabel validasi = new JLabel();
    private JFrame signupPage = new JFrame();

    public SignupController(JTextField username, JTextField email, JTextField  password, JTextField rePassword, JLabel validasi, JFrame signupPage) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.rePassword = rePassword;
        this.validasi = validasi;
        this.signupPage = signupPage;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(rePassword.getText().equals(password.getText())){
            Turis turis = new Turis(username.getText(), email.getText(), password.getText().toString());
            try {
                turis.Signup();
                resetText();
                
                LogIn LogInFrame = new LogIn();
                LogInFrame.setVisible(true);
                
                signupPage.dispose();
                
            }   catch (SQLException ex) {
                Logger.getLogger(SignupController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            validasi.setText("Password tidak sama!");
        }
    }
    
    public void resetText() {
        username.setText("");
        email.setText("");
        password.setText("");
        rePassword.setText("");
    }
}