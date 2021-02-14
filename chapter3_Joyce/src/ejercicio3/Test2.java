/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

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
        System.out.print("Digite 2 numeros: ");
        
        ArithmeticMethods2 par1 = new ArithmeticMethods2(sc.nextInt(), sc.nextInt());
        par1.displayNumberPlus10();
        par1.displayNumberPlus100();
        par1.displayNumberPlus1000();
    }
    
}
