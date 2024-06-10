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
    
}
