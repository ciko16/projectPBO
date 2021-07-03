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
public class MainGudang {
    public static void main(String[] args) {
        barang br = new barang();
        br.setId(13042001);
        br.setNama("Anggrek");
        br.setHarga(100000);
        br.setJumlah(4);
       
        br.tampil();
        br.setData();
    }
}
