/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_7;

/**
 *
 * @author MSI GAMING
 */
public class MainPerusahaan {
    public static void main(String[] args) {
        Pegawai2 ciko = new Pegawai2();
        
        ciko.nama = "Haverzt";
        ciko.jenis = "Tetap";
        ciko.bagian = "Manager";
        ciko.perusahaan();
        ciko.info();
        ciko.pegawai("Tetap");
    }
}
