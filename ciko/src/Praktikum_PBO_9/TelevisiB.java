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
public class TelevisiB implements Control{
     String[] chanTV = {"TVRI", "LA TV", "TV 7", "RCTI", "SCTV"};

    public void pindahChannel(int channel){
        System.out.println("Perintah pindah channel pada tv B ke : "+chanTV[channel]);
    }

    public void PerbesarVolume(int intensitas){
        System.out.println("Perbesar intensitas volume pada tv B sebanyak : "+intensitas);
    }

    public void PerkecilVolume(int intensitas){
        System.out.println("Perkecil intensitas volume pada tv B sebanyak : "+intensitas);
    }
}
