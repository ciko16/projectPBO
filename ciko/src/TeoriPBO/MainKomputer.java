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
public class MainKomputer {
    public static void main(String[] args) {
        Komputer komputer = new Komputer ("asus","A450CC",new Mouse("Asus"),
        new Keyboard ("Lenovo 1234"),new Cpu("intel core 100"));
        
        System.out.println("spesifikasi komputer :");
        System.out.println("merek : "+komputer.getMerk());
        System.out.println("tipe  : "+komputer.getTipe());
        System.out.println("merek mouse yang digunakan : "+komputer.getMouse());
        System.out.println("jenis keyboard yang di gunakan : "+komputer.getKeyboard());
        System.out.println("CPU yang di gunakan : "+komputer.getCpu());
        
        komputer.setKeyboard("Strawberry");
        System.out.println("keyboard di ganti dengan merek : "+komputer.getKeyboard());
    }
}
