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
public class Mahasiswa {
    private String nama;
    private int tugas, uts,uas;

    public Mahasiswa(){

    }

    public Mahasiswa (String nama,int tugas, int uts, int uas){
        this.nama=nama;
        this.tugas=tugas;
        this.uts=uts;
        this.uas=uas;
    }
      public Mahasiswa (Mahasiswa mhs){
        this.nama=mhs.nama;
        this.tugas=mhs.tugas;
        this.uts=mhs.uts;
        this.uas=mhs.uas;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }


    public void setNilai(int tugas, int uts, int uas) {
        this.tugas = tugas;

        this.uts = uts;

        this.uas = uas;
    }

    public double NilaiAkhir(){
        return((0.3*tugas)+(0.3*uts)+(0.4*uas));
    }

    public String nilaiHuruf(){
        String hasil;

        if(NilaiAkhir()>90){
            hasil = "A";
        }else if(NilaiAkhir()>80){
            hasil ="AB";
        }else if(NilaiAkhir()>70){
            hasil ="B";
        }else if(NilaiAkhir()>60){
            hasil ="BC";
        }else if(NilaiAkhir()>50){
            hasil ="C";
        }else{
            hasil ="F";
        }
        return hasil;
    }
    public String toString(){
        return "Nama : "+nama+"\ntugas : "+tugas+
                "UTS : "+uts+"\nUAS : "+uas+
                "\nNilai Akhir : "+NilaiAkhir()+
                "\nNilai Huruf : "+nilaiHuruf();
    }
}
