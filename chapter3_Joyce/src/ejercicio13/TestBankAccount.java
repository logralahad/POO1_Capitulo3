/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author logra
 */
public class TestBankAccount {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        BankAccount cliente1 = new BankAccount(1, "Juan Perez", 500);
        BankAccount cliente2 = new BankAccount(2, "Juan Reyes", 800);
        BankAccount cliente3 = new BankAccount(3, "Juan Longorio", 650);
        BankAccount cliente4 = new BankAccount();
        
        cliente1.showValues();
        cliente2.showValues();
        cliente3.showValues();
        cliente4.showValues();
    }
    
}
