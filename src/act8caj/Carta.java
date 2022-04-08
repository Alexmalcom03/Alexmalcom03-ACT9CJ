/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8caj;

/**
 *
 * @author alexm
 */
public class Carta {
    
    private final Palo palo;
     private final Numero numero;
     private final Color color;

    public Carta(Palo palo, Numero numero, Color color) {
        this.palo = palo;
        this.numero = numero;
        this.color = color;
    }

    public Palo getPalo() {
        return palo;
    }

    public Numero getNumero() {
        return numero;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "{"  + this.palo.toString() + ","  + "," + this.color.toString()
                + "," + this.numero.toString()+ "}";
    }
     
     
     
    
}
