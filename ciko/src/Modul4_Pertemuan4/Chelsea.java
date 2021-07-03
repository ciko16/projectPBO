/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_Pertemuan4;

/**
 *
 * @author MSI GAMING
 *///class driver
public class Chelsea {
private String nama;
private String kelamin;
private String tujuan;
private String kelas;
 public void setPenumpang(String nama, String kelamin, String tujuan, String kelas){
        this.nama = nama;
        this.kelamin = kelamin;
        this.tujuan = tujuan;
        this.kelas = kelas;
}
public void getPenumpang(){
    System.out.println("Nama: "+nama+"\nJenis kelamin: "+kelamin+"\nTujuan: "+tujuan+"\nKelas Penumpang: "+kelas);
}
public  void getTujuan(String malaysia, String singapura){
      System.out.println("Tujuan destinasi anda adalah: "+ tujuan);
      if(tujuan==malaysia){
          System.out.println("Maaf,Penerbangan anda dibatalkan karena masa pandemi");
      }else if(tujuan==singapura){
          System.out.println("Maaf,Penerbangan anda dibatalkan karena masa pandemi");
      }else{
          System.out.println("Destinasi anda tersedia");
      }
}
}
