/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_9;

/**
 *
 * @author MSI GAMING
 */
public class Demo {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(5,3);
        System.out.print("Luas Persegi panjang : ");
        System.out.print(pp.getLuas()+ " cm");
        System.out.println("");
        Segitiga s = new Segitiga(4,3);
        System.out.println("Luas Segitiga : ");
        System.out.println(s.getLuas()+ " cm");
        System.out.println("");
        Lingkaran l = new Lingkaran(6,3);
        System.out.println("Luas Lingkaran : ");
        System.out.println(l.getLuas()+ " cm");
    }
}
