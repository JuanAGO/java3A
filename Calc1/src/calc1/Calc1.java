/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc1;

import java.util.Scanner;

/**
 *
 * @author Aula1
 */
public class Calc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,sum,rest,mult,div;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce el primer numero:");
        n1 = sc.nextInt();
        System.out.println("introduce el segundo numero:");
        n2= sc.nextInt();
        
        sum= n1+n2;rest= n1-n2; mult=n1*n2;div=n1/n2;
        
        System.out.println("resultados");
        System.out.println("-------------");
        System.out.println("la suma es:"+sum);
        System.out.println("la resta es:"+rest);
        System.out.println("la multiplicacion es:"+mult);
        System.out.println("la divicion es:"+div);                  
    }
    
}
