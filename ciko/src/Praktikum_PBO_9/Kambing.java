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
   public class Kambing extends Hewan {
    private String nama;

    Kambing(String nama) {
        super("Kambing");
        this.nama = nama;
    }

    public void suara() {
        System.out.println("Mengembik");
    }

    public String toString() {
        return super.toString() + " " + nama;
    } 
}
