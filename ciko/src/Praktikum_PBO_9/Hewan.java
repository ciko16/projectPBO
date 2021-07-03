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
public abstract class Hewan {
    private String jenis;
    Hewan(String jenis){
        this.jenis=jenis;
    }
    protected abstract void suara();//dideklarasi tidak didefinisikan
    
    public String toString(){
        return "seekor "+jenis;
    }
}
