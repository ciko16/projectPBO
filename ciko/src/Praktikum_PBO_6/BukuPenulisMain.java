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
public class BukuPenulisMain {
     public static void main(String[] args) {
        Buku ciko = new Buku("Rahiqul Makhtum ",440,"Safi-ur-Rahman al-Mubarakpuri");
        System.out.println("judul buku : "+ciko.getJudul());
        System.out.println("lembaran buku : "+ciko.getHalaman());
        System.out.println("penulis buku : "+ciko.penulis.getNama());
        
    }
}
