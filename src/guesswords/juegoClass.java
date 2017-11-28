package guesswords;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlos
 */
public class juegoClass {
    String PalabraOculta;
    int nPartidasMax=5; //Fijado a 5 según requisitos, pero preparado por si se quiere variar en el futuro
    int PartidasJugadas;
    String LetrasUsadas[];
    int intentos=7; //Nº de intentos para cada partida. Fijado a 7 arbitrariamente.
    
    void PrintJuego()
    {
        
    }
    
    void ComprobarEstado()
    {
        
    }
    
    void PrintMenu()
    {
        System.out.println("Juego del Ahorcado para 2 jugadores \n \n");
        System.out.println("Reglas: 2 jugadores, 5 partidas, 7 intentos por partida \n \n");
        System.out.println("Partidas jugadas ");
        System.out.println(PartidasJugadas);
        System.out.println("\n ");
    }
    
    void MuestraPalabra()
    {
        
    }
}
