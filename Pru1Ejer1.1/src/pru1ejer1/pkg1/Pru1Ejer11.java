/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pru1ejer1.pkg1;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pru1Ejer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int n1=0,n2=0,n3=0,n4=0;
        
        System.out.println("Digite 1° numero:");
        n1 = teclado.nextInt();
        System.out.println("Digite 2° numero:");
        n2 = teclado.nextInt();
        System.out.println("Digite 3° numero:");
        n3 = teclado.nextInt();
        System.out.println("Digite 4° numero:");
        n4 = teclado.nextInt();
        
        if(n1> n2 && n1>n3 && n1>n4){
            System.out.println("el numero mayor es n1=" + n1);   
        }else if(n2> n1 && n2>n3 && n2>n4){
            System.out.println("el numero mayor es n2=" + n2);   
        }else if(n3> n1 && n3>n2 && n3>n4){
            System.out.println("el numero mayor es n3=" + n3);   
        }else if(n4> n1 && n4>n2 && n4>n3){
            System.out.println("el numero mayor es n4=" + n4);   
        }else if(n1 == n2 && n2==n3 && n3==n4 ){
            System.out.println("todos son iguales");
        }
        
        
        
    }
    
}
