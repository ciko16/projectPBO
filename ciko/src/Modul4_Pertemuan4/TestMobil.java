/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_Pertemuan4;

/**
 *
 * @author MSI GAMING
 */
public class TestMobil {
    public static void main(String[] args) {
        Mobil mb[] = new Mobil[2];
        
        for(int i = 0; i < mb.length; i++){
            mb[i] = new Mobil();
        }
        
        for(int i = 0; i < mb.length; i++){
            mb[i].setData();
        }
        
        for(int i = 0; i < mb.length; i++){
            mb[i].Info();
        }
    }
}
