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
public class Segitiga extends Pola{
    private int alas,tinggi;
    
    public Segitiga(int alas,int tinggi){
        this.alas=alas;
        this.tinggi=tinggi;
    }
    @Override
    public double getLuas() {
       return alas*tinggi;
    }
    public String toString(){
        return "Segitiga";
    }
}
