package com.AceptaElReto.nivel1;


import java.util.Scanner;

/**
 *
 * @author TenMM2
 *
 */
public class Ejercicio140 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, suma = 0;
        String cifra;

//Bucle que termina con un número negativo.
        do {
            suma = 0;
            //Pedir número.
            n = sc.nextInt();
            
            if (n > -1) {
//Salida: la suma de las cifras (3433 -> 3 + 4 + 3 + 3 = 13).
                cifra = Integer.toString(n);
                for (int i = 0; i < cifra.length(); i++) {
                    suma += Character.getNumericValue(cifra.charAt(i));
                    
                    if (i < cifra.length() - 1) {
                        System.out.print(Character.getNumericValue(cifra.charAt(i)) + " + ");
                    }else {
                        System.out.print(Character.getNumericValue(cifra.charAt(i)));
                    }
                }
                System.out.println(" = " + suma);
            }
            
        } while (n > -1);
        
        
    }
}
