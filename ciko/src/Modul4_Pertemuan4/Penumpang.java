/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_Pertemuan4;

/**
 *
 * @author MSI GAMING
 */ //class driver
public class Penumpang {
    //atribut
    private String nama;
    private String kelamin;
    private String tujuan;
    private String kelas;
    //method
    void setPenumpang(String nama,String kelamin,String tujuan,String kelas){
        this.nama = nama;
        this.kelamin = kelamin;
        this.tujuan = tujuan;
        this.kelas = kelas;
    }
    //method
    void getPenumpang(){
        System.out.println(nama+kelamin+tujuan+kelas);
    }
}
