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
public class genericoVentas {
    
    private String Marca;
    private String Color;
    private int precio;
    private String tipo;

    public genericoVentas() {
    }

    public genericoVentas(String Marca, String Color, int precio, String tipo) {
        this.Marca = Marca;
        this.Color = Color;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
    
    
    
}
