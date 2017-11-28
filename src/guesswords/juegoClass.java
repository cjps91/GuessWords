package guesswords;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

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
    Vector LetrasUsadas;
    int intentos=7; //Nº de intentos para cada partida. Fijado a 7 arbitrariamente.
    GuessWords Estado= new GuessWords();
    public juegoClass() {
        this.LetrasUsadas = new Vector();
    }
    
    void PrintJuego() throws IOException
    {
        char menus, letra;
        String Palabra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Partida ");
        System.out.println(PartidasJugadas);
        System.out.println("\nLa palabra a averiguar es ");
        MuestraPalabra();
        System.out.println("\nIntentos usados: ");
        System.out.println(intentos);
        System.out.println(" de 7\n");
        System.out.println("\n Las letras usadas son: ");
        if(LetrasUsadas.size()!=0){
        for(int i=0; i<LetrasUsadas.size(); i++)
        {
            System.out.println(" ");
            System.out.println(LetrasUsadas.elementAt(i));
            System.out.println(",");
        }
        }
        
        System.out.println("\nIntroduzca una letra o la palabra si cree conocerla: ¿Letra o Palabra? (L/P) \n");
        menus= (char) System.in.read();
        if(menus=='L')
        {
            System.out.println("\nIntroduzca Letra: ");
            letra= (char)System.in.read();
            ComprobarEstado(letra);
        }
        else if(menus=='P')
        {
            System.out.println("\nIntroduzca la palabra: ");
            Palabra=sc.nextLine();
            if(Palabra==PalabraOculta)
            {
                System.out.println("\n Efectivamente, esa era la palabra");
                Estado.estado=1;
            }
        }
        else{
            System.out.println("\n Opcion Equivocada. Penalizado con un intento menos \n");
        }
        
    }
    
    void ComprobarEstado(char comprueba)
    {
        if(PalabraOculta.indexOf(comprueba) !=-1)
        {
            System.out.println("\n Letra acertada");
            LetrasUsadas.add(comprueba);
        }
        else
        {
            System.out.println("\n La letra no se encuentra en la palabra");
            LetrasUsadas.add(comprueba);
        }
        
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
        String aux;
        char prueba;
        aux=PalabraOculta;
        if(LetrasUsadas.size()!=0)
        {
            for(int j=0; j<LetrasUsadas.size(); j++)
            {
                prueba=(char) LetrasUsadas.elementAt(j);
                if(PalabraOculta.indexOf(prueba) !=-1)
                {
                    aux.replace('*', (char) LetrasUsadas.elementAt(j));
                }
            }
        }
        System.out.println(aux);
    }
    
}
