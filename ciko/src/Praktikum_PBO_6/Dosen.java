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
public class Dosen {
    private String kodeDosen;
    private String [] nimMhs = new String[5];
    private int jumlahMhs;
    
    public Dosen(){
        
    }

    public String getKodeDosen() {
        return kodeDosen;
    }

    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public String getNimMhs(int indeks) {
        return nimMhs[indeks];
    }

    public void setNimMhs(String nimMhs) {
        if (jumlahMhs < this.nimMhs.length){
            this.nimMhs[jumlahMhs]=nimMhs;
            jumlahMhs++;
        }
    }

    public int getJumlahMhs() {
        return jumlahMhs;
    }

    public void setJumlahMhs(int jumlahMhs) {
        this.jumlahMhs = jumlahMhs;
    }
}
