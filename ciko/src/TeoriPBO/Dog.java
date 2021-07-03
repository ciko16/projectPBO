/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeoriPBO;

/**
 *
 * @author MSI GAMING
 */
public class Dog extends Animal{
    public Dog(String name){
        super("");
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog another){
        System.out.println("Woooof");
    }  
}
