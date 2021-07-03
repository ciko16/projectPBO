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
public class Pegawai extends Kerja{
    int gaji;
    
    public Pegawai(){
        this.gaji = 0;
    }
    
    public void Aturan(){
        System.out.println("Programmer datang tepat waktu");
        System.out.println("Programmer sudah mengisi absensi");
        System.out.println("Programmer melakukan meeting mingguan");
    }
    
    public void gajiPokok(){
        System.out.println("Gaji pokok programmer adalah "+gaji);
    }
    
    @Override
    public void pegawai(){
        super.pegawai();
    }
}
