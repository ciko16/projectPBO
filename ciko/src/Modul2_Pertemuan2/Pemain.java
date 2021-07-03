/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_Pertemuan2;
 
public class Pemain {
    // definisi atribut
    String name;
    int grenade = 3;
    int speed;
    int healthPoint;
    int peluru;

    // definisi method run
    void run() {
        System.out.println(name + " is running...");
        System.out.println("Speed :" + speed);
        System.out.println("health point :" + healthPoint);
    }
    // menembak 
    void tembak() {
        peluru--;
        System.out.println("peluru sekarang:" + peluru);
    }

    // definisi method isDead untuk mengecek nilai kesehatan (health points)
    boolean isDead() {
        if (healthPoint <= 0) {
            return true;
        }
        return false;
    }
    // method lempar untuk melempar granat 
    void lempar() {
        grenade--;
        System.out.println(name + " melempar granat" + "\n" + "sisa granat : " + grenade);
    }
    //method reload untuk mengisi ulang peluru jika peluru habis
    void reload() {
        if (peluru <= 0) {
            peluru += 10;
            System.out.println("peluru habis" +"\n" + "mengisi peluru:" + peluru);
        }
        else{
            System.out.println("peluru belum habis");
        }
    }

    void lompat() {
        System.out.println(name + " sedang melompat...");
    }

    void lari() {
        System.out.println(name + " sedang berlari...");
    }

    void tambahPeluru() {
        peluru +=2;
        System.out.println("peluru bertambah :" + peluru);
    }

    void makan() {
        healthPoint += 50;
        System.out.println(name + " memakan makanan, menambah health Point :" + healthPoint);
    }
}