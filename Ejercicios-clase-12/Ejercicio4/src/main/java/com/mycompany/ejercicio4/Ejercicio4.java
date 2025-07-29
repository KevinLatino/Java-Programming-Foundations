package com.mycompany.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[] vector = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50}; 

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un subíndice del vector (0 a 9): ");

        try {
            String entrada = scanner.nextLine();
            int indice = Integer.parseInt(entrada);

            // Intentar acceder al vector en ese índice
            int valor = vector[indice];

            System.out.println("El valor en el índice " + indice + " es: " + valor);

        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número entero válido.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango. Debe ser entre 0 y 9.");
        }

        scanner.close();
    }
}
