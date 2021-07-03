/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author MSI GAMING
 */
abstract class Mahasiswa {
    String nama;
    int nilai;
    abstract void isiBiodata(String nama,int nilai);
    public void registrasi(){
        System.out.println("nama telah melakukan registrasi:"+nama);
    }
    public void testMasuk(){
        System.out.println("nilai test anda:"+nilai);
    }
}


