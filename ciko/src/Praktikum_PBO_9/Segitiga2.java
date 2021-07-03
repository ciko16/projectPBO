/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_9;
/**
 *
 * @author MSI GAMING
 */
public class Segitiga2 implements BangunDatar{
    private double alas,tinggi,sisi1,sisi2,sisi3;

    public double getSisi1() {
        return sisi1;
    }

    public void setSisi1(double sisi1) {
        this.sisi1 = sisi1;
    }

    public double getSisi2() {
        return sisi2;
    }

    public void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }

    public double getSisi3() {
        return sisi3;
    }

    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }
    
    public double getAlas(){
        return alas;
    }
    public void setAlas(double alas){
        this.alas = alas ;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi ;
    }

    @Override
    public double hitungLuas() {
        return alas*tinggi;
    }

    @Override
    public double hitungKeliling() {
        return sisi1+sisi2+sisi3;
    }
}
