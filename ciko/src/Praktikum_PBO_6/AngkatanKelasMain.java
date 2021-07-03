/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_6;

/**
 *
 * @author MSI GAMING
 */
public class AngkatanKelasMain {
     public static void main(String[] args) {
        Kelas ciko = new Kelas("13",29);
        Kelas cika = new Kelas("16",18);
        
        Angkatan TI = new Angkatan (2021);
        
        TI.setKelasbuka(ciko.getKuota());
        TI.setKelasbuka(cika.getKuota());
        
        
        System.out.println("Angkatan tahun ini :");
        System.out.println("Angkatan tahun :"+TI.getTahun());
        System.out.println("Kuota setiap kelas :");
        for(int i = 0; i<2;i++){
            System.out.println(TI.getKelasbuka(i));
        }
    }
}
