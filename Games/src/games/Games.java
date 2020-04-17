/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package games;

import java.util.Random;
import java.util.Scanner;

//Python: from random import randint, uniform, random
/**
 *
 * @author USER
 */
public class Games {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* TODO code application logic here
        
        CHALLENGE1: P I P I P I P I...
        CHALLENGE2: I P I P I P I P...
        CHALLENTE3: P P P P P P P P...
        CHALLENGE4: I I I I I I I I...
        keyword = palabra reservada : Random
        (int)(N.nextDouble()* Limite_superior * limite_inferior)
        */
        Random N = new Random();
        Scanner keyboard = new Scanner(System.in);
        int var1 = 0, i = 0, contP = 0, acumP = 0, contI = 0, acumI = 0, limit = 0;
        
        System.out.println("Por favor, ingrese el limite de numeros random / Please, type a random limit number to generate the list: "+ limit);
        limit = keyboard.nextInt();
        
        for(i=1;i<=limit;i++){
          var1 = (int)(N.nextDouble() * 10 + 1);
          System.out.println(var1);  
          
          if(var1 % 2 == 0){
            contP++; //counter
            acumP = acumP + var1; //acumulator
            System.out.println(" Es Par");  
          }else{
              contI++; //counter
              acumI = acumI + var1; //acumulator
              System.out.println(" Es Impar");
          }
        }
        System.out.println("Total de pares generados: "+ contP);
        System.out.println("Suma de pares generados: "+ acumP);
        System.out.println("Total de pares generados: "+ contI);
        System.out.println("Suma de pares generados: "+ acumI);
    
    //DICES = DADOS
    Random D = new Random();
    int d1 = 0, d2 = 0;
    
    d1 = (int)(D.nextDouble()* 6 + 1);
    d2 = (int)(D.nextDouble()* 6 + 1);
    
    System.out.println("\n\n\n");
    System.out.println("////////////////////");
    System.out.println("Dice 1: "+d1); 
    System.out.println("Dice 2: "+d2);
    }
    
}
