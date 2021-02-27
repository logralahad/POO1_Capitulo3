/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

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
        PaintCalculator cuarto = new PaintCalculator(15, 20, 10);
        System.out.println(cuarto.needGal());
        System.out.println(cuarto.finalPrice());
        
        
    }
    
}
