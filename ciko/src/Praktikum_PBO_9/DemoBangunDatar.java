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
public class DemoBangunDatar {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(6);
        System.out.println("Keliling persegi: "+ persegi.hitungKeliling());
        System.out.println("Luas persegi: " + persegi.hitungLuas());
        
        PersegiPanjang2 pp = new PersegiPanjang2();
        pp.setPanjang(13);
        pp.setLebar(16);
        System.out.println("Keliling Persegi Panjang: "+pp.hitungKeliling());
        System.out.println("Luas Persegi Panjang: "+pp.hitungLuas());
        
        Segitiga2 s = new Segitiga2();
        s.setAlas(14);
        s.setTinggi(13);
        s.setSisi1(3);
        s.setSisi2(3);
        s.setSisi3(4);
        System.out.println("Keliling Segitiga: "+s.hitungKeliling());
        System.out.println("Luas Segitiga: "+s.hitungLuas());
    }
}
