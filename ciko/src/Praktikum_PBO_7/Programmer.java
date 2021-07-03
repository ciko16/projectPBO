/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_7;

/**
 *
 * @author MSI GAMING
 */
public class Programmer extends Kerja{
    int bonus;
    
    public Programmer(){
        this.bonus = 0;
    }
    
    public void Khusus(){
        System.out.println("Programmer melakukan monitoring sistem perusahaan");
        System.out.println("Programmer melayani error complain");
    }
    
    public void bonusGaji(){
        System.out.println("Bonus gaji adalah "+bonus);
    }
    
    @Override
    public void programmer(){
        super.programmer();
    }
}
