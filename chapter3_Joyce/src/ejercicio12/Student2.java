/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author logra
 */
public class Student2 {
    
    private Integer id;
    private Integer horas_credito;
    private Integer puntos;
    private double promedio;
    
    public Student2(){
        this.id = 9999;
        this.horas_credito = 3;
        this.puntos = 12;
        this.promedio = 4;
    }

    public Student2(Integer ID, Integer horas_credito, Integer puntos) {
        this.id = ID;
        this.horas_credito = horas_credito;
        this.puntos = puntos;
        this.promedio = (double)this.puntos / (double)this.horas_credito;
    }
    
    public String toString(){
        return String.format("ID: %d\nHoras: %d\nPuntos: %d\nGPA: %.2f", id, horas_credito, puntos, promedio);
    }
    
    public double getPromedio(){
        return promedio;
    }
    
    public Integer getID() {
        return id;
    }

    public void setID(Integer ID) {
        this.id = ID;
    }

    public Integer getHoras_credito() {
        return horas_credito;
    }

    public void setHoras_credito(Integer horas_credito) {
        this.horas_credito = horas_credito;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }
    
    
    
}
