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
public class TestBangunDatar {
    public static void main(String[] args) {
        Segitiga s1=new Segitiga();
        Segitiga s2=new Segitiga();
        Persegi p1 = new Persegi();
        Lingkaran l1 = new Lingkaran();
        
        s1.nama="Siku-siku";
        s1.alas=10;
        s1.tinggi=15;
        
        System.out.println("Nama Segitiga: "+s1.nama);
        System.out.println("Luas Segitiga: "+s1.luas());
        
        System.out.println("");
        s2.nama="Sama Sisi";
        s2.sisi1=s2.sisi2=s2.sisi3=100;
        System.out.println("Nama Segitiga: "+s2.nama);
        System.out.println("Keliling Segitiga: "+s2.keliling());
        
        System.out.println("");
        p1.nama="Persegi";
        p1.sisi = 13;
        
        System.out.println("Nama Bangun Datar: "+p1.nama);
        System.out.println("Luas Persegi: "+p1.luas());
        System.out.println("Keliling Persegi: "+p1.keliling());
        
        System.out.println("");
        l1.nama="Lingkaran";
        l1.jari = 13;
        
        System.out.println("Nama Bangun Datar: "+l1.nama);
        System.out.println("Luas Lingkaran: "+l1.luas());
        System.out.println("Keliling Lingkaran: "+l1.keliling());
    }
}
