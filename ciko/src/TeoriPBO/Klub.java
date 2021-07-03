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
public class Klub extends Pemain{
    //run time
    @Override
    public void Goal(){
        System.out.println("mencetak goal perfect hattrick");
    }
    //compile time
    public void Namaklub(){
        System.out.println("Chelsea F.C.");
    }
    public void Namaklub(String nama){
        System.out.println(nama);
    }
    public void versus(){
        System.out.println("melawan");
    }
    public void Skor(String skor){
        System.out.println(skor);
    }
}
