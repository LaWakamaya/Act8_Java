/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act8java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alan Franco
 */
public class Act8Java {

    /**
     * @param args the command line arguments
     */
    static int opcion = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Deck deck = new Deck();             
        boolean salir = false;
        
        System.out.println("----------------Baraja de Poker----------------");
        while(!salir){
            if(deck.cardList.size() > 0)
            {
            showMenu();            
            
            switch(opcion){
                case 1:
                {
                    deck.Shuffle();
                    break;
                }
                
                case 2:
                {
                    deck.Head();
                    break;
                }
                
                case 3:
                {
                    deck.Pick();
                    break;
                }
                
                case 4:
                {
                    if(deck.cardList.size() > 4){
                        deck.Hand();
                        break;
                    }else{
                        System.out.println("Quedan menos de 5 cartas en el deck");
                        break;
                    }
                    
                }
                
                case 0:
                {
                    salir = true;
                    break;
                }
                
                default:
                {
                    System.out.println("Seleccione una opcion valida, por favor");
                    break;
                }
            }
            }
            else{
                System.out.println("Las cartas se han terminado, gracias por jugar!");
                salir = true;
            }
        }
        
    }
    
    static void showMenu() throws IOException{
        System.out.println("Elija una opcion");
            System.out.println("1. Shuffle - Mezckar el deck");
            System.out.println("2. Head - Sacar la primera carta");
            System.out.println("3. Pick - Sacar una carta al azar");
            System.out.println("4. Hand - Sacar 5 cartas");
            System.out.println("0. Salir");
            opcion = Integer.parseInt(br.readLine());
    }
    
}
