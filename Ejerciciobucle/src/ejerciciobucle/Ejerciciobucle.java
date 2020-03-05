/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobucle;
import java.util.Scanner;
/**
 *
 * @author Aula1
 */
public class Ejerciciobucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Script Java que solicite:
            1º Nro. Tabla Multi.: P.ej:3
            2ºRango de impresion:
                *Lim inicio n
                *Lim Fin n
            3ºImprimir Tabla    
        */
        Scanner entrada = new Scanner(System.in);
        entrada = new Scanner(System.in);
        int i=0, numMult = 0, limI=0, limF =0, mult = 0 ;
            System.out.println("Ingrese el numero de la Tablba a Multiplicar: " );
            numMult =  entrada.nextInt();
            System.out.println("Ingrese limite inicial: " );
            limI =  entrada.nextInt();
            System.out.println("Ingrese Limite final: ");
            limF =  entrada.nextInt();
            if(limI > limF){
                 for( i= limI; i >= limF;   i-- ){
                    mult = numMult * i;
                    System.out.println(numMult+ " * "+i+ "= "+mult);
                   // System.out.println("valores incorrctos ");
                 }
            }else{
                 for ( i = limI; i <= limF;   i++){
                    mult = numMult * i;
                    System.out.println(numMult+ " * "+i+ "= "+mult);
                    }
            
            
                 
                
            }  
              
                     
    }
    
}
