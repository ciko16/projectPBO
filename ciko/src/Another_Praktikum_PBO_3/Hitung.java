/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Another_Praktikum_PBO_3;

/**
 *
 * @author MSI GAMING
 */
public class Hitung {
    public int c,b;
    public double tambah,kurang;
    
    public Hitung(){
        c = 16;
        b = 13;
    }
    public void penjumlahan(){
        tambah = c+b;
        System.out.println("Hasil penjumlahan: "+tambah);
    }
    public void pengurangan(){
        kurang = c-b;
        System.out.println("Hasil pengurangan: "+kurang);
    }
}
