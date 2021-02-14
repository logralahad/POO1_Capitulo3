/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author logra
 */
public class BankAccount {
    
    private Integer cuenta;
    private String poseedor;
    private double saldo;
    
    public BankAccount(){
        this.cuenta = 0000;
        this.poseedor = "S/N";
        this.saldo = 0.00;
    }

    public BankAccount(Integer cuenta, String poseedor, double saldo) {
        this.cuenta = cuenta;
        this.poseedor = poseedor;
        this.saldo = saldo;
    }
    
    public void showValues(){
        System.out.print(String.format("Cuenta: #%d\nNombre: %s\nSaldo: %.2f\n", cuenta, poseedor, saldo));
        this.deductMonthlyFee();
        BankAccount.explainAccountPolicy();
    }
    
    public void deductMonthlyFee(){
        this.saldo -= 4.00;
    }
    
    public static void explainAccountPolicy(){
        System.out.print("Cada mes se cobrara una tarifa $4.\n\n");
    }

    public Integer getCuenta() {
        return cuenta;
    }

    public void setCuenta(Integer cuenta) {
        this.cuenta = cuenta;
    }

    public String getPoseedor() {
        return poseedor;
    }

    public void setPoseedor(String poseedor) {
        this.poseedor = poseedor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
