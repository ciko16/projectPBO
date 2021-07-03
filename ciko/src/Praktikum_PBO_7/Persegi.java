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
public class Persegi extends BangunDatar {
    String nama;
    int sisi;
    
    public Persegi(String nama, int sisi){
        this.nama = nama;
        this.sisi = sisi;
    }
    
    public Persegi(){
        this.sisi=0;
    }
    
    @Override
    public double luas(){
        super.luas();
        return sisi*sisi;
    }
    
    @Override
    public double keliling(){
        super.keliling();
        return 4*sisi;
    }
}
