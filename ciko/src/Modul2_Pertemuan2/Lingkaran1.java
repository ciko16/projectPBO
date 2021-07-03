/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_Pertemuan2;

/**
 *
 * @author MSI GAMING
 */
public class Lingkaran1 {
    double jari_jari;
    final double pi = 3.14;
    
    Lingkaran1(double r){
        jari_jari = r;
    }
    double luasLingkaran(){
        double luas = 2*pi*jari_jari;
        return luas;
    }
    double kelLingkaran(){
        double kel = pi*jari_jari*jari_jari;
        return kel;
    }
}