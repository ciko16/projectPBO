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
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Lingkaran objLing1 = new Lingkaran();
        Lingkaran objLing2 = new Lingkaran();
        
        System.out.println("Masukkan jari-jari Lingkaran: ");
        double jari_jari = input.nextDouble();
        
        objLing1.jari_jari=jari_jari;
        objLing2.jari_jari=jari_jari;
        
        System.out.println("Luas lingkaran: " + objLing1.luasLingkaran());
        System.out.println("Luas lingkaran: " + objLing2.kelLingkaran());
        objLing1.status();
    }
}
