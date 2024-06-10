/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Database.Database;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ginas
 */
public class CurrentUser {
  
   public static String email = " ";
   public static String namaDestinasi = " ";

    public CurrentUser(String email) {
        this.email = email;
    }

    public static String getEmail() {
        return email;
    }
    
    public static int getIDTuris() throws SQLException{
        int idTuris = -1;
        Database db = new Database();
        ResultSet rs = db.getData("SELECT * FROM turis WHERE email = '" + getEmail() + "'");
        if (rs.next()) {
            idTuris = rs.getInt("id_turis");
        }
        return idTuris;
    }
}
