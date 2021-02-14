/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author logra
 */
public class GasPrices {
    
    private Integer precio;
    private Double prec_inf;
    private Double prec_sup;

    public GasPrices(Integer precio) {
        this.precio = precio;
        this.prec_inf = (double)precio * 0.035;
        this.prec_sup = (double)precio * 0.04;
    }

    public Integer getPrecio() {
        return precio;
    }

    public Double getPrec_inf() {
        return prec_inf;
    }

    public Double getPrec_sup() {
        return prec_sup;
    }
    
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    
    public String rangePrices(){
        return String.format("Precio por galon: %d\nPrecio minimo: %.2f\nPrecio maximo: %.2f", precio, prec_inf, prec_sup);
    }
}
