/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author logra
 */
public class Painting {
    
    private String titulo;
    private String autor;
    private String medio;
    private Integer precio;
    private double comision;
    
    public Painting(){
        this.titulo = "Sin nombre";
        this.autor = "Sin autor";
        this.medio = "N/A";
        this.precio = 0;
    }

    public Painting(String titulo, String autor, String medio, Integer precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.medio = medio;
        this.precio = precio;
        this.comision = (double)precio * 0.02;
    }
    
    public String toString(){
        String com = "Se cobrara una comision del 20% del precio.";
        return String.format("Autor: %s\nObra: %s\nMedio: %s\nCosto: %%d\n%s\n", autor, titulo, medio, precio, com);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
        this.comision = (double)precio * 0.02;
    }

    public double getComision() {
        return comision;
    }    
    
}
