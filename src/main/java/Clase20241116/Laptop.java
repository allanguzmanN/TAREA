/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241116;

/**
 *
 * @author allan
 */


public class Laptop extends Producto {
   private String Pantalla;
    private String Sonido;

    public Laptop(String Pantalla, String Sonido, String Color, String Marca, String Modelo) {
        super(Color, Marca, Modelo);
        this.Pantalla = Pantalla;
        this.Sonido = Sonido;
    }

    public String getPantalla() {
        return Pantalla;
    }

    public void setPantalla(String Pantalla) {
        this.Pantalla = Pantalla;
    }

    public String getSonido() {
        return Sonido;
    }

    public void setSonido(String Sonido) {
        this.Sonido = Sonido;
    }


   
}