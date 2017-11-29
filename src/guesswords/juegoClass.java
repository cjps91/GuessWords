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
    Vector <String> LetrasUsadas;
    int intentos=7; //Nº de intentos para cada partida. Fijado a 7 arbitrariamente.
    int intentosUsados=0;
    int estado=0;
    public juegoClass() {
        this.LetrasUsadas = new Vector();
    }
    
    void PrintJuego() throws IOException
    {
        String Palabra, menus, letra;
        estado=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Partida ");
        System.out.println(PartidasJugadas);
        System.out.println("\nLa palabra a averiguar es ");
        MuestraPalabra();
        System.out.println("\nIntentos usados: ");
        System.out.println(intentosUsados);
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
        menus= sc.nextLine();
        if(menus.contains("L"))
        {
            System.out.println("\nIntroduzca Letra: ");
            letra= sc.nextLine();
            ComprobarEstado(letra);
            intentosUsados=intentosUsados+1;
        }
        else if(menus.contains("P"))
        {
            System.out.println("\nIntroduzca la palabra: ");
            Palabra=sc.nextLine();
            if(Palabra==PalabraOculta)
            {
                System.out.println("\n Efectivamente, esa era la palabra");
                estado=1;
                intentosUsados=intentosUsados+1;
            }
        }
        else{
            System.out.println("\n Opcion Equivocada. Penalizado con un intento menos \n");
            intentosUsados=intentosUsados+1;
        }
        
    }
    
    void ComprobarEstado(String comprueba)
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Juego del Ahorcado para 2 jugadores \n \n");
        System.out.println("Reglas: 2 jugadores, 5 partidas, 7 intentos por partida \n \n");
        System.out.println("Partidas jugadas ");
        System.out.println(PartidasJugadas);
        System.out.println("\n ");
        System.out.println("\n Introduzca la palabra: ");
        PalabraOculta=sc.nextLine();
    }
    
    void MuestraPalabra()
    {
        String aux;
        String [] ayuda2 = LetrasUsadas.toArray(new String[LetrasUsadas.size()]);
        String prueba=Arrays.toString(ayuda2);
        aux=PalabraOculta;
        System.out.println("\n");
        if(LetrasUsadas.size()!=0)
        {
            for(int g=0; g<PalabraOculta.length(); g++)
            {
                for(int j=0; j<LetrasUsadas.size(); j++)
                    {
                        if(PalabraOculta.charAt(g)==prueba.charAt(j))
                        {
                            System.out.println(PalabraOculta.charAt(g));
                        }
                        else
                        {
                            System.out.println("*");
                        }
                    }
            }
        }
    }
    
}
