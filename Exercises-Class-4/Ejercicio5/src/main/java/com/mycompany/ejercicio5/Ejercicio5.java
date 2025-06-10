/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        mostrarInformacion();
        int numero = leerNumero(scanner);
        mostrarNumeros(numero);
        
        scanner.close();
    }
    
    public static void mostrarInformacion() {
        System.out.println("Este programa muestra todos los numeros del 1 hasta N");
        System.out.println();
    }
    
    public static int leerNumero(Scanner scanner) {
        System.out.print("Ingrese un numero mayor que 1: ");
        int numero = scanner.nextInt();
        
        while (numero <= 1) {
            System.out.print("El numero debe ser mayor que 1. Ingrese nuevamente: ");
            numero = scanner.nextInt();
        }
        
        return numero;
    }
    
    public static void mostrarNumeros(int n) {
        System.out.println("\nLos numeros del 1 al " + n + " son:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            if (i < n) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
