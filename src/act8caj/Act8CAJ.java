/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8caj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alexm
 */
public class Act8CAJ {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Juego juego = new Juego();
        juego.addJugador(new Jugador("jugador 1"));
        juego.addJugador(new Jugador("jugador 2"));
        juego.addJugador(new Jugador("jugador 3"));
        juego.addJugador(new Jugador("jugador 4"));
        juego.addJugador(new Jugador("jugador 5"));
        juego.addJugador(new Jugador("jugador 6"));
        juego.repartirCartas((byte) 7);
        System.out.println("*************Cartas de jugadores***************");
        Iterator var = juego.getJugadores().iterator();
             
             while(var.hasNext()){
                 Jugador jugador = (Jugador)var.next();
                 System.out.println(jugador.toString());
             }
             
             System.out.println("");
             System.out.println("Quedan "+ juego.getNumeroCartasDealer()+ " cartas");
             System.out.println(juego.enseñarBaraja());
             
*/
        
    Scanner scanner = new Scanner(System.in);
    int select = -1;

             Juego juego = new Juego();
        //Mientras la opción elegida sea 0, preguntamos al usuario
        while(select != 0){
            //Try catch para evitar que el programa termine si hay un error
            try{
                System.out.println("Bienvenido a Poker!\n"+"Elige opción:\n1.- Mezclar deck" +
                        "\n2.- Sacar una carta\n" +
                        "3.- Carta al azar\n" +
                        "4.- Generar una mano de 5 cartas\n" +
                        "0.- Salir");
                //Obtener una variable por consola
                select = Integer.parseInt(scanner.nextLine());
                switch(select){
                    //Mezclar baraja
                    case 1:
                        juego.dealer.mezclarBaraja((byte) 15);
                        System.out.println("Se mezcló el Deck.");
                        break;
                    case 2:
                        //Sacar una carta
                        System.out.println(juego.dealer.darCarta());
                        System.out.println("Quedan: " + juego.getNumeroCartasDealer());
                        break;
                    case 3:
                        //sacar una carta al azar
                        System.out.println(juego.dealer.darCarta());
                        System.out.println("Quedan: " + juego.getNumeroCartasDealer());
                        break;
                    case 4:
                        //Genera una mano de 5 cartas
                        juego.addJugador(new Jugador(""));
                        juego.repartirCartas((byte) 5);
                        Iterator var2 = juego.getJugadores().iterator();

                        while (var2.hasNext()) {
                            Jugador j = (Jugador) var2.next();
                            System.out.println(j.toString());
                        }
                        System.out.println("Quedan: " + juego.getNumeroCartasDealer());
                        break;
                    case 0:
                        //Salir
                        System.out.println("Gracias por jugar");
                        break;
                    default:
                        System.out.println("Ingrese un número existente");break;
                }

                System.out.println("\n");

            }catch(Exception e){
                  if (juego.getNumeroCartasDealer() <= 0){
                    System.out.println("Se han agotado las cartas\n");
                }else {
                    System.out.println("Error\n");
            }
        
        
 
        }
        
        
    }
        
    
}
