/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Another_Praktikum_PBO_3;

/**
 *
 * @author MSI GAMING
 */
public class Logger {
    public int debugLevel;
    
    public Logger(){
        debugLevel = 10;
    }
    public void debug(String logLine){
        System.out.println("Debug: " + logLine);
    }
    public void info(String logLine){
        System.out.println("Info: " + logLine);
    }
}

