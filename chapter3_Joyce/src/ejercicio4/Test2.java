/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author logra
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 2 numeros con decimales: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        
        Percentage ab = new Percentage(d1, d2);
        Percentage ba = new Percentage(d2, d1);
        
        System.out.println(ab.toString());
        System.out.println(ba.toString());
    }
    
}
