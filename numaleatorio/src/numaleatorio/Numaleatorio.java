/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numaleatorio;

import java.util.ArrayList;

/**
 *
 * @author Aula1
 */
public class Numaleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
    ArrayList numeros = new ArrayList();
    ArrayList estrellas = new ArrayList();

// Genera 5 numeros entre 1 y 50
for (int i = 1; i <= 5; i++) {
    numero = (int) (Math.random() * 50 + 1);
    if (numeros.contains(numero)) {
        i--;
    } else {
        numeros.add(numero);
    }
}

System.out.println("La convinacion del Euromillones es:");
    }
    
}
