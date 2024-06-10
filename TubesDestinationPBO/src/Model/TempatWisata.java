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
public class TempatWisata {
    private int idDestinasi;
    private String namaDestinasi;
    private String deskripsiDestinasi;
    private String lokasiDestinasi;
    private int hargaDestinasi;

    public TempatWisata(int idDestinasi, String namaDestinasi, String deskripsiDestinasi, String lokasiDestinasi, int hargaDestinasi) {
        this.idDestinasi = idDestinasi;
        this.namaDestinasi = namaDestinasi;
        this.deskripsiDestinasi = deskripsiDestinasi;
        this.lokasiDestinasi = lokasiDestinasi;
        this.hargaDestinasi = hargaDestinasi;
    }

    public TempatWisata(String namaDestinasi, String deskripsiDestinasi, String lokasiDestinasi, int hargaDestinasi) {
        this.namaDestinasi = namaDestinasi;
        this.deskripsiDestinasi = deskripsiDestinasi;
        this.lokasiDestinasi = lokasiDestinasi;
        this.hargaDestinasi = hargaDestinasi;
    }

    public TempatWisata(String namaDestinasi) {
        this.namaDestinasi = namaDestinasi;
    }

    public TempatWisata() {
        
    }
    
    public int getIdDestinasi() {
        return idDestinasi;
    }

    public void setIdDestinasi(int idDestinasi) {
        this.idDestinasi = idDestinasi;
    }

    public String getNamaDestinasi() {
        return namaDestinasi;
    }

    public void setNamaDestinasi(String namaDestinasi) {
        this.namaDestinasi = namaDestinasi;
    }

    public String getDeskripsiDestinasi() {
        return deskripsiDestinasi;
    }

    public void setDeskripsiDestinasi(String deskripsiDestinasi) {
        this.deskripsiDestinasi = deskripsiDestinasi;
    }

    public String getLokasiDestinasi() {
        return lokasiDestinasi;
    }

    public void setLokasiDestinasi(String lokasiDestinasi) {
        this.lokasiDestinasi = lokasiDestinasi;
    }

    public int getHargaDestinasi() {
        return hargaDestinasi;
    }

    public void setHargaDestinasi(int hargaDestinasi) {
        this.hargaDestinasi = hargaDestinasi;
    }
    public ResultSet showTempat() throws SQLException{
        Database db = new Database();
        String sql = "select nama_destinasi from tempat_wisata;";
        return db.getData(sql);
        
    }
    
     public void addTempatWisata(String nama, String deskripsi, String lokasi, int harga) throws SQLException {
        TempatWisata wisata = new TempatWisata();
        Database DataBase = new Database();
        String sql = "INSERT INTO `tempat_wisata`(`nama_destinasi`, `deskripsi_destinasi`, `lokasi_destinasi`, `harga_destinasi`) "
                + "VALUES ('" + nama + "','" + deskripsi + "','" + lokasi + "'," + harga + ")";
        DataBase.query(sql);
    }
    
     public void deleteTempatWisata(String nama) throws SQLException {
        TempatWisata wisata = new TempatWisata();
        Database db = new Database();
        String SQL = "Delete from tempat_wisata where nama_destinasi = ('" + nama + "')";
        db.query(SQL);
    }

    public void editTempatWisata(String target, String nama, String lokasi, String deskripsi, int harga) throws SQLException {
        Database db = new Database();
        String sql = "update tempat_wisata set nama_destinasi = '" + nama
                + "', deskripsi_destinasi = '" + deskripsi + "', lokasi_destinasi = '" + lokasi 
                + "',harga_destinasi = '" + harga + "' where nama_destinasi = '" + target + "';";
        
        db.query(sql);
    }
    
}
