/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_7;

/**
 *
 * @author MSI GAMING
 */
public class BangunDatar {
    protected double luas(){
        System.out.println("Menghitung luas bangun datar");
        return 0;
    }
    protected double keliling(){
        System.out.println("Menghitung keliling bangun datar");
        return 0;
    }
}

 class Segitiga extends BangunDatar{
    String nama;
    double alas,tinggi,sisi1,sisi2,sisi3;
    
    public Segitiga(String nama,double alas,double tinggi,double sisi1,double sisi2,double sisi3){
        this.nama=nama;
        this.alas=alas;
        this.tinggi=tinggi;
        this.sisi1=sisi1;
        this.sisi2=sisi2;
        this.sisi3=sisi3;
    }
    public Segitiga(){
        this.alas=this.tinggi=this.sisi1=this.sisi2=this.sisi3=0;
    }

    @Override
    public double luas() {
         super.luas();
         return 0.5*alas*tinggi;
    }

    @Override
    public double keliling() {
         super.keliling(); 
         return sisi1+sisi2+sisi3;
    }
}

