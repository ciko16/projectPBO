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
class Person {
//composition has-a relationship
     private Job job;
     
     public Person(){
         this.job = new Job();
         job.setSalary(1000L);
     }
     public long getSalary(){
         return job.getSalary();
     }
}

public class TestPerson{
    public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();
        
        System.out.println(salary);
    }
}
