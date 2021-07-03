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
public class TestPersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang ps1 = new PersegiPanjang();
         PersegiPanjang ps2 = new PersegiPanjang();
         
         //memberikan nilai pada objek 1
         ps1.panjang = 4;
         ps1.lebar = 3;
         
         //memberikan nilai pada objek 2
         ps2.panjang = 6;
         ps2.lebar = 7;
         
         //menampilkan data objek 1
         System.out.println("Persegi Panjang 1");
         System.out.println("Panjang : " + ps1.panjang + " cm");
         System.out.println("Lebar : " + ps1.lebar + " cm");
         System.out.println("Luas Persegi Panjang 1: " + ps1.luas()+" cm2");
         ps1.keliling();
         
         System.out.println("");
         
         //menampilkan data objek 2
         System.out.println("Persegi Panjang 1");
         System.out.println("Panjang : " + ps2.panjang + " cm");
         System.out.println("Lebar : " + ps2.lebar + " cm");
         System.out.println("Luas Persegi Panjang 1: " + ps2.luas()+" cm2");
         ps2.keliling();
    }
}
