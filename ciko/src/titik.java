/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GAMING
 */
public class titik {
    int x;
    int y;
     titik(){
        x=0;
        y = 0;
    }
    titik(int a, int b){
        x = a;
        y = b;
        
    }
    void geserkanan(){
        x=x+1;
    }
    void geserkiri(){
        x-=1;
    }
    void geseratas(){
    y+=1;
    }
    void geserbawah(){
        y-=1;
    }
}
