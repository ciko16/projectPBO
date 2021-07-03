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
   class Burung {
    public void terbang(){
        System.out.println("saya bisa terbang");
    }
    public void ribut(){
        System.out.println("saya suka meribut");
    }
}

 class Beo extends Burung{
    public void membeo(){
        System.out.println("saya suka meniru ucapan manusia");
    }
}

class BurungBeo{
    public static void main(String[] args) {
        Beo joni = new Beo();
        
        joni.terbang();
        joni.ribut();
        joni.membeo();
    }
}