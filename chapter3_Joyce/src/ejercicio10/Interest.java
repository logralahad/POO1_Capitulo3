/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author logra
 */
public class Interest {
    
    private Integer dinero;
    private Double interes;

    public Interest(Integer dinero) {
        this.dinero = dinero;
        this.interes = dinero * .05;
    }
    
    public String toString(){
        return String.format("Su dinero ascendio a $%.2f", dinero + interes);
    }
    
    
    public Integer getDinero() {
        return dinero;
    }

    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }

    public Double getInteres() {
        return interes;
    }

   
}
