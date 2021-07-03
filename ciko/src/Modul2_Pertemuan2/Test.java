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
 class Test {
     public static void main(String[] args) {
         // create boxes using the various constructor
         Box mybox1 = new Box(1,2,1.5);
         Box mybox2 = new Box();
         Box mycube = new Box(7);
         
         double vol;
         
         vol = mybox1.volume();
         System.out.println(" Volume of mybox1 is " + vol);
         
         vol = mybox2.volume();
         System.out.println(" Volume of mybox2 is " + vol);
         
         vol = mycube.volume();
         System.out.println(" Volume of mycube is " + vol);
     }
}
