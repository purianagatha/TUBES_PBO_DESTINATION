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
public class Tiket extends Turis {
    private int idTiket;
    private int idTuris;
    private int idDestinasi;
    private String namadestinasi;
    private String hari;
    private String tanggal;
    private String statusPembayaran;

    public Tiket(int idTiket, int idTuris, int idDestinasi, String hari, String tanggal, String statusPembayaran) {
        this.idTiket = idTiket;
        this.idTuris = idTuris;
        this.idDestinasi = idDestinasi;
        this.hari = hari;
        this.tanggal = tanggal;
        this.statusPembayaran = statusPembayaran;
    }

    public Tiket(String nama_destinasi,String tanggal, String nama_turis, String no_telp_turis) {
        super(nama_turis, no_telp_turis);
        this.tanggal = tanggal;
        this.namadestinasi = nama_destinasi;
    }

    public String getNamadestinasi() {
        return namadestinasi;
    }

    public void setNamadestinasi(String namadestinasi) {
        this.namadestinasi = namadestinasi;
    }
    
    public Tiket() {
    }
    
    public int getIdTiket() {
        return idTiket;
    }

    public void setIdTiket(int idTiket) {
        this.idTiket = idTiket;
    }

    @Override
    public int getIdTuris() {
        return idTuris;
    }

    @Override
    public void setIdTuris(int idTuris) {
        this.idTuris = idTuris;
    }

    public int getIdDestinasi() {
        return idDestinasi;
    }

    public void setIdDestinasi(int idDestinasi) {
        this.idDestinasi = idDestinasi;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }
    
    public void AddTanggal(String tanggal, int id_turis, int idDestinasi) throws SQLException {
        Database db = new Database();
        String sql = "insert into tiket (tanggal, id_turis, id_destinasi) "
                + "values (' " + tanggal + "',"
                + idTuris + ","
                + idDestinasi + ")";
        db.getData(sql);
    }
    
    public ResultSet ShowTiket(String email, String namaDestinasi) throws SQLException {
        Database db = new Database();
        String sql = "select nama_turis, no_telepon_turis, tanggal, nama_destinasi " 
                + "from tiket " 
                + "join turis using (id_turis) "
                + "join tempat_wisata using (id_destinasi)"
                + "where email = '" + email + "' "
                + "and "
                + "nama_destinasi = '" + namaDestinasi + "';";
        System.out.println(sql);
        return db.getData(sql);
    }

    public void insertPesanTiket(String tanggal, String metode_pembayaran, int id_turis, int id_destinasi) throws SQLException {
        Database db = new Database();
        String sql = String.format("INSERT INTO tiket (tanggal, metode_pembayaran, id_turis, id_destinasi) "
                + "VALUES ('%s', '%s', %d, %d)", tanggal, metode_pembayaran, id_turis, id_destinasi);
        db.query(sql);
    }
}
