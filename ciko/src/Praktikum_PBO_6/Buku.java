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
public class Buku {
    private String judul ;
    private int halaman;
    Penulis penulis;

    public Buku(String judul, int halaman,String penulis) {
        this.judul = judul;
        this.halaman = halaman;
        this.penulis = new Penulis (penulis);
    }

    public String getJudul() {
        return judul;
    }

    public int getHalaman() {
        return halaman;
    }
}
