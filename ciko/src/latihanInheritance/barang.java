/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanInheritance;

/**
 *
 * @author MSI GAMING
 */
public class barang implements pergudangan {
    private String nama;
    private int IdBarang,harga,jumlah,total;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getIdBarang() {
        return IdBarang;
    }

    public void setIdBarang(int IdBarang) {
        this.IdBarang = IdBarang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public int getId() {
        return IdBarang;
    }
    
    @Override
    public void setId() {
       this.IdBarang = IdBarang;
    }

    @Override
    public void setId(int id) {
        this.IdBarang = IdBarang;
    }

    @Override
    public void setData() {
        total = getJumlah()*getHarga();
        System.out.println("Total Harga: "+total);
    }

    @Override
    public void tampil() {
        System.out.println("ID Barang: "+ getId());
        System.out.println("Nama Barang: "+ getNama());
        System.out.println("Harga Barang: "+ getHarga());
        System.out.println("Jumlah Barang: "+ getJumlah());
    }
}
