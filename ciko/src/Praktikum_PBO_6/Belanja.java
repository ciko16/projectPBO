/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_6;

/**
 *
 * @author MSI GAMING
 */
public class Belanja {
    String nama;
    DaftarBelanja barang[] = new DaftarBelanja[50];
    int jumlah = 0;
    
    public Belanja(String nama) {
        this.nama = nama;
    }

    public void beliBarang(DaftarBelanja db) {
        this.barang[jumlah]=db;
        this.jumlah++;
    }

    public void displayPembelian(){
        System.out.println("Nama Pembeli : "+this.nama);
        System.out.println("Daftar Barang Yang Dibeli : ");
        System.out.println("No\t"+"Nama Barang\t"+"Harga");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i+1)+". \t"+barang[i].nama+"\t\t"+barang[i].harga);
        }
    }
}
