/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_6;

/**
 *
 * @author MSI GAMING
 */
public class mahasiswajurusanMain {
    public static void main(String[] args) {
        Jurusan obj = new Jurusan("TI", "teknik informatika");
        mahasiswa1 obj1 = new mahasiswa1("cantika", "101", obj);

        System.out.println("mahasiswa 1");
        System.out.println("nim :" + obj1.Nim);
        System.out.println("nama :" + obj1.Nama);
        System.out.println("kode jurusan :" + obj1.Jurusan.KodeJurusan);
        System.out.println("jurusan :" + obj1.Jurusan.NamaJurusan);

        Jurusan a = new Jurusan("SI", "sistem informasi");
        mahasiswa1 obj2 = new mahasiswa1("joni", "112", a);
        System.out.println("\nmahasiswa 2");
        System.out.println("nim :" + obj2.Nim);
        System.out.println("nama :" + obj2.Nama);
        System.out.println("kode jurusan :" + obj2.Jurusan.KodeJurusan);
        System.out.println("jurusan :" + obj2.Jurusan.NamaJurusan);
    }
}
