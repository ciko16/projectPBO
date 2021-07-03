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

    public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }
    public abstract void greets();
}

