/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author logra
 */
public class Insurance {
    
    private Integer anio_nacimiento;
    private Integer anio_actual;
    private Integer decadas;

    public Insurance(Integer anio_nacimiento, Integer anio_actual) {
        this.anio_nacimiento = anio_nacimiento;
        this.anio_actual = anio_actual;
        this.decadas = (((anio_actual - anio_nacimiento) / 10) + 15) * 20;
    }

    public Integer getAnio_nacimiento() {
        return anio_nacimiento;
    }

    public void setAnio_nacimiento(Integer anio_nacimiento) {
        this.anio_nacimiento = anio_nacimiento;
    }

    public Integer getAnio_actual() {
        return anio_actual;
    }

    public void setAnio_actual(Integer anio_actual) {
        this.anio_actual = anio_actual;
    }

    public Integer getDecadas() {
        return decadas;
    }
    
    public String premiumAmount(){
        return String.format("Poliza anual: $%d", this.decadas);
    }
    
}
