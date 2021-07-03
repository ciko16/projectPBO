/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GAMING
 */
public class test2 {

    public static void main(String[] args) {
        televisi obj1 = new televisi();
        televisi obj2 = new televisi();

        
        obj1.nama = "thosiba";

        System.out.println("nama " + obj1.nama);
        System.out.println("chennel " + obj1.chennel);
        System.out.println("volume " + obj1.volume);

        
        System.out.println("\n\nkondisi berubah 1 ===========");
        obj1.changechannel("net.tv");
        obj1.volume = 10;
        System.out.println("nama " + obj1.nama);
        System.out.println("chennel "+obj1.chennel);
        System.out.println("volume ");
        obj1.volup();
        
        
        
        System.out.println("\n\nkondisi berubah 2 ===============");
        System.out.println("nama " + obj1.nama);
        System.out.println("chennel " + obj1.chennel);
        System.out.println("volume ");
        obj1.voldown();

    }
}