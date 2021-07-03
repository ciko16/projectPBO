/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriPBO;

/**
 *
 * @author MSI GAMING
 */
public class KlubBola2 {
    String namaKlub;
    PemainBola2 daftar[] = new PemainBola2[11];
    int jmlPemain = 0;
    
    public KlubBola2 (String namaKlub){
        this.namaKlub = namaKlub;
    }
    
    public void addPemain (PemainBola2 p){
        this.daftar[jmlPemain] = p;
        this.jmlPemain++;
    }
    
    public void addPemain (String nama, String alamat){
        PemainBola2 p = new PemainBola2 (nama, alamat);
        this.daftar[jmlPemain]=p;
        this.jmlPemain++;
    }
    
    public void displayPemain(){
        int i;
        System.out.println("Nama Klub : "+this.namaKlub);
        System.out.println("Daftar Pemain : ");
        System.out.println("No\t"+"Nama\t"+"Alamat");
        for (i=0; i < jmlPemain; i++) {
            System.out.println((i+1)+". \t"+daftar[i].nama+"\t"+daftar[i].alamat);
        }
    }
}
