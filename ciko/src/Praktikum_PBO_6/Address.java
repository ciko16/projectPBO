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
 class Address {
    int streetNum;
    String city;
    String state;
    String country;
    Address(int street,String c, String st, String coun){
        this.streetNum=street;
        this.city = c;
        this.state = st;
        this.country = coun;
}
 }
