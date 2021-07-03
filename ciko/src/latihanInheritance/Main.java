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
public class Main {
    public static void main(String[] args) {
        Circle ciko = new Circle();
        Cylinder coco = new Cylinder();
        
        ciko.setRadius(13);
        ciko.setColor("blue");
        
        System.out.println(ciko.toString());
        System.out.println("Jari jari lingkaran: "+ciko.getRadius());
        System.out.println("Warna Lingkaran: "+ciko.getColor());
        System.out.println("Luas lingkaran: "+ciko.getarea());
        System.out.println("");
        
        coco.setRadius(9);
        coco.setHeight(21);
        coco.setColor("red");
        
        System.out.println(coco.toString());
        System.out.println("jari jari Tabung: "+coco.getRadius());
        System.out.println("Tinggi Tabung: "+coco.getHeight());
        System.out.println("Warna Tabung: "+coco.getColor());
        System.out.println("Volume Tabung: "+coco.getVolume());
    }
}
