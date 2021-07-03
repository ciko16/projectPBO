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
public class Mobil {
    String wrn;
    String merk;
    
    public Mobil(){
    }
    
    public void setData(){
        wrn = JOptionPane.showInputDialog("inputkan warna kendaraan : ");
        merk = JOptionPane.showInputDialog("inputkan merek kendaraan : ");
    }
    public void Info(){
        System.out.println("Warna : "+wrn+"\nMerek : "+merk);
    }
}
