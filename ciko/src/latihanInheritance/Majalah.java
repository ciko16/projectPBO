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
public class Majalah extends Master{
    protected String penerbit;
    protected int stok;
    
    public Majalah(String judul,String penerbit,String kategori,int terbit,int stok){
        this.judul = judul;
        this.penerbit = penerbit;
        this.kategori = kategori;
        this.terbit = terbit;
        this.stok = stok;
    }
    
    @Override
    public void data(){
        System.out.println("Judul Majalah: " + judul);
        System.out.println("Nama Penerbit: " +  penerbit);
        System.out.println("Tahun Terbit: " + terbit);
        System.out.println("Kategori Majalah: " + kategori);
        System.out.println("Stok Majalah saat ini: " + stok);
    }
}
