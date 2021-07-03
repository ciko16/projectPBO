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
public class Komputer {
    private String merk;
    private String tipe;
    private Mouse mouse;
    private Keyboard keyboard;
    private Cpu cpu;
    public Komputer(String merk,String tipe,Mouse mouse,Keyboard keyboard,Cpu cpu){
        this.merk = merk;
        this.tipe= tipe;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.cpu=cpu;
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getTipe() {
        return tipe;
    }
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    public String getMouse() {
        return mouse.getMerk();
    }
    public void setMouse(String mouse) {
        this.mouse.setMerk(mouse);
    }
    public String getKeyboard() {
        return keyboard.getJenis();
    }
    public void setKeyboard(String keyboard) {
        this.keyboard.setJenis(keyboard);
    }
    public String getCpu() {
        return cpu.getNama();
    }
    public void setCpu(String cpu) {
        this.cpu.setNama(cpu);
    }
}
