/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_6;

/**
 *
 * @author MSI GAMING
 */
public class BelanjaDaftarBelanjaMain {
    public static void main(String[] args) {
        DaftarBelanja baba = new DaftarBelanja("Baju", 15000);
        DaftarBelanja bibi = new DaftarBelanja("Celana", 25000);
        DaftarBelanja bubu = new DaftarBelanja("Sepatu", 55000);
        DaftarBelanja bebe = new DaftarBelanja("Kaos Kaki", 25000);
        DaftarBelanja bobo = new DaftarBelanja("Tas", 45000); 
        
        Belanja coco = new Belanja("Abigael");
        Belanja coki = new Belanja("Tiara");
        
        coco.beliBarang(baba);
        coco.beliBarang(bubu);
        coco.beliBarang(bobo);
        
        coki.beliBarang(bibi);
        coki.beliBarang(bubu);
        coki.beliBarang(bobo);
        
        System.out.println();
        coco.displayPembelian();
        
        System.out.println();
        coki.displayPembelian();
    }
}
