/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

/**
 *
 * @author logra
 */
public class Character {
    
    private String nombre;
    private Integer fuerza;
    private Integer vida;
    private String tipo;
    
    public Character(){
        this.nombre = "Doomguy";
        this.fuerza = 300;
        this.vida = 200;
        this.tipo = "Luchador";
    }

    public Character(String nombre, Integer fuerza, Integer vida, String tipo) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.vida = vida;
        this.tipo = tipo;
    }
    
    public String toString(){
        return String.format("Nombre: %s\nFuerza: %d pts.\nVida: %dpts.\nTipo: %s\n", nombre, fuerza, vida, tipo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getFuerza() {
        return fuerza;
    }

    public void setFuerza(Integer fuerza) {
        this.fuerza = fuerza;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
