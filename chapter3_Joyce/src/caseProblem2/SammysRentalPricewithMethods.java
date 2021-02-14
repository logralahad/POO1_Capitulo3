/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem2;

import java.util.Scanner;

/**
 *
 * @author logra
 */
public class SammysRentalPricewithMethods {

    /**
     * @param args the command line arguments
     */   
    public static void SammysMotto(){
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S   Sammy's makes it   S");
        System.out.println("S    fun in the sun    S");
        System.out.print("SSSSSSSSSSSSSSSSSSSSSSSS\n");
    }
    
    public static int renta(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Minutos a rentar: ");        
        int minutos = sc.nextInt();
        System.out.print("\n");
        
        return minutos;
    }
    
    public static void aPagar(int min){
        int horas = min / 60;
        int min_res = min % 60;
        int precio = (horas * 40) + min_res;
        
        System.out.println("\nHoras completas: " + horas);
        System.out.println("Minutos extras: " + min_res);
        System.out.println("Cantidad a pagar: $" + precio);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int minutos = renta();
        SammysMotto();
        aPagar(minutos);
        
        
    }
    
}
