/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_Pertemuan4;

/**
 *
 * @author MSI GAMING
 */ //class implementasi 
public class ChelseaMain {
    public static void main(String[] args) {
        Chelsea ciko[] = new Chelsea[6];
        for(int i = 0; i < ciko.length; i++){
            ciko[i] = new Chelsea();
        }
        ciko[0].setPenumpang("Evelynn","Perempuan", "Jakarta", "Bisnis");
        ciko[1].setPenumpang("Mount", "Laki-laki", "Malaysia", "Ekonomi");
        ciko[2].setPenumpang("Rose", "Perempuan", "Singapura", "Ekonomi");
        ciko[3].setPenumpang("Kai", "Laki-Laki", "Singapura", "Bisnis");
        ciko[4].setPenumpang("Ziyech","Laki-Laki","Malaysia","Bisnis");
        ciko[5].setPenumpang("Emilia", "Perempuan", "Bandung", "Ekonomi");
        
        ciko[0].getTujuan("Indonesia","Indonesia");
       ciko[1].getTujuan("Malaysia","Malaysia");
       ciko[2].getTujuan("Singapura","Singapura");
       ciko[0].getTujuan("Singapura","Singapura");
       ciko[1].getTujuan("Malaysia","Malaysia");
       ciko[2].getTujuan("Indonesia","Indonesia");
    }
}
