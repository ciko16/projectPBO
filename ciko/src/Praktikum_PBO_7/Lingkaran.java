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
public class Lingkaran extends BangunDatar{
   String nama;
    double jari;
    final double phi = 3.14;
    
    public Lingkaran(String nama, double jari){
        this.nama = nama;
        this.jari = jari;
    }
    
    public Lingkaran(){
        this.jari = 0;
    }
    
    @Override
    public double luas(){
        super.luas();
        return phi*jari*jari;
    }
    
    @Override
    public double keliling(){
        super.keliling();
        return 2*phi*jari;
    } 
}
