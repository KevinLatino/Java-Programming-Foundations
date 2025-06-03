/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9;
import java.util.Scanner;

/**
 *
 * @author thewolflone
 */
public class Ejercicio9 {

    public static double celsiusAFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        return fahrenheit;
    }
    
    public static void mostrarMenu() {
        System.out.println("\n=== CONVERSOR DE TEMPERATURA ===");
        System.out.println("1. Convertir Celsius a Fahrenheit");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opción: ");
    }
    
    public static void mostrarResultado(double entrada, String unidadEntrada, double resultado, String unidadSalida) {
        System.out.println("\n--- RESULTADO ---");
        System.out.printf("%.2f %s = %.2f %s%n", 
                         entrada, unidadEntrada, resultado, unidadSalida);
        System.out.println("-----------------");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double temperatura, resultado;
        
        System.out.println("EJERCICIO 9 - CONVERSIÓN DE TEMPERATURAS");
        System.out.println("Universidad Latinoamericana de Ciencia y Tecnología");
        
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    // Celsius a Fahrenheit
                    System.out.print("\nIngrese la temperatura en Celsius: ");
                    temperatura = scanner.nextDouble();
                    
                        resultado = celsiusAFahrenheit(temperatura);
                        mostrarResultado(temperatura, "°C", resultado, "°F");
                }
                    
                case 2 -> System.out.println("\n¡Gracias por usar el conversor de temperatura!");
                    
                default -> System.out.println("\nOpción inválida. Por favor seleccione 1, 2 o 3.");
            }
            
        } while (opcion != 3);
        
        scanner.close();
    }
}
