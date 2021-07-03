/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_7;

/**
 *
 * @author MSI GAMING
 */
public class TestKerja {
    public static void main(String[] args) {
        int total = 0;
        
        Pegawai p1 = new Pegawai();
        Programmer p2 = new Programmer();
        
        p1.gaji = 5000000;
        p2.bonus = 2000000;
        p1.pegawai();
        p2.programmer();
        p1.Aturan();
        p1.gajiPokok();
        p2.Khusus();
        p2.bonusGaji();
        
        total = p1.gaji + p2.bonus;
        System.out.println("Total gaji: "+total);
    }
}
