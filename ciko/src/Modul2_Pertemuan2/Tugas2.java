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
public class Tugas2 {
    String nama, huruf;
    int nilai;
    
    void penilaian(){
        if (nilai > 81) {
            huruf = "A";
            System.out.println("Nilai huruf anda adalah : " + huruf);
        } else if (nilai <= 80 && nilai >= 76){
            huruf = "AB";
            System.out.println("Nilai huruf anda adalah : " + huruf);
        } else if (nilai <= 75 && nilai >= 66){
            huruf = "B";
            System.out.println("Nilai huruf anda adalah : " + huruf);
        } else if (nilai <= 65 && nilai >= 61){
            huruf = "BC";
            System.out.println("Nilai huruf anda adalah : " + huruf);
        }else if (nilai <= 60 && nilai >= 51){
            huruf = "D";
            System.out.println("Nilai huruf anda adalah : " + huruf);
        }else {
            huruf = "F";
            System.out.println("Nilai huruf anda adalah : " + huruf);
            System.out.println("Maaf anda tidak lulus");
        }
    }
    void nilai(){
        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
    }
}
