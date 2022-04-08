/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8caj;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexm
 */
public class Jugador {
    
    private List<Carta>mano;
    private String nombre;

    public Jugador( String nombre) {
        this.mano =  new ArrayList();
        this.nombre = nombre;
    }
    
    public void addCard(Carta carta){
        this.mano.add(carta);
    }
    
    public Carta botarCarta(int nCarta){
        return this.mano.remove(nCarta);
        
    }
    
    public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Jugador: ").append(this.nombre).append("\n").append(this.mano.toString());
    return sb.toString(); 
}

    private List<Carta> ArrayList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
