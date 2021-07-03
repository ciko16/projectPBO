/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2_Pertemuan2;

/**
 *
 * @author MSI GAMING
 */
public class MainTugas2 {
    public static void main(String[] args) {
        Tugas2 cika = new Tugas2();
        Tugas2 coco = new Tugas2();
        
        cika.nilai = 85;
        
        coco.nilai = 50;
        
        
        System.out.println("");
        cika.nama = "Bunga";
        cika.nilai();
        cika.penilaian();
        
        System.out.println("");
        coco.nama = "bad luck bryan";
        coco.nilai();
        coco.penilaian();
    }
}
