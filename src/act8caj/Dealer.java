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
public class Dealer {
    
    private Baraja baraja;

    public Dealer(Baraja baraja) {
        this.baraja = baraja;
    }
    
    public void mezclarBaraja(byte Cantidad){
        this.baraja.mezclar(Cantidad);
    }
    
    public Carta darCarta(){
        return this.baraja.getCarta();
        
    }
    
    public String mostrarCarta(){
        return this.baraja.toString();
        
    }
    
    public int getNumeroCartas(){
        return this.baraja.getNumCartas();
    }
    
}
