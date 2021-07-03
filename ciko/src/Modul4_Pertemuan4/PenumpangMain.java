/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_Pertemuan4;

/**
 *
 * @author MSI GAMING
 *///class implementasi
public class PenumpangMain {
    public static void main(String[] args) {
        Penumpang ciko[] = new Penumpang[4];
        for(int i = 0; i < ciko.length;i++){
            ciko[i] = new Penumpang();
        }
        ciko[0].setPenumpang("ciko", "laki-laki", "pekanbaru", "bisnis");
        ciko[1].setPenumpang("", "", "", "");
        ciko[2].setPenumpang("", "", "", "");
        ciko[3].setPenumpang("bunga", "perempuan", "jakarta", "bisnis");
        
        //yang akan ditampilkan
        ciko[3].getPenumpang();
        
    }
}
