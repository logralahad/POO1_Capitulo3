/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author logra
 */
public class Sandwich {
    private String ingredient;
    private String bread;
    private double price;

    public Sandwich(String ingredient, String bread, double price) {
        this.ingredient = ingredient;
        this.bread = bread;
        this.price = price;
    }
    
    public String toString(){
        return String.format("Sandwich de %s con pan de %s a $%.2f", ingredient, bread, price);
    }
 
    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
