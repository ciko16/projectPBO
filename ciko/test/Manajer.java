/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GAMING
 */
public class Manajer extends Pegawai{
    
    private int tunjangan;
    
    public Manajer(){
        
    }
    @Override
    public int infoGaji(){
        return gaji;
    }
    public int infoTunjangan(){
        return this.tunjangan;
    }
}
