/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_Pertemuan4;

/**
 *
 * @author MSI GAMING
 */
 import java.util.Scanner;
class Employee {
    int id;
    String Name;
    int Age;
    long Salary;
    
    void setData(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n\tEnter Employee id : ");
        id = Integer.parseInt(sc.nextLine());
        
        System.out.println("\n\tEnter Employee Name : ");
        Name = sc.nextLine();
        
        System.out.println("\n\tEnter Employee Age : ");
        Age = Integer.parseInt(sc.nextLine());
        
        System.out.println("\n\tEnter Employee Salary : ");
        Salary = Integer.parseInt(sc.nextLine());
    }
    void putData(){
        System.out.print("\n\t" + id + "\t" + Name + "\t" + Age + "\t" + Salary);
    }
    public static void main(String[] args) {
        int n=3;
        int i;
        Employee [] Emp = new Employee[n];
        for(i = 0; i < n; i++){
            Emp[i] = new Employee();
        }
        for(i = 0; i < n; i++){
            System.out.println("\nEnter details of " + (i+1) + " Employee\n");
            Emp[i].setData();
        }
        System.out.println("\nDetails of Employee\n");
        for(i=0;i<n;i++){
            Emp[i].putData();
        }
        System.out.print("\n");
    }
}
