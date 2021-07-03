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
public class EmailNotification implements Notifikasi {

    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim email ke: "+receiver+"dengan isi pesan"+content);
    }
}
