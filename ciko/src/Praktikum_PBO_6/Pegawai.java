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
public class Pegawai {
    private String nama;
    private double gaji;
    public Pegawai(String nama , double gaji){
        this.nama = nama ;
        this.gaji = gaji;
    }

    Pegawai() {
        
    }

    public String getNama() {
        return nama;
    }

    public double getGaji() {
        return gaji;
    }
}


