/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pru1ejer1.pkg7;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pru1Ejer17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int acumD1 = 0,acumD2 = 0, dado1=0, dado2=0;
        boolean fin=true;
        Scanner teclado=new Scanner(System.in);
        System.out.println("El juego ...lanzamiento dados... finalizara si ambos dados son iguales a 1 el juego finalizara ");
        teclado.nextInt();
       
        while(dado1==1 && dado2==1 && dado1 == dado2){
            dado1 = (int) (Math.random()*6+1);
            dado2 = (int) (Math.random()*6+1);   
            System.out.println("DADO 1: "+dado1);
            System.out.println("DADO 2: "+dado2);
            acumD1= acumD1 +dado1;
            acumD2= acumD2 + dado2;
            System.out.println("Dgite la tecla 1 para lanzar de nuevo");
            teclado.nextInt();
            if(acumD1==1 && acumD2==1){
                
                System.out.println("El  lanzamiento en ambos dados es 1");
                fin = false;
            }
        }
    }
    
}
