/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.Database;
import java.sql.SQLException;

/**
 *
 * @author ginas
 */
public abstract class Pengguna {
    private String username_pengguna;
    private String email_pengguna;
    private String password_pengguna;

    public Pengguna(String username_pengguna, String email_pengguna, String password_pengguna) {
        this.username_pengguna = username_pengguna;
        this.email_pengguna = email_pengguna;
        this.password_pengguna = password_pengguna;
    }

    public Pengguna(String email_pengguna, String password_pengguna) {
        this.email_pengguna = email_pengguna;
        this.password_pengguna = password_pengguna;
    }
   
    public String getUsername_pengguna() {
        return username_pengguna;
    }

    public void setUsername_pengguna(String username_pengguna) {
        this.username_pengguna = username_pengguna;
    }

    public String getEmail_pengguna() {
        return email_pengguna;
    }

    public void setEmail_pengguna(String email_pengguna) {
        this.email_pengguna = email_pengguna;
    }

    public String getPassword_pengguna() {
        return password_pengguna;
    }

    public void setPassword_pengguna(String password_pengguna) {
        this.password_pengguna = password_pengguna;
    }

}
