/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MSI GAMING
 */
public class Programmer extends Pegawai{
    private int bonus;
    
    public Programmer(){
        
    }
    public int infoBonus(){
        return this.bonus;
    }
    @Override
    public int infoGaji(){
        return gaji;
    }
}
