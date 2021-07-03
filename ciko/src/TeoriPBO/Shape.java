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
abstract class Shape {
    abstract double  getArea();
    
    public String color;
    
    public  Shape(String color){
        System.out.println(color);
    }
}
