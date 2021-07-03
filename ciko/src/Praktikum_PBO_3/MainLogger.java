/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum_PBO_3;
import Another_Praktikum_PBO_3.Logger;
/**
 *
 * @author MSI GAMING
 */

public class MainLogger {
    public static void main(String[] args) {
        Logger logger = new Logger();
        
        logger.debug("Debug with level " +logger.debugLevel);
        
        logger.debugLevel = 20;
        logger.info("Info with level "+logger.debugLevel);
    }
}
