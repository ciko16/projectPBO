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
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();
        
        System.out.println(salary);
    }
}
