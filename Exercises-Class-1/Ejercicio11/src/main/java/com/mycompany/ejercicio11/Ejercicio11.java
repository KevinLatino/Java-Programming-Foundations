
package com.mycompany.ejercicio11;
import java.util.Scanner;


public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int first, last;
        boolean hasEvenNumber = false;
        
        System.out.print("Ingrese el número de inicio: ");
        first = read.nextInt();
        
        System.out.print("Ingrese el número de fin: ");
        last = read.nextInt();
                
        // Condicional para determinar si el rango es válido o no.
        if (first > last) {
            System.out.println("El rango ingresado no es válido.");
        } else{
            System.out.print("Los números pares del " + first + " al " + last + " son: ");
             // Ciclo para recorrer el rango de números y determinar los pares
            for (int i = first; i <= last; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                    hasEvenNumber = true;
                }
            }
        
            if (hasEvenNumber == false){
                System.out.println();
                System.out.println("No existen números pares para este rango");
            } else {
                System.out.println(); 

            }
        }
    }
}
