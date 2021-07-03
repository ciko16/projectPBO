/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GAMING
 */
public class televisi {
    String chennel;
    String nama;
    int volume ;
    
    void volup(){
        int vol=volume+10;
        volume = vol;
        System.out.println(vol);
    }
    void voldown(){
        int vol=volume-5;
        volume=vol;
        System.out.println(vol);
    }
    String changechannel(String a){
        chennel= a;
        return chennel;
    }
    
}
