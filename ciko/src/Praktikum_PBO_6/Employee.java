/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_6;

/**
 *
 * @author MSI GAMING
 */
public class Employee {
    private String name;
    
    //employee name
    Employee(String name){
        this.name = name;
    }
    public String getEmployeeName(){
        return this.name;
    }
}
