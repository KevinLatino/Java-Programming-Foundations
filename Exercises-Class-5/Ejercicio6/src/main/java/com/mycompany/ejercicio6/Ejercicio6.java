package com.mycompany.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Ingrese los números para la matriz de 4x4:");

        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.print("Valor en posición [" + fila + "][" + columna + "]: ");
                matriz[fila][columna] = scanner.nextInt();
            }
        }

        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.println(matriz[i][i]);
        }

        scanner.close();
    }
}
