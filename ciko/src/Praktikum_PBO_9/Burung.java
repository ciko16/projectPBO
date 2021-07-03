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
public class Burung extends Hewan {
    private String nama;

    Burung(String nama) {
        super("Burung");
        this.nama = nama;
    }

    @Override
    public void suara() {
        System.out.println("Berkicau");
    }

    public String toString() {
        return super.toString() + " " + nama;
    }
}
