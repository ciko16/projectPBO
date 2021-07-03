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
public class Circle extends Shape {
    private double radius;
    public Circle(String color) {
        super(color);
    }

    @Override
    double getArea() {
       
        return 0;
    }
     Circle(double radius){
        super("Abu abu");
        this.radius = radius;
    }
}
