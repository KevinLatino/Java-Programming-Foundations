
package com.mycompany.ejercicio2_1;

import java.util.Scanner;


public class Ejercicio2_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        
        System.out.println("SISTEMA DE CALIFICACIÓN DE ESTUDIANTES");
        
        do {
            System.out.print("Ingrese la nota del estudiante (0-100): ");
            nota = scanner.nextDouble();
            
            if (nota < 0 || nota > 100) {
                System.out.println("Error: La nota debe estar entre 0 y 100. Intente nuevamente.");
            }
        } while (nota < 0 || nota > 100);
        
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Nota ingresada: " + nota);
        
        if (nota < 70) {
            System.out.println("Calificación: Insuficiente");
        } else if (nota >= 70 && nota <= 80) {
            System.out.println("Calificación: Bien");
        } else if (nota >= 81 && nota <= 90) {
            System.out.println("Calificación: Notable");
        } else if (nota > 90) {
            System.out.println("Calificación: Sobresaliente");
        }
        scanner.close();
    }
}
