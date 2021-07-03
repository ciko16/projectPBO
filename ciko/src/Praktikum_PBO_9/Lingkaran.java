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
public class Lingkaran extends Pola{
    private int phi,jari;
    
    public Lingkaran(int phi,int jari){
        this.phi=phi;
        this.jari=jari;
    }
    @Override
    public double getLuas() {
        return phi*jari*jari;
    }
    public String toString(){
        return "Lingkaran";
    }
}
