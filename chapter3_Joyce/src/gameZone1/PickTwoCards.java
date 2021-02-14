/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;

import java.util.Random;

/**
 *
 * @author logra
 */
public class PickTwoCards {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 2; i++) {
            Card cartita = new Card();
            cartita.randomSuit();
            cartita.randomValue();
            cartita.showCard();
        }
        
    }
    
}
