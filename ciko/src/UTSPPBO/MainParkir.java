/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTSPPBO;

/**
 *
 * @author MSI GAMING
 */
public class MainParkir {
    public static void main(String[] args) {
        MotorPCR vario = new MotorPCR("BM 0000 AB","motor",3,2);
        MotorPCR jazz = new MotorPCR("BA 1111 CD","mobil",1,3);
        
        System.out.println("Tarif Parkir Anda: ");
        System.out.println();
        System.out.println("Nomor Plat Kendaraan: "+vario.getPlat());
        System.out.println("Jenis Kendaraan: "+vario.getJenis());
        System.out.println("Jumlah Kendaraan: "+vario.getJumlah());
        System.out.println("Waktu Parkir Anda: "+vario.getWaktu());
        System.out.println("Tarif: "+vario.uangParkir());
        System.out.println();
        System.out.println("Nomor Plat Kendaraan: "+jazz.getPlat());
        System.out.println("Jenis Kendaraan: "+jazz.getJenis());
        System.out.println("Jumlah Kendaraan: "+jazz.getJumlah());
        System.out.println("Waktu Parkir Anda: "+jazz.getWaktu());
        System.out.println("Tarif: "+jazz.uangParkir());
    }
}
