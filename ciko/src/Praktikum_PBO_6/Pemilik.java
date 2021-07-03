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
public class Pemilik {
    private String nama;
    private String alamat;
    private int jumlahMobil;
    String[] noPlatMobil = new String[5];
    Mobil mobil;
    Pemilik() {

    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getJumlahmobil() {
        return jumlahMobil;
    }

    public String getNoplatmobil(int index) {
        return noPlatMobil[index];
    }

    public void jualmobil() {
        jumlahMobil--;
    }

    public void belimobil(int jml) {
        if (jumlahMobil < this.noPlatMobil.length) {

            jumlahMobil += jml;
        }
    }
}
