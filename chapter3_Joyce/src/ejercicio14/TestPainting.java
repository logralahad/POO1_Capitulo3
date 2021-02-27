/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author logra
 */
public class TestPainting {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Painting p1 = new Painting("Khe", "Memin", "Oleo", 52);
        Painting p2 = new Painting("JJJ", "Pelon", "Acuarelas", 52);
        Painting p3 = new Painting();
        
        System.out.println(p1.toString());   
        System.out.println(p2.toString());
        System.out.println(p2.toString());
        
    }
    
}
