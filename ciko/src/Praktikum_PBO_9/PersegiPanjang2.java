/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_9;

/**
 *
 * @author MSI GAMING
 */
public class PersegiPanjang2 implements BangunDatar{
    private double panjang,lebar;
    
    public double getPanjang(){
        return panjang;
    }
    public void setPanjang(double panjang){
        this.panjang = panjang ;
    }
    public double getLebar(){
        return lebar;
    }
    public void setLebar(double lebar){
        this.lebar = lebar ;
    }
    @Override
    public double hitungLuas() {
      return panjang*lebar;
    }

    @Override
    public double hitungKeliling() {
       return 2*panjang+lebar;
    }
}