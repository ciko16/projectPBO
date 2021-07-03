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
import java.util.Scanner;
public class PegawaiManagerMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //objek nama pegawai
         Pegawai [] ciko = new Pegawai[5];


        // menginput  nama karyawan 
        for (int i = 0; i < 5; i++) {
            System.out.println("masukan nama karyawan anda");
            String b = input.next();
            System.out.println("masukan gaji karyawan");
            int c = input.nextInt();
            ciko[i]= new Pegawai(b,c);

        }

        //objek  manager
        Manager boss = new Manager("Thomas Tuchel");
       
        // mengisi nama manger 
        
         System.out.println("=================\nnama manager : "+boss.getNama());

        //memasukan nama karyawan dengan nama karyawan di class karyawan
        for (int i = 0; i < 5; i++) {
            boss.setKaryawan(ciko[i].getNama(), i);

        }
        System.out.println("=================\nnama karyawan");
        //menampilkan nama karyawan
        for (int i = 0; i < 5; i++) {
            System.out.println(boss.getKaryawan(i));

        }

    }
}
