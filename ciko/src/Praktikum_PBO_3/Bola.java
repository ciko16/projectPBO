/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;

/**
 *
 * @author MSI GAMING
 */
public class Bola {
    private int jari;
    private String jenis;
    private double phi = 3.14;
    private double volume;
    
    Bola(){
        jari = 4;
        jenis = "Bola pimpong";
    }
    Bola(String jenis, int jari){
        this.jari = jari;
        this.jenis = jenis;
    }
    public void hasil(){
        volume = 4/3 * phi *jari * jari * jari;
        System.out.println("Jari-jari: "+jari);
        System.out.println("Jenis Bola: "+jenis);
        System.out.println("Volume bola: "+volume);
    } 
}
