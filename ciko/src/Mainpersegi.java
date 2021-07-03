/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GAMING
 */
public class Mainpersegi {
    public static void main(String[] args) {
        persegi ciko = new persegi();
        persegi bunga = new persegi(13);
        persegi che = new persegi(bunga.sisi);
         System.out.println("\nconstuktor==========");
        ciko.getluas();
        System.out.println("keliling persegi adalah "+ciko.getkeliling());
        
        System.out.println("\nconstruktor prarameter=============");
        bunga.getluas();
        System.out.println("keliling persegi adalah "+bunga.getkeliling());
        System.out.println("\nconstruktror parameter objek======================");
        che.getluas();
        System.out.println("keliling   "+che.getkeliling());
        
        
    }
}

