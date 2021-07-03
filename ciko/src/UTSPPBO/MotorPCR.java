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
public class MotorPCR extends Parkir{
    private String plat,jenis;
    private int jumlah,waktu;

    public MotorPCR(String plat, String jenis, int jumlah, int waktu) {
        this.plat = plat;
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.waktu = waktu;
    }

    public String getPlat() {
        return plat;
    }

    public String getJenis() {
        return jenis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public int getWaktu() {
        return waktu;
    }
    
    
    @Override
    public double uangParkir() {
        double total = 0;
        if(jenis.equals("motor")){
            if(waktu < 2){
                total = jumlah*waktu*2000;
                return total;
            }else{
                total = jumlah*waktu*3000;
                return total;
            }
        }else if(jenis.equals("mobil")){
            if(waktu < 2){
                total = jumlah*waktu*3000;
            }else{
                total = jumlah*waktu*5000;
                return total;
            }
        }else{
            return 0;
        }
        return 0;
    }
}