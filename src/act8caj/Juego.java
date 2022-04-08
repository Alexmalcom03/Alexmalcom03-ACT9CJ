/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8caj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author alexm
 */
public class Juego {
    
    ArrayList<Jugador> jugadores;
     Dealer dealer = new Dealer(new Baraja());

    public Juego() {
        this.jugadores = new ArrayList();
        this.dealer.mezclarBaraja((byte)15);
        System.out.println("SE MEZCLO EL DECK.");
    }
    
    public void addJugador(Jugador jugador){
        this.jugadores.add(jugador);
    }
    
    public void repartirCartas(byte numCartas){
        Iterator var= this.jugadores.iterator();
        while(var.hasNext()){
            Jugador jugador = (Jugador) var.next();
            
            for(byte i=0; i<numCartas;i++){
                jugador.addCard(this.dealer.darCarta());
                
            }
        }   
    }
    
    public String enseñarBaraja(){
        return this.dealer.mostrarCarta();
    }
    public int getNumeroCartasDealer(){
        return this.dealer.getNumeroCartas();
        
    }
    
    public List<Jugador> getJugadores(){
        return this.jugadores;
    }
    
}
