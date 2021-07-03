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
public class Tugas3 {
    String pemain,bola;
    int nomor;
    
    
    void menendang(){
        System.out.println(pemain + " menendang bola");
    }
    void noPunggung( int nomor){
        this.nomor = nomor;
        System.out.println(pemain + " bernomor punggung : " + nomor);
}
    void berlari(){
        System.out.println(pemain + " berlari membawa bola");
    }
    void goal(){
        this.bola = "goal";
        System.out.println(pemain+" menyetak " + bola);
    }
}
