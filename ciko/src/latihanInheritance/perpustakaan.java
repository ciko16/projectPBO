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
public class perpustakaan {
    public static void main(String[] args) {
        Master m = new Master();
        Master b1 = new Buku("Bumi","464","Tere Liye",2014,"NO");
        Master m1 = new Majalah("Bobo","U6139","AN", 2007,20);
        
         m.data();
        System.out.println("");
        b1.data();
        System.out.println("");
        m1.data();
    }
}
