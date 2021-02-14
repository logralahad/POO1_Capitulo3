/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.text.DecimalFormat;

/**
 *
 * @author logra
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Percentage ab = new Percentage(1.2, 3.75);
        Percentage ba = new Percentage(3.75, 1.2);
        
        System.out.println(ab.toString());
        System.out.println(ba.toString());
    }
    
}
