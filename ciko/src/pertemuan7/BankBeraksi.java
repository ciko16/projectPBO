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
public class BankBeraksi {
    public static void main(String[] args) {
        Bank obj = new Bank(100000);

        obj.getSaldo2();
        obj.simpanUang(500000);
        obj.ambilUang(150000);
    }
}
