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
public class StudentClass {
    int rollNum;
    String studentName;
    //Creating HAS-A relationship with address class
    Address studentAddr;
    StudentClass(int roll,String name,Address addr){
        this.rollNum=roll;
        this.studentName=name;
        this.studentAddr = addr;
    }
    public static void main(String[] args) {
        Address ad = new Address(55, "Agra","UP","India");
        StudentClass obj = new StudentClass(123,"Chaitanya",ad);
        System.out.println(obj.rollNum);
        System.out.println(obj.studentName);
        System.out.println(obj.studentAddr.streetNum);
        System.out.println(obj.studentAddr.city);
        System.out.println(obj.studentAddr.state);
        System.out.println(obj.studentAddr.country);
    }
}
