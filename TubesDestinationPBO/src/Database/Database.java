/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ginas
 */
public class Database {
    static final String url = "jdbc:mysql://localhost:3306/destinasi";
    static final String user = "root";
    static final String pass = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    public Database() throws SQLException {
        try {
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public ResultSet getData(String SQLString) {
        try {
            rs = stmt.executeQuery(SQLString);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }

    public void query(String SQLString) {
        try {
            stmt.executeUpdate(SQLString);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
    }
}
