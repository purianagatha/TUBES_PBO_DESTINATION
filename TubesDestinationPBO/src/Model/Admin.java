/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.Database;
import java.sql.SQLException;

public class Admin extends Pengguna {

    private String UserName;
    private String Email;
    private String Password;

    public Admin(String username, String email, String password) {
        super(username, email, password);
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void addTempatWisata() throws SQLException {
        TempatWisata wisata = new TempatWisata();
        Database DataBase = new Database();
        String sql = "insert into tempatwisata values ('" + wisata.getIdTempat() + "','" + wisata.getNama()
                + "','" + wisata.getLokasi() + "','" + wisata.getDeskripsi() + "','" + wisata.getRating()
                + "','" + wisata.getHarga() + "')";
        DataBase.query(sql);
    }

    public void deleteTempatWisata() throws SQLException {
        TempatWisata wisata = new TempatWisata();
        Database db = new Database();
        String SQL = "Delete from tempatwisata where nama = ('" + wisata.getNama() + "')";
        db.query(SQL);
    }

    public void editTempatWisata(String idtempat, String nama, String lokasi, String deskripsi, String rating, int harga) throws SQLException {
        Database db = new Database();
        String sql = "update tempatwisata set id_tempat = '" + idtempat + "',nama = '" + nama
                + "', lokasi = '" + lokasi + "'deskripsi = '" + deskripsi + "',rating = '" + rating 
                + "',harga = '" + harga + "';";
        db.query(sql);
    }
}
