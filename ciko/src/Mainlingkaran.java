/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GAMING
 */
public class Mainlingkaran {
    public static void main(String[] args) {
        lingkaran ciko12 = new lingkaran();
        lingkaran ciko16 = new lingkaran(4,"biru",13,"merah");
        
        System.out.println("lingkaran pertama \t\t lingkaran kedua");
        System.out.println("jari = " + ciko12.jari + "\t\t jari = " + ciko12.jari2);
        System.out.println("warna =" + ciko12.warna + "\t\t warna" + ciko12.warna2);
        ciko12.luas();
        System.out.println("luas =" + ciko12.luas + "\t\t luas =" + ciko12.luas2);
        
        ciko12.keliling();
        System.out.println("keliling ="+ciko12.kel + "\t keliling =" + ciko12.kel2);
        
        System.out.println("==========apabila berubah");
        System.out.println("lingkaran pertama \t\t lingkaran kedua");
        System.out.println("jari = "+ ciko16.jari + "\t\t jari ="+ ciko16.jari2);
        System.out.println("warna=" + ciko16.warna + "\t\t warna="+ciko16.warna2);
        ciko16.luas();
        System.out.println("luas = " + ciko16.luas + "\t\t luas = "+ ciko16.luas2);
        ciko16.keliling();
        System.out.println("keliling = " + ciko16.kel + "\t keliling =" + ciko16.kel2);
    }
}
