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
public class NewClass {
    
    private int alas, tinggi, sisi1, keliling;
    private double luas;

    public NewClass(int a, int t, int s1) {
        alas = a;
        tinggi = t;
        sisi1 = s1;
        
    }

    public void setKeliling() {
        keliling = sisi1 + sisi1 + sisi1;
    }

    public void setLuas() {
        luas = 0.5 * alas * tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public int getSisi1() {
        return sisi1;
    }
    
    public int getSisi2() {
        return sisi1;
    }
    
    public int getSisi3() {
        return sisi1;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getKeliling() {
        return keliling;
    }

    public double getLuas() {
        return luas;
    }
}

