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
public class Circle {
    protected double radius = 1;
    protected String color = "red";
    
    public Circle(){
        
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius,String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString(){
        return "Mencari nilai lingkaran";
    }
    
    public double getarea(){
        final double phi = 3.14;
        double luas = phi*radius*radius;
        return luas;
    }
}
