/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.Database;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

/**
 *
 * @author ginas
 */
public class Turis extends Pengguna {
    private int id_turis;
    private String username;
    private String nama_turis;
    private String email;
    private String password;
    private String no_telepon_turis;
    
    public Turis(String username, String email, String password) {
        super(username, email, password);
    }
    
    public Turis(String email, String password) {
        super(email, password);
    }

    public String getNama_turis() {
        return nama_turis;
    }

    public void setNama_turis(String nama_turis) {
        this.nama_turis = nama_turis;
    }

    public String getNo_telepon_turis() {
        return no_telepon_turis;
    }

    public void setNo_telepon_turis(String no_telepon_turis) {
        this.no_telepon_turis = no_telepon_turis;
    }
    
    public void Signup() throws SQLException {
        Database db = new Database();
        String sql = "insert into Turis (username, nama_turis, email, password, no_telepon_turis)"
                + " values ('" + super.getUsername_pengguna() + "', '" + nama_turis + "', '" + super.getEmail_pengguna()
                + "', '" + super.getPassword_pengguna() +  "', '" + no_telepon_turis + "')";
        System.out.println(sql);
        db.query(sql);
    }
    
    public ResultSet Login(String email, String password) throws SQLException {
        Database db = new Database();
        String sql = "select * from turis " + 
                "where " + 
                "username = '" + email + "' " +
                " and " +
                "password = '" + password + "';";
        return db.getData(sql);
    }
}
