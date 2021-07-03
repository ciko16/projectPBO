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
    class Bank {
     private String name;
    
     // bank name
     Bank(String name){
         this.name = name;
     }
     public String getBankName(){
         return this.name;
     }
}
