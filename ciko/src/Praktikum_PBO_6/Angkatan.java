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
public class Angkatan {
    private int tahun;
    private int kelasbuka [] = new int [10];
    private int jumlah;

    Angkatan(int tahun){
        this.tahun=tahun;
    }
    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getKelasbuka(int urutan) {
        return kelasbuka[urutan];
    }

    public void setKelasbuka(int kelasbuka) {
        if(jumlah < this.kelasbuka.length){
            this.kelasbuka[jumlah]=kelasbuka;
            jumlah++;
        }
}
}