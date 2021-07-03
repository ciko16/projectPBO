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
public class MainClass1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan jari-jari lingkaran: ");
        double jari_jari = input.nextDouble();
        
        Lingkaran1 objLing1 = new Lingkaran1(jari_jari);
        Lingkaran1 objLing2 = new Lingkaran1(jari_jari);
        
        System.out.println("Luas lingkaran: "+String.format("%,.2f", objLing1.luasLingkaran()));
        System.out.println("Luas lingkaran: "+String.format("%,.2f", objLing2.luasLingkaran()));
    }
}
