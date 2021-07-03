/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_9;

/**
 *
 * @author MSI GAMING
 */
public class MainNilai {
    public static void main(String[] args) {
        Mahasiswa laki = new Mahasiswa();
        Mahasiswi perempuan = new Mahasiswi();
        
        laki.setNama("Kai Haverzt");
        laki.setNilai1(84);
        laki.setNilai2(79);
        laki.setNilai3(93);
        System.out.println("Nama Mahasiswa: " +laki.getNama());
        System.out.println("Nilai Matematika: "+laki.getNilai1());
        System.out.println("Nilai Ilmu Sosial: "+laki.getNilai2());
        System.out.println("Nilai Kimia: "+laki.getNilai3());
        System.out.println("Nilai Tertinggi: "+laki.nilaiTinggi());
        System.out.println("Nilai Rata-Rata: "+laki.Average());
        System.out.println();
        perempuan.setNama("Sophia Emelia");
        perempuan.setNilai1(79);
        perempuan.setNilai2(85);
        perempuan.setNilai3(88);
        perempuan.setNilai4(96);
        System.out.println("Nama Mahasiswi: "+perempuan.getNama());
        System.out.println("Nilai Matematika: "+perempuan.getNilai1());
        System.out.println("Nilai Ilmu Sosial: "+perempuan.getNilai2());
        System.out.println("Nilai Kimia: "+perempuan.getNilai3());
        System.out.println("Nilai Ilmu Budaya: "+perempuan.getNilai4());
        System.out.println("Nilai Tertinggi: "+perempuan.nilaiTinggi());
        System.out.println("Nilai Rata-Rata: "+perempuan.Average());
    }
}
