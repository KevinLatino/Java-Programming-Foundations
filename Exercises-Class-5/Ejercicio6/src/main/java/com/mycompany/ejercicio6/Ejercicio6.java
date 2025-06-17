package com.mycompany.ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Ingrese los elementos de la matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento en posición [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        teclado.close();
    }
}
