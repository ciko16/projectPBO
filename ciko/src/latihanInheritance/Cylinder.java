/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanInheritance;

/**
 *
 * @author MSI GAMING
 */
public class Cylinder extends Circle{
     protected double height = 1.0;
    
    public Cylinder(){
        
    }
    
    public Cylinder(double height){
        this.height = height;
    }
    
    public Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }
    
    public Cylinder(double height, double radius, String color){
        this.height = height;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getRadius() {
        return radius;
    }

    @Override
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public String toString(){
        return "Menampilkan nilai Tabung";
    }
    
    public double getVolume(){
        final double phi = 3.14;
        double volume = phi*radius*radius*height;
        return volume;
    }
}
