/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7;

/**
 *
 * @author MSI GAMING
 */
public class Bank {
    double saldo;
    double simpan;
    double ambil;

    Bank(double saldo_awal){
        saldo = saldo_awal;
    }
    void getSaldo2(){
        System.out.println("Selamat datang di bank ABC");
        System.out.println("Saldo saat ini: Rp."+saldo);
    }
    void simpanUang(double input){
        simpan = input;
        saldo += simpan;
        System.out.println("\nSimpan uang: Rp."+simpan);
        System.out.println("Saldo saat ini: Rp."+saldo);
    }
    void ambilUang(double input){
        ambil = input;
        ambil = saldo-ambil;
        System.out.println("\nAmbil uang: Rp."+ambil);
        System.out.println("Saldo saat ini: Rp."+saldo);
    }
}
