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
public class Buku extends Master{
    
    public Buku(String judul,String kode,String pengarang,int terbit,String kategori){
            this.judul=judul;
            this.kode=kode;
            this.pengarang=pengarang;
            this.kategori=kategori;
            this.terbit=terbit;
}
    @Override
    public void data(){
        System.out.println("Judul Buku: "+judul);
        System.out.println("Kode Buku: "+kode);
        System.out.println("Pengarang: "+pengarang);
        System.out.println("Tahun Terbit: "+terbit);
        System.out.println("Kategori: "+kategori);
    }
}
