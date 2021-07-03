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
public class TestMajalah {
    public static void main(String[] args) {
        Majalah m1 = new Majalah();
        Majalah m2 = new Majalah();
        
        m1.nama = "Tempo";
        m2.nama = "Aneka Yes";
        
        m1.info();
        m2.info();
    }
}
