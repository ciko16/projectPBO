/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSPPBO;

/**
 *
 * @author MSI GAMING
 */
public class Motor {
    private String merk;
    private String transmisi;
    private String warna;
    private String tipe;
    private int kecepatan = 0;
    
    public Motor(){
        
    }

    public Motor(String merk, String transmisi, String warna, String tipe,int kecepatan) {
        this.merk = merk;
        this.transmisi = transmisi;
        this.warna = warna;
        this.tipe = tipe;
        this.kecepatan = kecepatan;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTransmisi() {
        return transmisi;
    }

    public void setTransmisi(String transmisi) {
        this.transmisi = transmisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getKecepatan() {
        if(kecepatan > 1){
        return kecepatan = kecepatan+10;
    }else{
    return kecepatan =kecepatan-10;
}
    }
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
}
