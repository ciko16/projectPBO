/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;
import Another_Praktikum_PBO_3.Mobil;
/**
 *
 * @author MSI GAMING
 */
public class TestMobil extends Mobil {
    public static void main(String[] args) {
        TestMobil m1 = new TestMobil();
    
        
        m1.merek="Toyota";
        m1.warna="Yellow";
        
        m1.beriMerek();
        m1.beriWarna();
    }
}
