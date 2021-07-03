/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSPPBO;

/**
 *
 * @author MSI GAMING
 */
public class MainCovid {
    public static void main(String[] args) {
        ODP1 fulan = new ODP1("Jojo","demam",21,"Negatif");
        ODP2 fulanah = new ODP2("Dio","sesak nafas",22,"Positif");
        
        System.out.println("Nama: "+fulan.getNama());
        System.out.println("Gejala: "+fulan.getGejala());
        System.out.println("Umur: "+fulan.getUmur());
        System.out.println("Kondisi pasien: "+fulan.getStatus());
        System.out.println("");
        System.out.println();
        System.out.println("Nama: "+fulanah.getNama());
        System.out.println("Gejala: "+fulanah.getGejala());
        System.out.println("Umur: "+fulanah.getUmur());
        System.out.println("Kondisi pasien: "+fulanah.getStatus());
    }
}
