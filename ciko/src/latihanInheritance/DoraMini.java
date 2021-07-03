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
public class DoraMini implements Robot,Doraemon{
    private String nama,pemilik;
    private int tahun;

    public String getPemilik() {
        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    @Override
    public void setNama(String nama) {
       this.nama = nama;
    }

    @Override
    public void setTahunPembuatan(int tahun) {
         this.tahun = tahun;
    }

    @Override
    public void displayData() {
        System.out.println("Nama: "+nama);
        System.out.println("Pemilik: "+pemilik);
        System.out.println("Tahun: "+tahun);
    }

    @Override
    public void sayDora() {
        System.out.println("Halo,Saya Dora Mini");
    }

    @Override
    public void displayKantongAjaib() {
        System.out.println("Saya juga seperti Doraemon yang memiliki kantung ajaib");
    }
    
}
