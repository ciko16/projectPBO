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
public class Job {
    private String role;
    private long salary;
    private int id;
    
    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }
    public long getSalary(){
        return salary;
    }
    public void setSalary(long salary){
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
}
