/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Labing
 */
public class genericoMercadeo {
    private String color;
    private String Tipo;
    private String Marca;

    public genericoMercadeo() {
    }

    public genericoMercadeo(String color, String Tipo, String Marca) {
        this.color = color;
        this.Tipo = Tipo;
        this.Marca = Marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    
    
    
    
    
    
    
}
