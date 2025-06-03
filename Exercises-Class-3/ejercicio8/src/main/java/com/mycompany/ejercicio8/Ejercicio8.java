/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;
import java.util.Scanner;


/**
 *
 * @author aleja
 */

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        mostrarInformacion();
        int numero = leerNumero(scanner);
        long factorial = calcularFactorial(numero);
        mostrarResultado(numero, factorial);
        
        scanner.close();
    }
    
    public static void mostrarInformacion() {
        System.out.println("=== CALCULADORA DE FACTORIAL ===");
        System.out.println("Este programa calcula el factorial de un numero");
        System.out.println();
    }
    
    public static int leerNumero(Scanner scanner) {
        System.out.print("Ingrese un numero entero positivo: ");
        int numero = scanner.nextInt();
        
        while (numero < 0) {
            System.out.print("El numero debe ser positivo. Ingrese nuevamente: ");
            numero = scanner.nextInt();
        }
        
        return numero;
    }
    
    public static long calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        }
        
        long factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
    
    public static void mostrarResultado(int numero, long factorial) {
        System.out.println("\n=== RESULTADO ===");
        System.out.println("El factorial de " + numero + " es: " + factorial);
        
        if (numero <= 10) {
            mostrarCalculoDetallado(numero);
        }
    }
    
    public static void mostrarCalculoDetallado(int numero) {
        System.out.print("Calculo: " + numero + "! = ");
        
        if (numero == 0) {
            System.out.println("1 (por definicion)");
            return;
        }
        
        for (int i = numero; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) {
                System.out.print(" x ");
            }
        }
        System.out.println(" = " + calcularFactorial(numero));
    }
}
