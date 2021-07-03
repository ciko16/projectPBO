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
public class Anjing extends Hewan{
    private String nama;
    Anjing(String nama){
        super("Anjing");
        this.nama=nama;
    }
    public void suara(){
        System.out.println("Menggong-gong...");
    }
    public String toString(){
        return super.toString()+" "+nama;
    }
}
