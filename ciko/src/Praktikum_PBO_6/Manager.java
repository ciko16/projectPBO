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
public class Manager {
    private String nama;
    private String karyawan[] = new String[5];
    
    //menampilkan nama manager
    public Manager(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    //menampilkan nama karyawan
    public String getKaryawan(int index) {
        return karyawan[index];
    }

    //menginput nama karyawan
    public void setKaryawan(String karyawan, int index) {
        this.karyawan[index] = karyawan;
    }

}
