/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author MSI GAMING
 */
interface Monster {
    public void weapon();
    public void ingfo();
    
    
    class MonsterAir implements Monster {

        @Override
        public void weapon() {
            System.out.println("Senjata monster air adalah excalibur");
        }

        @Override
        public void ingfo() {
            System.out.println("monster air bernama zedd dan memiliki tampang yang menyeramkan");
        }
        
    }
    
    class MonsterApi implements Monster {

        @Override
        public void weapon() {
            System.out.println("senjata monster api adalah magatama");

       
        
    }

        @Override
        public void ingfo() {
            System.out.println("monster api bernama izanagi dan memiliki sayap yang besar");
        }
    }
}
