/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author logra
 */
public class Percentage2 {
    
    private Double a;
    private Double b;
    private Double c;

    public Percentage2(Double a, Double b) {
        this.a = a;
        this.b = b;
        this.c = (a * 100) / b;
    }
    
    public String toString(){
        return String.format("%.2f es el %.1f%% de %.2f", this.a, this.c, this.b);
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }
    
    public void setC(){
        this.c = computePercentage();
    }
    
    public Double computePercentage(){
        Double k = (this.a * 100) / this.b;
        return k;
    }
}
