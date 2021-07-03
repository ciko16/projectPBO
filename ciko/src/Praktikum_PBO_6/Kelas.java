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
public class Kelas {
    private String idkelas;
    private int kuota;

    Kelas(String id,int k){
        this.idkelas=id;
        this.kuota=k;
    }
    public String getIdkelas() {
        return idkelas;
    }

    public void setIdkelas(String idkelas) {
        this.idkelas = idkelas;
    }

    public int getKuota() {
        return kuota;
    }

    public void setKuota(int kuota) {
        this.kuota = kuota;
    }
}
