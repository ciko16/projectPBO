/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;

/**
 *
 * @author MSI GAMING
 */
public class BolaMain {
    public static void main(String[] args) {
        Bola ciko = new Bola();
        Bola cico = new Bola("Basket",7);
        Bola coco = new Bola("Pimpong",10);
        Bola cika = new Bola("Kelereng",5);
        
        System.out.println("keadaan awal: ");
        ciko.hasil();
        System.out.println("\n");
        cico.hasil();
        System.out.println("\n");
        System.out.println("Keadaan setelah perubahan: ");
        coco.hasil();
        System.out.println("\n");
        cika.hasil();
        
    }
}
