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
public class Match {
    public static void main(String[] args) {
        Pemain player = new Pemain();
        Klub club = new Klub();
        
        player.nama("Kai Haverzt");
        player.Goal();
        player.nama();
        club.Goal();
        club.Namaklub();
        club.versus();
        club.Namaklub("Manchester United");
        club.Skor("5-0");
    }
}
