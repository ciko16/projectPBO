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
public class PemainBolaKlubBola2 {
    public static void main(String[] args) {
        //klub 1
        PemainBola2 p1 = new PemainBola2("David","Jl. Umban Sari");
        PemainBola2 p2 = new PemainBola2("Daniel", "Jl. Kembang Sari");
        KlubBola2 klub1 = new KlubBola2 ("MU");
        
        klub1.addPemain(p1);
        klub1.addPemain(p2);
        klub1.displayPemain();
        
        //klub 2
        KlubBola2 klub2 = new KlubBola2 ("Chelsea");
        PemainBola2 p3 = new PemainBola2("Oman","Jl. Umban Sari");
        PemainBola2 p4 = new PemainBola2("Stephen", "Jl. Kembang Sari");
        
        klub2.addPemain(p3);
        klub2.addPemain(p4);
        klub2.addPemain("Idris","Jl. Yos");
        
        System.out.println();
        klub2.displayPemain();
    }
}
