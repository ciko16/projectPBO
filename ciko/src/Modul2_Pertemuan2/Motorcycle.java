/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_Pertemuan2;

/**
 *
 * @author MSI GAMING
 */
public class Motorcycle {
    
    String make;
    String color;
    boolean engineState;
    
    void startEngine(){
        if (engineState == true)
            System.out.println("The engine is already on.");
        else{
            engineState = true;
            System.out.println("The engine is now on.");
        }
    }
    void showAtts(){
        System.out.println("This motorcycle is a " + color + " " + make);
        if (engineState == true)
            System.out.println("The engine is on");
        else System.out.println("The engine is off.");
    }
    public static void main(String[] args) {
        Motorcycle m = new Motorcycle();
        m.make = "Yamaha RZ350";
        m.color = "yellow";
        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("-------");
        System.out.println("Starting engine...");
        m.startEngine();
        System.out.println("-------");
        System.out.println("Calling showAtts...");
        m.showAtts();
        System.out.println("-------");
        System.out.println("Starting engine...");
        m.startEngine();
    }
}
