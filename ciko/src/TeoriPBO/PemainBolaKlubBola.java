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
public class PemainBolaKlubBola {
    public static void main(String[] args) {
        //Cara 1
        PemainBola p1 = new PemainBola("David","Jl. Umban Sari");
        KlubBola klub1 = new KlubBola ("MU",p1);
        
        System.out.println("Nama Klub : "+klub1.getNamaKlub());
        System.out.println("Nama Pemain : "+klub1.getNamaPemain());
        System.out.println("Alamat Pemain : "+klub1.getAlamatPemain());
        
        //Cara 2
        KlubBola klub2 = new KlubBola("Chelsea");
        klub2.setPemain("George", "Jl. Paus");
        
        System.out.println();
        System.out.println("Nama Klub : "+klub2.getNamaKlub());
        System.out.println("Nama Pemain : "+klub2.getNamaPemain());
        System.out.println("Alamat Pemain : "+klub2.getAlamatPemain());
}
}
