/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_6;

/**
 *
 * @author MSI GAMING
 */
public class Komputer {
    CPU cpu;
    Mouse mouse;
    Keyboard keyboard;
    private String tipe, merek;

    public Komputer(String tipe, String merek) {
        CPU a1 = new CPU("C23G","INTEL");
        Mouse a2 = new Mouse("M45H", "Asus");
        Keyboard a3 = new Keyboard("KR89", "Asus");
        this.tipe = tipe;
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public String getMerek() {
        return merek;
    }

}
