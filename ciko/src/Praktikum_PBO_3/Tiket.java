/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;

/**
 *
 * @author MSI GAMING
 */
public class Tiket {
    private String maskapai, tanggal ,nomor, berangkat;
    
    Tiket(){
        maskapai = "Garuda Indonesia";
    }
    Tiket(String maskapai, String tanggal, String nomor, String berangkat){
        this.maskapai = maskapai;
        this.tanggal = tanggal;
        this.nomor = nomor;
        this.berangkat = berangkat;
    }
    public String getMaskapai(){
        return maskapai;
    }
    public String getTanggal(){
        return tanggal;
    }
    public String getNomor(){
        return nomor;
    }
    public String getBerangkat(){
        return  berangkat;
    }
    public void setMaskapai(String maskapai){
        this.maskapai = maskapai;
    }
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }
     public void setNomor(String nomor){
        this.nomor = nomor;
     }
      public void setBerangkat(String berangkat){
        this.berangkat = berangkat;
      }
      
      void ingfo(){
          System.out.println("Maskapai: "+getMaskapai());
          System.out.println("Nomor kursi: "+getNomor());
          System.out.println("Keberangkatan: "+getBerangkat());
          System.out.println("Tanggal berangkat: "+getTanggal());
      }
}
