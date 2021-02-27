/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.text.DecimalFormat;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        
        MetricConversion m1 = new MetricConversion(15);
        System.out.println(m1.inchToCm());
        System.out.println(m1.galToLt());
    }
    
}
