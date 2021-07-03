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
public class Drone {
     // atribut
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    //method
    void terbang(){
        energi--;
        if (energi > 10) {
            // terbang berarti nilai ketinggian bertambah
            ketinggian--;
            System.out.println("Drone terbang...");
        } else {
            System.out.println("Energi lemah: Drone nggak bisa terbang");
        }
    }
    
    void matikanMesin(){
        if (ketinggian > 0) {
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
        } else {
            System.out.println("Mesin dimatikan...");
        }
    }
    
    void turun(){
        // ketingian berkurang, karena turun
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
    }
    
    void belok(){
        energi--;
        System.out.println("Drone belok");
        //belok kemana? perlu dicek
    }
    
    void maju() {
        energi--;
        System.out.println("Drone maju ke depan");
        kecepatan++;
    }
    
    void mundur() {
        energi--;
        System.out.println("Drone mundur");
        kecepatan++;
    }
}

