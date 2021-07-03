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
public class LoginMain {
    public static void main(String[] args) {
       String jawab = "ya";
       Login ciko = new Login();
       Login bunga = new Login(null, null);

       do {
           int menu;
           menu = Integer.parseInt(JOptionPane.showInputDialog("MENU LOGIN"
                   + "\n1. Login Admin"
                   + "\n2. Ubah Password Admin"
                   + "\n3. Buat User"
                   + "\n4. Lihat Data User"
                   + "\n5. Keluar"));

           
           switch (menu) {
               case 1:
                   String username, password;
                   username = JOptionPane.showInputDialog("Masukkan Username");
                   password = JOptionPane.showInputDialog("Masukkan Password");

                   if (username.equals(ciko.getUname()) && password.equals(ciko.getPass())) {
                       JOptionPane.showMessageDialog(null, "Login Sukses");
                   } else {
                       JOptionPane.showMessageDialog(null, "Login Gagal");
                   }
                   break;
                   
               case 2:
                   String passwordAdmin, newPassword;
                   passwordAdmin = JOptionPane.showInputDialog("Masukkan Password Lama");
                   newPassword = JOptionPane.showInputDialog("Masukkan Password Baru");
                   if (ciko.getPass().equals(passwordAdmin)) {
                       ciko.setPass(newPassword);
                       JOptionPane.showMessageDialog(null, "Password Berhasil Diganti");
                   } else {
                       JOptionPane.showMessageDialog(null, "Password Lama Anda Tidak Sama");
                   }
                   break;
                   
               case 3:
                   bunga.setUser();
                   break;
                   
               case 4:
                   JOptionPane.showMessageDialog(null, "DATA USER\n"
                           + "USER 1"
                           + "\nUsername =" + ciko.getUname()
                           + "\nPassword =" + ciko.getPass()
                           + "\nUSER 2"
                           + "\nUsername =" + bunga.getUname()
                           + "\nPassword =" + bunga.getPass());
                   break;
                   
               case 5:
                   System.exit(0);
                   break;
                   
           }
       } while (jawab.equalsIgnoreCase(jawab));
   }
}
