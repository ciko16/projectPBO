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
public class Animal {
    protected void MakeSound(){
        System.out.println("....");
    }
}
 class Cat extends Animal{
    protected void MakeSound(){
        System.out.println("Miauuu..");
    }
}
class Dog extends Animal{
    protected void MakeSound(){
        System.out.println("Guk Guk..");
    }
}