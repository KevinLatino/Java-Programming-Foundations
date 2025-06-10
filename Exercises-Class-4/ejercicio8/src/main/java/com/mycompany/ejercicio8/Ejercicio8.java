
package com.mycompany.ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void mostrarMenu() {
        System.out.println("\n=== CALCULADORA ===");
        System.out.println("1. Leer 2 números");
        System.out.println("2. Mostrar suma");
        System.out.println("3. Mostrar resta");
        System.out.println("4. Mostrar multiplicación");
        System.out.println("5. Mostrar división");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }
    
    public static void leerNumeros(Scanner scanner, double[] numeros) {
        System.out.print("Ingrese el primer número: ");
        numeros[0] = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        numeros[1] = scanner.nextDouble();
        System.out.println("Números ingresados correctamente!");
    }
    
    public static void mostrarSuma(double[] numeros) {
        if (numerosIngresados(numeros)) {
            double resultado = numeros[0] + numeros[1];
            System.out.println("Suma: " + numeros[0] + " + " + numeros[1] + " = " + resultado);
        }
    }
    
    public static void mostrarResta(double[] numeros) {
        if (numerosIngresados(numeros)) {
            double resultado = numeros[0] - numeros[1];
            System.out.println("Resta: " + numeros[0] + " - " + numeros[1] + " = " + resultado);
        }
    }
    
    public static void mostrarMultiplicacion(double[] numeros) {
        if (numerosIngresados(numeros)) {
            double resultado = numeros[0] * numeros[1];
            System.out.println("Multiplicación: " + numeros[0] + " × " + numeros[1] + " = " + resultado);
        }
    }
    
    public static void mostrarDivision(double[] numeros) {
        if (numerosIngresados(numeros)) {
            if (numeros[1] != 0) {
                double resultado = numeros[0] / numeros[1];
                System.out.println("División: " + numeros[0] + " ÷ " + numeros[1] + " = " + resultado);
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
            }
        }
    }
    
    public static boolean numerosIngresados(double[] numeros) {
        if (numeros[0] == Double.MIN_VALUE || numeros[1] == Double.MIN_VALUE) {
            System.out.println("Error: Primero debe ingresar los dos números (opción 1).");
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double[] numeros = {Double.MIN_VALUE, Double.MIN_VALUE};
        
        System.out.println("¡Bienvenido a la Calculadora!");
        
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> leerNumeros(scanner, numeros);
                    
                case 2 -> mostrarSuma(numeros);
                    
                case 3 -> mostrarResta(numeros);
                    
                case 4 -> mostrarMultiplicacion(numeros);
                    
                case 5 -> mostrarDivision(numeros);
                    
                case 6 -> System.out.println("¡Gracias por usar la calculadora! ¡Hasta luego!");
                    
                default -> System.out.println("Opción inválida. Por favor, seleccione una opción del 1 al 6.");
            }
            
        } while (opcion != 6);
        
        scanner.close();
    }
}
