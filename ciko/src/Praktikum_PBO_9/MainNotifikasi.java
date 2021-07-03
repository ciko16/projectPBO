/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_9;

/**
 *
 * @author MSI GAMING
 */
public class MainNotifikasi {
    public static void main(String[] args) {
        EmailNotification email = new EmailNotification();
        SMSNotification sms = new SMSNotification();
        
        email.sendMessage("19tiepbo@pcr.ac.id","Sorry,there is no give up word in my directory");
        sms.sendMessage("+6200008888","PBO is easy peasy");
    }
   
}
