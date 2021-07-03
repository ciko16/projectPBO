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
public class Bank {
    private String name;
    private int jmlPegawai=0;
    private String namaPegawai[]=new String[10];
    
    
    public Bank(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJmlPegawai() {
        return jmlPegawai;
    }

    public String getNamaPegawai(int i) {
        return (namaPegawai[i]);
    }

    public void setNamaPegawai(String namaPegawai) {
       if(jmlPegawai<10){
           this.namaPegawai[jmlPegawai]=namaPegawai;
           jmlPegawai++;
       }
    }
}
