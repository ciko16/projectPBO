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
public class MainKomputer {
    public static void main(String[] args) {
        Komputer obj1 = new Komputer("A123F","Asus");
        Komputer obj2 = new Komputer("C23G","Intel");
        System.out.println("Tipe Komputer :"+obj1.getTipe());
        System.out.println("Merk Komputer : "+obj1.getMerek());
        System.out.println("Tipe Cpu :"+obj2.cpu.getTipe());
        System.out.println("Merk cpu :"+obj2.cpu.getMerek());
        
    }
}
