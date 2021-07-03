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
    public class MainAnimal {
    public static void main(String[] args) {
        Cat garfield = new Cat("");
        Dog doggy = new Dog("");
        BigDog BigJack = new BigDog("");

        garfield.greets();
        doggy.greets();
        doggy.greets(doggy);
        BigJack.greets();
        BigJack.greets(doggy);
        BigJack.greets(BigJack);
    }
}
