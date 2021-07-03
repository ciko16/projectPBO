/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanInheritance;

/**
 *
 * @author MSI GAMING
 */
public class MainDoramini {
    public static void main(String[] args) {
        DoraMini dm = new DoraMini();
        dm.setNama("Emilia");
        dm.setPemilik("Subaru");
        dm.setTahunPembuatan(2050);
        
        dm.sayDora();
        dm.displayKantongAjaib();
        dm.displayData();
    }
}
