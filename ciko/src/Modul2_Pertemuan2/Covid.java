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
public class Covid {
    double suhu;
    int virus,negatif;

    void swab(){
        if (suhu > 37){
            virus++;
            System.out.println("Anda Positf Corona");
        }else{
            negatif++;
            System.out.println("Anda baik-baik saja");
        }
    }
}
