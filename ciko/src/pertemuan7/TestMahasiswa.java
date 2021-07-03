/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

/**
 *
 * @author MSI GAMING
 */
public class TestMahasiswa {
    public static void main(String[] args) {
        pertemuan7.Mahasiswa m1 = new pertemuan7.Mahasiswa("Yuliska", 100, 100, 100);
        pertemuan7.Mahasiswa m2 = new pertemuan7.Mahasiswa();
        pertemuan7.Mahasiswa m3 = new pertemuan7.Mahasiswa(m2);

        m2.setNama("Tiara Santika");
        m2.setNilai(80, 85, 90);

        System.out.println(m1.toString());
        System.out.println("");
        System.out.println(m2.toString());
        System.out.println("");
        System.out.println(m3.toString());
    }
}
