/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class reto {
    
    static int[] tablero;
    //Array para guardar nombres de n Jugadores
    static String[] jugadores;
    static int[] lanzamiento() {

            int[] resultados = new int[2]; //Se tiran tres dados

            resultados[0] = (int)(Math.random()*6 + 1); //Primer dado
            resultados[1] = (int)(Math.random()*6 + 1); //Segundo dado
            return resultados;
    }
    static int dados_acumulador_1_1(int d1,int d2){
        int a_d=0;
        if(d1 == 1 && d2 == 1){
            a_d = 21;
        }else{
            a_d = d1 + d2;
        }
     return a_d;
    }
    public static int dados_pares(int d1,int d2){
    int pares_c=0;
    if (d1 == 1 && d2 == 1){
        pares_c = 1;
    }else if( d1 == d2){
        pares_c = 1;
    }else{
        pares_c = 0;
    }
    return pares_c;
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n=0, nivel=0,posicion=0;
        String booleano="NO";
        int intentos=0;
        int  acum1 = 0, acum2 = 0,  acum3 = 0, acum4 = 0;
        int  par_acum1 = 0,  par_acum2 = 0,   par_acum3 = 0, par_acum4 = 0;
        int  parC = 0,acumD=0;
        
        while(n <2 || n >4 ){
            System.out.print("¿Cuantos jugadores serán?: ");
            n = Integer.parseInt(teclado.nextLine());
            if (n<2 || n>4){
                System.out.println("... ¡Numero invalido de jugadores!...");   
            }  
        }
        System.out.println("... ¡elija un nivel!...");
        System.out.println("... ¡1. Nivel básico (Tablero de 20 posiciones)!...");
        System.out.println("... ¡2. Nivel intermedio (Tablero de 30 posiciones)!...");
        System.out.println("... ¡3. Nivel avanzado (Tablero de 50 posiciones)!...");
        nivel =  teclado.nextInt();
        switch(nivel){
                    case 1:
                           System.out.println("");
                           System.out.println(" Nivel básico (Tablero de 20 posiciones).");
                           System.out.print(".............................................");
                           posicion=20;
                           //juego(n,posicion);
                           while (booleano!="SI") {         
                                System.out.println("");
                                if(intentos==0){
                                     System.err.println("Nota: Si en el dado1 y el dado2 es igual a  1, el valor acumulativo es 21.");

                                }
                                System.out.println(" ________________________________________________");
                                System.out.println("INTENTOS: "+intentos);
                                for (int i = 1; i <= n; i++) {
                                    par_acum1 = 0;
                                    par_acum2 = 0;
                                    par_acum3 = 0;
                                    par_acum4 = 0;
                                    System.out.println("");
                                    System.out.println("Jugador "+i+" :");
                                    System.out.println("Por favor presione ENTER para lanzar DADOS..... : ");
                                    teclado.nextLine();
                                    int dado1 = (int) (Math.random()*6+1);
                                    int dado2 = (int) (Math.random()*6+1);
                                    System.out.println("DADO 1: "+dado1);
                                    System.out.println("DADO 2: "+dado2);
                                    if(i==1){
                                        parC=dados_pares(dado1, dado2);
                                        acumD=dados_acumulador_1_1(dado1,dado2);
                                        par_acum1 =par_acum1+ parC;
                                        acum1 = acum1+acumD;
                                    }else if(i==2){
                                        parC=dados_pares(dado1, dado2);
                                        acumD=dados_acumulador_1_1(dado1,dado2);
                                        par_acum2 =par_acum2+ parC;
                                        acum2 = acum2+acumD;    
                                    }else if(i==3){
                                        parC=dados_pares(dado1, dado2);
                                        acumD=dados_acumulador_1_1(dado1,dado2);
                                        par_acum3 =par_acum3+ parC;
                                        acum3 = acum3+acumD;                
                                    }else if(i==4){
                                        parC=dados_pares(dado1, dado2);
                                        acumD=dados_acumulador_1_1(dado1,dado2);
                                        par_acum4 =par_acum4+ parC;
                                        acum4 = acum4+acumD;                
                                    }   
                                }
                                intentos++;
                                if(posicion==20){
                                    if (acum1 > 20 || par_acum1==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 1");
                                        System.out.println("_____________________________");
                                    }else if (acum2 > 20 || par_acum2==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 2");
                                        System.out.println("_____________________________");
                                    }else if (acum3 > 20 || acum3==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 3");
                                        System.out.println("_____________________________");
                                    }else if (acum4 > 20 || acum4 ==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 4");
                                        System.out.println("_____________________________");
                                    }
                                }else if(posicion==30){
                                    if (acum1 > 30 || par_acum1==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 1");
                                        System.out.println("_____________________________");
                                    }else if (acum2 > 30 || par_acum2==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 2");
                                        System.out.println("_____________________________");
                                    }else if (acum3 > 30 || acum3==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 3");
                                        System.out.println("_____________________________");
                                    }else if (acum4 > 30 || acum4 ==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 4");
                                        System.out.println("_____________________________");
                                    }                
                                }else{
                                    //posicion=50
                                     if (acum1 > 50 || par_acum1==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 1");
                                        System.out.println("_____________________________");
                                    }else if (acum2 > 50 || par_acum2==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 2");
                                        System.out.println("_____________________________");
                                    }else if (acum3 > 50 || par_acum3==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 3");
                                        System.out.println("_____________________________");
                                    }else if (acum4 > 50 || par_acum4 ==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 4");
                                        System.out.println("_____________________________");
                                    }
                                }
                                System.out.println("");
                                System.out.println("::::. RESULTADO .::::");
                                System.out.println("Número de Intentos:"+intentos);
                                if (n==2) {
                                    System.out.println("JUGADOR 1: PUNTAJE ACUMULADO: "+ acum1+"  PARES ACUMULADOS: "+par_acum1);
                                    System.out.println("JUGADOR 2: PUNTAJE ACUMULADO: "+ acum2+ " PARES ACUMULADOS: "+ par_acum2);
                                }else if(n==3){
                                    System.out.println("JUGADOR 1: PUNTAJE ACUMULADO: "+ acum1+"  PARES ACUMULADOS: "+par_acum1);
                                    System.out.println("JUGADOR 2: PUNTAJE ACUMULADO: "+ acum2+ " PARES ACUMULADOS: "+ par_acum2);
                                    System.out.println("JUGADOR 3: PUNTAJE ACUMULADO: "+ acum3+ " PARES ACUMULADOS: "+ par_acum3);
                                }else{
                                    System.out.println("JUGADOR 1: PUNTAJE ACUMULADO: "+ acum1+"  PARES ACUMULADOS: "+par_acum1);
                                    System.out.println("JUGADOR 2: PUNTAJE ACUMULADO: "+ acum2+ " PARES ACUMULADOS: "+ par_acum2);
                                    System.out.println("JUGADOR 3: PUNTAJE ACUMULADO: "+ acum3+ " PARES ACUMULADOS: "+ par_acum3);
                                    System.out.println("JUGADOR 4: PUNTAJE ACUMULADO: "+ acum4+ " PARES ACUMULADOS: "+ par_acum4);
                                }
                            }       
          
                     break;
                    case 2:
                           System.out.println("");
                           System.out.println(" Nivel intermedio (Tablero de 30 posiciones).");
                           System.out.print(".............................................");
                           posicion=30;
                           //juego(n,posicion);
                           System.out.println("");
                            while (booleano!="SI") {
                                if(intentos==0){
                                     System.err.println("Nota: Si en el dado1 y el dado2 es igual a  1, el valor acumulativo es 21.");

                                }
                                System.out.println(" ________________________________________________");
                                System.out.println("INTENTOS: "+intentos);
                                for (int i = 1; i <= n; i++) {
                                    par_acum1 = 0;
                                    par_acum2 = 0;
                                    par_acum3 = 0;
                                    par_acum4 = 0;
                                    System.out.println("");
                                    System.out.println("Jugador "+i+" :");
                                    System.out.println("Por favor presione ENTER para lanzar DADOS..... : ");
                                    teclado.nextLine();
                                    int dado1 = (int) (Math.random()*6+1);
                                    int dado2 = (int) (Math.random()*6+1);
                                    System.out.println("DADO 1: "+dado1);
                                    System.out.println("DADO 2: "+dado2);
                                    if(i==1){
                                        parC=dados_pares(dado1, dado2);
                                        acumD=dados_acumulador_1_1(dado1,dado2);
                                        par_acum1 =par_acum1+ parC;
                                        acum1 = acum1+acumD;
                                    }else if(i==2){
                                        parC=dados_pares(dado1, dado2);
                                        acumD=dados_acumulador_1_1(dado1,dado2);
                                        par_acum2 =par_acum2+ parC;
                                        acum2 = acum2+acumD;    
                                    }else if(i==3){
                                        parC=dados_pares(dado1, dado2);
                                        acumD=dados_acumulador_1_1(dado1,dado2);
                                        par_acum3 =par_acum3+ parC;
                                        acum3 = acum3+acumD;                
                                    }else if(i==4){
                                        parC=dados_pares(dado1, dado2);
                                        acumD=dados_acumulador_1_1(dado1,dado2);
                                        par_acum4 =par_acum4+ parC;
                                        acum4 = acum4+acumD;                
                                    }   
                                }
                                intentos++;
                                if(posicion==20){
                                    if (acum1 > 20 || par_acum1==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 1");
                                        System.out.println("_____________________________");
                                    }else if (acum2 > 20 || par_acum2==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 2");
                                        System.out.println("_____________________________");
                                    }else if (acum3 > 20 || acum3==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 3");
                                        System.out.println("_____________________________");
                                    }else if (acum4 > 20 || acum4 ==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 4");
                                        System.out.println("_____________________________");
                                    }
                                }else if(posicion==30){
                                    if (acum1 > 30 || par_acum1==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 1");
                                        System.out.println("_____________________________");
                                    }else if (acum2 > 30 || par_acum2==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 2");
                                        System.out.println("_____________________________");
                                    }else if (acum3 > 30 || acum3==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 3");
                                        System.out.println("_____________________________");
                                    }else if (acum4 > 30 || acum4 ==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 4");
                                        System.out.println("_____________________________");
                                    }                
                                }else{
                                    //posicion=50
                                     if (acum1 > 50 || par_acum1==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 1");
                                        System.out.println("_____________________________");
                                    }else if (acum2 > 50 || par_acum2==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 2");
                                        System.out.println("_____________________________");
                                    }else if (acum3 > 50 || par_acum3==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 3");
                                        System.out.println("_____________________________");
                                    }else if (acum4 > 50 || par_acum4 ==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 4");
                                        System.out.println("_____________________________");
                                    }
                                }
                                System.out.println("");
                                System.out.println("::::. RESULTADO .::::");
                                System.out.println("Número de Intentos:"+intentos);
                                if (n==2) {
                                    System.out.println("JUGADOR 1: PUNTAJE ACUMULADO: "+ acum1+"  PARES ACUMULADOS: "+par_acum1);
                                    System.out.println("JUGADOR 2: PUNTAJE ACUMULADO: "+ acum2+ " PARES ACUMULADOS: "+ par_acum2);
                                }else if(n==3){
                                    System.out.println("JUGADOR 1: PUNTAJE ACUMULADO: "+ acum1+"  PARES ACUMULADOS: "+par_acum1);
                                    System.out.println("JUGADOR 2: PUNTAJE ACUMULADO: "+ acum2+ " PARES ACUMULADOS: "+ par_acum2);
                                    System.out.println("JUGADOR 3: PUNTAJE ACUMULADO: "+ acum3+ " PARES ACUMULADOS: "+ par_acum3);
                                }else{
                                    System.out.println("JUGADOR 1: PUNTAJE ACUMULADO: "+ acum1+"  PARES ACUMULADOS: "+par_acum1);
                                    System.out.println("JUGADOR 2: PUNTAJE ACUMULADO: "+ acum2+ " PARES ACUMULADOS: "+ par_acum2);
                                    System.out.println("JUGADOR 3: PUNTAJE ACUMULADO: "+ acum3+ " PARES ACUMULADOS: "+ par_acum3);
                                    System.out.println("JUGADOR 4: PUNTAJE ACUMULADO: "+ acum4+ " PARES ACUMULADOS: "+ par_acum4);
                                }
                            }
    
                        break;
                    case 3:
                           System.out.println("");
                           System.out.println(" Nivel avanzado (Tablero de 50 posiciones).");
                           System.out.print(".............................................");
                           posicion=50;
                           //juego(n,posicion);
                           while (booleano!="SI") {
                                if(intentos==0){
                                     System.err.println("Nota: Si en el dado1 y el dado2 es igual a  1, el valor acumulativo es 21.");

                                }
                                System.out.println(" ________________________________________________");
                                System.out.println("INTENTOS: "+intentos);
                                for (int i = 1; i <= n; i++) {
                                    par_acum1 = 0;
                                    par_acum2 = 0;
                                    par_acum3 = 0;
                                    par_acum4 = 0;
                                    System.out.println("");
                                    System.out.println("Jugador "+i+" :");
                                    System.out.println("Por favor presione ENTER para lanzar DADOS..... : ");
                                    teclado.nextLine();
                                    int dado1 = (int) (Math.random()*6+1);
                                    int dado2 = (int) (Math.random()*6+1);
                                    System.out.println("DADO 1: "+dado1);
                                    System.out.println("DADO 2: "+dado2);
                                    if(i==1){
                                        parC=dados_pares(dado1, dado2);
                                        acumD=dados_acumulador_1_1(dado1,dado2);
                                        par_acum1 =par_acum1+ parC;
                                        acum1 = acum1+acumD;
                                    }else if(i==2){
                                        parC=dados_pares(dado1, dado2);
                                        acumD=dados_acumulador_1_1(dado1,dado2);
                                        par_acum2 =par_acum2+ parC;
                                        acum2 = acum2+acumD;    
                                    }else if(i==3){
                                        parC=dados_pares(dado1, dado2);
                                        acumD=dados_acumulador_1_1(dado1,dado2);
                                        par_acum3 =par_acum3+ parC;
                                        acum3 = acum3+acumD;                
                                    }else if(i==4){
                                        parC=dados_pares(dado1, dado2);
                                        acumD=dados_acumulador_1_1(dado1,dado2);
                                        par_acum4 =par_acum4+ parC;
                                        acum4 = acum4+acumD;                
                                    }   
                                }
                                intentos++;
                                if(posicion==20){
                                    if (acum1 > 20 || par_acum1==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 1");
                                        System.out.println("_____________________________");
                                    }else if (acum2 > 20 || par_acum2==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 2");
                                        System.out.println("_____________________________");
                                    }else if (acum3 > 20 || acum3==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 3");
                                        System.out.println("_____________________________");
                                    }else if (acum4 > 20 || acum4 ==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 4");
                                        System.out.println("_____________________________");
                                    }
                                }else if(posicion==30){
                                    if (acum1 > 30 || par_acum1==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 1");
                                        System.out.println("_____________________________");
                                    }else if (acum2 > 30 || par_acum2==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 2");
                                        System.out.println("_____________________________");
                                    }else if (acum3 > 30 || acum3==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 3");
                                        System.out.println("_____________________________");
                                    }else if (acum4 > 30 || acum4 ==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 4");
                                        System.out.println("_____________________________");
                                    }                
                                }else{
                                    //posicion=50
                                     if (acum1 > 50 || par_acum1==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 1");
                                        System.out.println("_____________________________");
                                    }else if (acum2 > 50 || par_acum2==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 2");
                                        System.out.println("_____________________________");
                                    }else if (acum3 > 50 || par_acum3==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 3");
                                        System.out.println("_____________________________");
                                    }else if (acum4 > 50 || par_acum4 ==3){
                                        booleano = "SI";
                                        System.out.println("_____________________________");
                                        System.out.println("El Ganador es el JUGADOR 4");
                                        System.out.println("_____________________________");
                                    }
                                }
                                System.out.println("");
                                System.out.println("::::. RESULTADO .::::");
                                System.out.println("Número de Intentos:"+intentos);
                                if (n==2) {
                                    System.out.println("JUGADOR 1: PUNTAJE ACUMULADO: "+ acum1+"  PARES ACUMULADOS: "+par_acum1);
                                    System.out.println("JUGADOR 2: PUNTAJE ACUMULADO: "+ acum2+ " PARES ACUMULADOS: "+ par_acum2);
                                }else if(n==3){
                                    System.out.println("JUGADOR 1: PUNTAJE ACUMULADO: "+ acum1+"  PARES ACUMULADOS: "+par_acum1);
                                    System.out.println("JUGADOR 2: PUNTAJE ACUMULADO: "+ acum2+ " PARES ACUMULADOS: "+ par_acum2);
                                    System.out.println("JUGADOR 3: PUNTAJE ACUMULADO: "+ acum3+ " PARES ACUMULADOS: "+ par_acum3);
                                }else{
                                    System.out.println("JUGADOR 1: PUNTAJE ACUMULADO: "+ acum1+"  PARES ACUMULADOS: "+par_acum1);
                                    System.out.println("JUGADOR 2: PUNTAJE ACUMULADO: "+ acum2+ " PARES ACUMULADOS: "+ par_acum2);
                                    System.out.println("JUGADOR 3: PUNTAJE ACUMULADO: "+ acum3+ " PARES ACUMULADOS: "+ par_acum3);
                                    System.out.println("JUGADOR 4: PUNTAJE ACUMULADO: "+ acum4+ " PARES ACUMULADOS: "+ par_acum4);
                                }
                            }
                        break;
                    case 4: 
                            System.out.println("");
                            System.out.println("Usted ha salido se encuentra en el menú principal..");
                            System.out.println("");
                    default:
                            System.out.println("");
                            System.out.println("Opción Incorrecta. Por favor intente nuevamente.");
                            System.out.println("");
                        break;
                }                    
    }
}
