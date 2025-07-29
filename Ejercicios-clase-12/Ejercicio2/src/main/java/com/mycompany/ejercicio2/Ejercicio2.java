package com.mycompany.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número entero: ");
            int numero1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el segundo número entero: ");
            int numero2 = Integer.parseInt(scanner.nextLine());

            if (numero2 == 0) {
                System.out.println("Error: No se puede dividir por cero.");
            } else {
                double resultado = (double) numero1 / numero2;
                System.out.println("El resultado de dividir " + numero1 + " entre " + numero2 + " es: " + resultado);
            }

        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar valores enteros válidos.");
        }

        scanner.close();
    }
}
