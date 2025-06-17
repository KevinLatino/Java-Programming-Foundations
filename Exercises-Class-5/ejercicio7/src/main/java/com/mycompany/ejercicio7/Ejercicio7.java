

package com.mycompany.ejercicio7;


import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] matriz = new int[3][4];
        
        System.out.println("=== EJERCICIO 7 - MATRIZ 3x4 ===");
        System.out.println("Ingrese los datos para la matriz de 3 filas por 4 columnas:\n");
        
        for (int fila = 0; fila < 3; fila++) {
            System.out.println("Fila " + (fila + 1) + ":");
            for (int columna = 0; columna < 4; columna++) {
                System.out.print("Ingrese el valor para [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = scanner.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("=== MATRIZ COMPLETA ===");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("=== PRIMERA FILA ===");
        System.out.print("Fila 0: ");
        for (int columna = 0; columna < 4; columna++) {
            System.out.print(matriz[0][columna] + " ");
        }
        System.out.println("\n");
        
        System.out.println("=== ÚLTIMA FILA ===");
        System.out.print("Fila 2: ");
        for (int columna = 0; columna < 4; columna++) {
            System.out.print(matriz[2][columna] + " ");
        }
        System.out.println("\n");
        
        System.out.println("=== PRIMERA COLUMNA ===");
        System.out.println("Columna 0:");
        for (int fila = 0; fila < 3; fila++) {
            System.out.println("  " + matriz[fila][0]);
        }
        
        scanner.close();
    }
}