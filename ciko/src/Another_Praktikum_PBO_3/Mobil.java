/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Another_Praktikum_PBO_3;

/**
 *
 * @author MSI GAMING
 */
public class Mobil {
    protected String warna;
    protected String merek;
    
    protected Mobil(){
        warna = "";
        merek = "";
    }
    
    protected void beriWarna(){
        System.out.println("Warna mobil ini adalah " + warna);
    }
    
    protected void beriMerek(){
        System.out.println("Merek mobil ini adalah " + merek);
    }
}
