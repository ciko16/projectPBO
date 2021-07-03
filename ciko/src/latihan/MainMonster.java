/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import latihan.Monster.MonsterAir;
import latihan.Monster.MonsterApi;

/**
 *
 * @author MSI GAMING
 */
public class MainMonster {
    public static void main(String[] args) {
        MonsterAir zedd = new MonsterAir();
        zedd.weapon();
        zedd.ingfo();
        MonsterApi izanagi = new MonsterApi();
        izanagi.weapon();
        izanagi.ingfo();
    }
}
