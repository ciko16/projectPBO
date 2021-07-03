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
public class ODP1 extends Covid{
    private String nama,gejala,status;

    public String getStatus() {
        return status;
    }
    private int umur;

    public ODP1(String nama, String gejala, int umur,String status) {
        this.nama = nama;
        this.gejala = gejala;
        this.umur = umur;
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public String getGejala() {
        return gejala;
    }

    public int getUmur() {
        return umur;
    }

    @Override
    public void gejala() {
        if(getGejala().equals("sesak nafas")){
            System.out.println("Positif");
        }else if(getGejala().equals("demam")){
            System.out.println("Terindikasi");
        }else{
            System.out.println("Negatif");
        }
    }

    @Override
    public void status() {
        System.out.println("Kondisi ODP: "+status);
    }
    
    
}
