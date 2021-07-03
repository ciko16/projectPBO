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
public class Mouse {
    private String tipe, merek;

    public String getTipe() {
        return tipe;
    }

    public String getMerek() {
        return merek;
    }

    public Mouse(String tipe, String merek) {
        this.tipe = tipe;
        
this.merek = merek;
    }

}