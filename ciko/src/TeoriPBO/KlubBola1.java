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
public class KlubBola1 {
    String namaKlub;
    PemainBola1 pemain;
    
    public KlubBola1 (String namaKlub){
        this.namaKlub = namaKlub;
    }
    
    public KlubBola1 (String namaKlub, PemainBola1 pemain){
        this.namaKlub = namaKlub;
        this.pemain = pemain;
    }
    
    public void setPemain (String nama, String alamat){
        pemain = new PemainBola1 (nama, alamat);
    }
}
