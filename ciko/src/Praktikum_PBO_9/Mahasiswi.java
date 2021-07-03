/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_9;

/**
 *
 * @author MSI GAMING
 */
public class Mahasiswi extends Nilai{
    private String nama;
    private int nilai1, nilai2, nilai3, nilai4;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNilai1() {
        return nilai1;
    }

    public void setNilai1(int nilai1) {
        this.nilai1 = nilai1;
    }

    public int getNilai2() {
        return nilai2;
    }

    public void setNilai2(int nilai2) {
        this.nilai2 = nilai2;
    }

    public int getNilai3() {
        return nilai3;
    }

    public void setNilai3(int nilai3) {
        this.nilai3 = nilai3;
    }

    public int getNilai4() {
        return nilai4;
    }

    public void setNilai4(int nilai4) {
        this.nilai4 = nilai4;
    }
    @Override
    public double nilaiTinggi() {
        int nilai = 0;
      if (nilai1 > 81){
          return nilai = nilai1;
      }else if (nilai2 > 81){
          return nilai = nilai2;
      }else if (nilai3 > 81){
          return nilai = nilai3;
      }else if (nilai4 > 81){
          return nilai = nilai4;
      }
        return nilai;
    }

    @Override
    public double Average() {
         double avg;
       avg = (nilai1 + nilai2 + nilai3 + nilai4) / 4;
       return avg;   
    }
    
}
