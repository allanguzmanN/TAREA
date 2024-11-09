/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package POO;

/**
 *
 * @author allan
 */
public class Herencia {

    public static void main(String[] args) {
        Perro p = new Perro("Color Negro","SI","SI","SI",4);
        p.Sonido();
        
        Gato g = new Gato ("Blanco","SI","SI","SI",4);
        g.Sonido();
    }
}
