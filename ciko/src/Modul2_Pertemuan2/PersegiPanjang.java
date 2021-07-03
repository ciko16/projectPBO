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
public class PersegiPanjang {
    double panjang;
    double lebar;
    
    double luas(){
        double ls;
        ls = panjang * lebar;
        return ls;
    }
    
    void keliling(){
        double kll;
        kll = (2*panjang) + (2*lebar);
        System.out.println("Keliling Persegi Panjang : " + kll);
    }
}
