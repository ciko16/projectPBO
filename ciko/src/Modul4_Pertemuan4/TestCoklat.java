/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul4_Pertemuan4;
import java.util.Scanner;
/**
 *
 * @author Ciko - Wedri
 *///class implementasi
public class TestCoklat {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int a = 0, b = 0, c = 0, d = 0, e = 0,array;
    String jenis = null, harga;
    
    Coklat ciko[] = new Coklat[5];
    
    String HargaCoklat []=new String  [5];
    System.out.println("Inputkan harga coklat : ");
    harga = input.nextLine();
    HargaCoklat = harga.split(" ");
    
        System.out.println("Input Panjang Array");
        array = Integer.parseInt(input.nextLine());
        
        for (int i = 0; i < 5; i++){
            ciko[i] = new Coklat();
            ciko[i].setJumlahCoklat(0);
            ciko[i].setHargaCoklat(Integer.parseInt(HargaCoklat[i]));
        }
        System.out.println("");
        
        for(int i = 0; i < array; i++){
            System.out.println("Masukkan jumlah dari jenis coklat yang terjual : ");
            String JenisCoklat = input.nextLine();
            String[] JenisTerjual = JenisCoklat.split(" ");
            
            switch (JenisTerjual[i]){
                case "A":
                    a += Integer.parseInt(JenisTerjual[2]);
                    ciko[0].setJumlahCoklat(a);
                    break;
                case "B":
                    b += Integer.parseInt(JenisTerjual[2]);
                    ciko[1].setJumlahCoklat(b);
                    break;
                case "C":
                    c += Integer.parseInt(JenisTerjual[2]);
                    ciko[2].setJumlahCoklat(c);
                    break;
                case "D":
                    d += Integer.parseInt(JenisTerjual[2]);
                    ciko[3].setJumlahCoklat(d);
                    break;
                case "E":
                    e += Integer.parseInt(JenisTerjual[2]);
                    ciko[4].setJumlahCoklat(e);
                    break;
            }
        }
        System.out.println("A " + ciko[0].getJumlahCoklat());
        System.out.println("B " + ciko[1].getJumlahCoklat());
        System.out.println("C " + ciko[2].getJumlahCoklat());
        System.out.println("D " + ciko[3].getJumlahCoklat());
        System.out.println("E " + ciko[4].getJumlahCoklat());
        
        int total = 0;
        
        for (int i = 0; i < 5; i++){
            total += ciko[i].getJumlahCoklat()*ciko[i].getHargaCoklat();
        }
        System.out.println(total);
    }
}

