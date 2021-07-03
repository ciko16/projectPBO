/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GAMING
 */
public class TestHuman {
    public static void main(String[] args) {
        Human chara1 = new Human();
        Human chara2 = new Human();
        
        System.out.println("sifat dan perilaku manusia:");
        System.out.println("");
        chara1.sifat("periang");
        chara1.perasaan("sedih");
        chara2.perasaan("senang");
        chara2.sifat("baik hati");
    }
}
