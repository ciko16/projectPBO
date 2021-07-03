/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSPPBO;

/**
 *
 * @author MSI GAMING
 */
public class MotorMenyala {
    public static void main(String[] args) {
        Motor m = new Motor();
        
        m.setMerk("Honda");
        m.setTransmisi("Matic");
        m.setTipe("Scoopy");
        m.setWarna("Hitam");
        m.setKecepatan(45);
        
        System.out.println("Merk Motor: "+m.getMerk());
        System.out.println("Jenis Transmisi: "+m.getTransmisi());
        System.out.println("Jenis Motor: "+m.getTipe());
        System.out.println("Warna Motor: "+m.getWarna());
        System.out.println("Kecepatan motor sekarang: "+m.getKecepatan());
    }
}
