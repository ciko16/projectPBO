/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GAMING
 */
public class persegi {
     int sisi ;
    int luas;
    int keliling;
    persegi(){
        this.sisi = 3;
    }
    persegi(int c){
        this.sisi = c;
    }
    persegi(persegi hello){
        this.sisi=hello.sisi;
    }
    void getluas(){
        luas = sisi*sisi;
        System.out.println("luas persegi adalah "+luas);
    }
    int getkeliling(){
    keliling = sisi+sisi;
    return keliling;
    }
}
