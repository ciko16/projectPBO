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
public class MainDrone {
    public static void main(String[] args) {
        //menambahkan objek pada class
        Drone skywalker = new Drone();
        Drone lightsaber = new Drone();

        //mengisi atribut pada objek
        skywalker.energi = 13;
        lightsaber.energi = 0;
        skywalker.ketinggian = 35;
        lightsaber.ketinggian = 0;
        skywalker.kecepatan = 100;
        lightsaber.kecepatan = 0;

        // menjalankan perintah
        skywalker.terbang();
        
        lightsaber.terbang();
        
        skywalker.matikanMesin();
        
        lightsaber.matikanMesin();
        
        skywalker.turun();
        
        skywalker.belok();
        
        skywalker.maju();
        
        skywalker.mundur();
    }
}