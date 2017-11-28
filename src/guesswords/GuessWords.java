/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesswords;

import java.io.IOException;

/**
 *
 * @author usuario
 */
public class GuessWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        jugadorClass jugador1= new jugadorClass();
        jugadorClass jugador2= new jugadorClass();
        juegoClass juego = new juegoClass();
        for(int a=0; a<juego.nPartidasMax; a++)
        {
            juego.PrintMenu();
               for(int b=0; b<juego.intentos; b++)
               {
                if(juego.estado==0)
                {
                   juego.PrintJuego();
                }
                if(juego.estado==1)
                {
                    if(juego.PartidasJugadas==0)
                    {
                    jugador1.PartidasJugadas=jugador1.PartidasJugadas+1;
                    jugador1.PartidasGanadas=jugador1.PartidasGanadas+1;
                }
                    else
                    {
                        if(jugador1.PartidasJugadas>jugador2.PartidasJugadas)
                        {
                            jugador1.PartidasJugadas=jugador1.PartidasJugadas+1;
                            jugador1.PartidasGanadas=jugador1.PartidasGanadas+1;
                        }
                        else
                        {
                           jugador2.PartidasJugadas=jugador2.PartidasJugadas+1;
                           jugador2.PartidasGanadas=jugador2.PartidasGanadas+1; 
                        }
                    }
                }
            }
               if(juego.estado==0)
               {
                  juego.PartidasJugadas=juego.PartidasJugadas+1;
               }
        }
        
        if(jugador1.PartidasGanadas>jugador2.PartidasGanadas)
        {
            System.out.println("\n Ha ganado el jugador 1");
        }
        else
        {
            if(jugador2.PartidasGanadas>jugador1.PartidasGanadas)
            {
                System.out.println("\n Ha ganado el jugador 2");
            }
            else
            {
                System.out.println("\n Empate");
            }
        }
        
        
    }
    
}
