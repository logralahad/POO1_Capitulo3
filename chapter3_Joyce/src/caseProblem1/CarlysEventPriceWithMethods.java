/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem1;

import java.util.Scanner;

/**
 *
 * @author logra
 */
public class CarlysEventPriceWithMethods {

    /**
     * @param args the command line arguments
     */
    public static void CarlysMotto(){
        System.out.println("\n*************************");
        System.out.println("*   Carly’s makes the   *");
        System.out.println("*    food that makes    *");
        System.out.println("*      it a party!      *");
        System.out.print("*************************\n");
    }
    
    public static int users(){
        Scanner sc = new Scanner(System.in);
        System.out.print("# de invitados: ");        
        int invitados = sc.nextInt();
        
        return invitados;
    }
    
    public static void eCosto(int u){
        int costo = u * 35;
        if(u >= 50){
            System.out.println("\nEvento grande.");
        }else{
            System.out.println("\nEvento chico.");
        }
        System.out.println("Costo del evento: $" + costo);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int u = users();
        CarlysMotto();
        eCosto(u);
        
    }
    
}
