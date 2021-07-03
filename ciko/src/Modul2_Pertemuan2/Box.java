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
public class Box {
    double width, heigth, depth;
    
    Box (double w, double h, double d){
        width = w;
        heigth = h;
        depth = d;
    }
    
    Box(){
        width = heigth = depth = 0;
    }
    
    Box(double len){
        width = heigth = depth = len;
    }
    
    double volume(){
        return width * heigth * depth;
    }
}
