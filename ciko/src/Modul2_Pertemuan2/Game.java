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
public class Game {
    public static void main(String[] args) {
        // membuat objek player
        Pemain pemain1 = new Pemain();
        Pemain pemain2 = new Pemain();

        //mengisi atribut player1
        pemain1.name = "fatih";
        pemain1.speed = 78;
        pemain1.healthPoint = 100;
        pemain1.peluru = 7;
        //mengisi atribut player2
        pemain2.name = "Sutan";
        pemain2.speed = 90;
        pemain2.healthPoint = 0;
        pemain2.peluru = 0;
        // menjalankan method
        pemain1.run();
        pemain1.tembak();
        pemain2.run();

        //jika pemain 1 atau pemain 2 mati, maka game over
        if (pemain1.isDead() || pemain2.isDead()) {
            System.out.println("Game over");
        }
        // menambah peluru
        pemain1.tambahPeluru();
        

        // melempar granat
        pemain2.lempar();

        // makan
        pemain1.makan();

        // lompat
        pemain2.lompat();

        // lari
        pemain1.lari();

        // reload
        pemain1.reload();
        pemain2.reload();
    }
}
