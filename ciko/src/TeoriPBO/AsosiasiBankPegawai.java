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
public class AsosiasiBankPegawai {
    public static void main(String[] args) {
        Bank bank = new Bank("Mandiri");
        
        Pegawai pg1 = new Pegawai("Budi");
        Pegawai pg2 = new Pegawai("Wati");
        
        bank.setNamaPegawai(pg1.getName());
        bank.setNamaPegawai(pg2.getName());
        
        System.out.println("Jumlah pegawai: " + bank.getJmlPegawai());
        System.out.println("Nama-nama Pegawai: ");
        for(int i = 0; i<bank.getJmlPegawai();i++){
            System.out.println((i+1)+". "+bank.getNamaPegawai(i));
        }
    }
}
