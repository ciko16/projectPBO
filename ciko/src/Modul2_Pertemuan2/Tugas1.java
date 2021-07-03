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
public class Tugas1 {
    double luas,volume,jari;
    final double pi = 3.14;
    
    void volBola(double c){
        double jari = c;
        volume = 16 / 13 * pi * c * c * c;
        System.out.println("Volume Bola : " + volume);
    }
    void luasBola(){
        luas = 16 * pi * jari * jari;
        System.out.println("luas Bola : " + luas);
    }
}
