/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GAMING
 */
public class Maintitik {
    public static void main(String[] args) {
        titik obj = new titik();
        titik obj2 = new titik(4, 3);

        System.out.println("keadaan awal");
        System.out.println("titik 1");
        System.out.println("x =" + obj.x);
        System.out.println("y =" + obj.y);
        System.out.println("\ntitik2");
        System.out.println("x =" + obj2.x);
        System.out.println("y =" + obj2.y);

        System.out.println("keadaan bergeser");
        obj.geserkanan();
        obj.geserkanan();
        obj.geserbawah();
        obj.geserbawah();
        obj.geserbawah();
        obj2.geseratas();

        System.out.println("titik 1");
        System.out.println("x =" + obj.x);
        System.out.println("y =" + obj.y);
        System.out.println("\ntitik2");
        System.out.println("x =" + obj2.x);
        System.out.println("y =" + obj2.y);

    }
}
