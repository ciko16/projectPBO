/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GAMING
 */
public class lingkaran {
    double jari;
    double jari2;
    String warna;
    String warna2;
    double phi = 3.14;
    double luas;
    double luas2;
    double kel;
    double kel2;
    
    void luas(){
      luas =(phi*jari);
      luas2 =(phi*jari2);
    }
    void keliling(){
      kel =(phi*2*jari);
      kel2 =(phi*2*jari2);
    }
    lingkaran(){
        this.jari=3;
        this.warna="biru";
        this.jari2=6;
        this.warna2="hitam";
        
    }
    lingkaran(int r,String a,int b,String c){
        this.jari= r;
        this.warna =a;
        this.jari2=b;
        this.warna2=c;
    
    }   
}
