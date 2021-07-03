/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

/**
 *
 * @author MSI GAMING
 */
public class Bilangan {
    int bil1 = 0;
    int bil2;
    boolean hasil;

    void getBilangan(int bil){
        bil1 = bil;
    }
    void BilanganGanjil(){
        if (bil1 % 2 == 1){
            hasil = true;
        }else{
            hasil = false;
        }System.out.println("Bilangan "+bil1+" adalah ganjil "+"\nHasil = "+hasil);
    }
    void BilanganKecilDaripada(int bil){
        if (bil1 < bil){
            hasil = true;
        }else if(bil1 > bil){
            hasil = false;
        }
        System.out.println("Bilangan "+bil1+" lebih kecil dari pada "+bil1+"\nHasil = "+hasil);
    }
    void BilanaganBesarDaripada(int bil){
        if (bil1 > bil){
            hasil = true;
        }else if(bil1 < bil){
            hasil = false;
        }
        System.out.println("Bilangan "+bil1+" lebih besar dari pada "+bil1+"\nHasil = "+hasil);
    }
    void BilanganSamaDengan(int bil){
        if (bil1 == bil){
            hasil = true;
        }else if(bil1 != bil){
            hasil = false;
        }
        System.out.println("Bilangan "+bil1+" sama dengan "+bil1+"\nHasil = "+hasil);
    }
}
