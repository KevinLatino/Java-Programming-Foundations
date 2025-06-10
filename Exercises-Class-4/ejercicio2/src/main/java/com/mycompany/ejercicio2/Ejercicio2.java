
package com.mycompany.ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

    public static double solicitarNota(Scanner scanner, int numeroNota) {
        System.out.print("Ingrese la nota " + numeroNota + ": ");
        return scanner.nextDouble();
    }
    
    public static double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3.0;
    }
    
    public static void evaluarCurso(double promedio) {
        System.out.println("El promedio es: " + String.format("%.2f", promedio));
        
        if (promedio >= 7) {
            System.out.println("Ganó el curso");
        } else {
            System.out.println("Perdió el curso");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA DE PROMEDIO DE NOTAS ===");
        System.out.println("Ingrese las 3 notas del alumno");
        
        double nota1 = solicitarNota(scanner, 1);
        double nota2 = solicitarNota(scanner, 2);
        double nota3 = solicitarNota(scanner, 3);
        
        double promedio = calcularPromedio(nota1, nota2, nota3);
        
        evaluarCurso(promedio);
        
        scanner.close();
    }
}
