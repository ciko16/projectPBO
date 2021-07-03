/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_7;

/**
 *
 * @author MSI GAMING
 */
public class Pegawai2 extends Perusahaan{
    String nama, jenis,bagian;
    double gajiPegawai, gajiKontrak, tunjangan, bonusPegawai, bonusKontrak, lembur, jam, total;
    
    public Pegawai2(){
        jam = 3;
        gajiPegawai = 4000000;
        gajiKontrak = 3000000;
        tunjangan = 500000;
        bonusPegawai = 50000*jam;
        bonusKontrak = tunjangan*0.002;
        lembur = 50000*jam;
    }
    
    @Override
    public void pegawai(String jenis){
        if(jenis.equals("Tetap")){
            total = gajiPegawai +tunjangan+ bonusPegawai;
            System.out.println("Total penghasilan: "+total);
        }else if(jenis.equals("Kontrak")){
            total = gajiKontrak +bonusKontrak+ lembur;
            System.out.println("Total penghasilan: "+total);
        }else{
            System.out.println("jenis yang anda masukkan tidak sesuai");
        }
    }
    
    public void info(){
        System.out.println("Nama pegawai: "+nama);
        System.out.println("Jenis pegawai: "+jenis);
        System.out.println("Jabatan: "+bagian);
    }
    
    @Override
    public void perusahaan(){
        super.perusahaan();
    }
}
