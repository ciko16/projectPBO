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
    public class BigDog extends Dog{
    public BigDog(String name){
        super("");
    }
    public void greets(){
        System.out.println("Woow");
    }
    public void greets(Dog another){
        System.out.println("Woooooow");
    }
    public void greets(BigDog another){
        System.out.println("Wooooooooow");
    }
}
