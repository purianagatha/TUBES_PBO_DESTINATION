/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.Database;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ginas
 */
public class Pengguna {

    private String username;
    private String email;
    private String password;

    public Pengguna(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ResultSet signIn(String email, String password) throws SQLException{
        Database db = new Database();
        String sql = "select * from `USER`"
                + "where "
                + "email = '" + email + "' "
                + " AND"
                + " password = '" + password
                + "'";
        return db.getData(sql);
    }
    
    public void signUp() throws SQLException{
        Database db = new Database();
        String sql = "insert into USER (user_name, email, password)"
                + "values ('" + this.getUsername() + "','" + this.getEmail()
                + "','" + this.getPassword() + "')";
        db.query(sql);
    }
    
    public void logOut(){
        
    }
    
    public void viewProfile(){
        
    }
}
