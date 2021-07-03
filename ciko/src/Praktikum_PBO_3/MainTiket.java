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
public class MainTiket {
    public static void main(String[] args) {
        Tiket ciko = new Tiket();
        Tiket bunga = new Tiket("Citylink","01-April-2020","AS","05.30");
 
        System.out.println("Tiket 1");
        ciko.ingfo();
        System.out.println("\n");
        System.out.println("Tiket 2");
        bunga.ingfo();
        
        ciko.setNomor("C12");
        ciko.setBerangkat("11.00");
        ciko.setTanggal("01-April-2020");
        bunga.setNomor("AS");
        bunga.setBerangkat("13.00");
        bunga.setTanggal("01-April-2020");
        
        System.out.println("\n");
        System.out.println("update data: ");
        System.out.println("Tiket 1");
        ciko.ingfo();
        
        System.out.println("\n");
        System.out.println("Tiket 2");
        bunga.ingfo();
    }
}
