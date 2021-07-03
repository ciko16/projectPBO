/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_Pertemuan4;
import javax.swing.JOptionPane;
/**
 *
 * @author MSI GAMING
 */
public class Login {
    private String username, password;

   Login(){
       this.username = "admin";
       this.password = "123";
   }
   
   Login (String username, String password){
       this.username = username;
       this.password = password;
   }

   public String getUname() {
       return username;
   }

   public void setUname(String username) {
       this.username = username;
   }

   public String getPass() {
       return password;
   }

   public void setPass(String password) {
       this.password = password;
   }
   
   public void setUser(){
      setUname(JOptionPane.showInputDialog("Masukkan Username"));
      setPass(JOptionPane.showInputDialog("Masukkan Password"));
   }
}

