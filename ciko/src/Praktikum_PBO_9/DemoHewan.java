/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_9;
import java.util.Random;
/**
 *
 * @author MSI GAMING
 */
public class DemoHewan {
    public static void main(String[] args) {
        Hewan[] peliharaanku = {new Burung("Kakak Tua"), new Kambing("Etawa"),
        new Anjing("Kintamani"), new Kucing("Anggora")};

        Hewan kesayangan;
        Random pilihan = new Random();
        kesayangan = peliharaanku[pilihan.nextInt(peliharaanku.length)];

        System.out.println("Binatang kesayangan anda : " + kesayangan);
        System.out.print("Suaranya : ");
        kesayangan.suara();
    }
}
