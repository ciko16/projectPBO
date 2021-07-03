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
public class MainCovid {
    public static void main(String[] args) {
        
        Covid c19 = new Covid();
        System.out.println("Hasil Swab Test Pasien : ");

        System.out.println("\nPasien 1: ");
        c19.suhu = 36.5;
        System.out.println("Suhu Pasien 1 = " + c19.suhu);
        c19.swab();

        System.out.println("\nPasien 2: ");
        c19.suhu = 38;
        System.out.println("Suhu Pasien 2 = " + c19.suhu);
        c19.swab();

        System.out.println("\nPasien 3: ");
        c19.suhu = 35;
        System.out.println("Suhu Pasien 3 = " + c19.suhu);
        c19.swab();

        System.out.println("\nPasien 4: ");
        c19.suhu = 37.2;
        System.out.println("Suhu Pasien 4 = " + c19.suhu);
         c19.swab();

        System.out.println("\nPasien 5: ");
        c19.suhu = 34;
        System.out.println("Suhu Pasien 5 = " + c19.suhu);
        c19.swab();

        System.out.println("");

        System.out.println("Jumlah Positif Corona = " + c19.virus );
        System.out.println("Jumlah Negatif Corona = " + c19.negatif);
    }
}
