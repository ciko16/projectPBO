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
public class TelevisiA implements Control{
    String[] channelTv={"RCTI","SCTV","INDOSIAR","TRANS TV","TPI"};

    public void pindahChannel(int channel){
        System.out.println("Pindah channel pada tv A ke : "+channelTv[channel]);
    }

    public void PerbesarVolume(int intensitas){
        System.out.println("Perbesar intensitas volume pada tv A sebanyak :" + intensitas);
    }

    public void PerkecilVolume(int intensitas){
        System.out.println("Perkecil intensitas volume pada tv A sebanyak :" + intensitas);
    }
}
