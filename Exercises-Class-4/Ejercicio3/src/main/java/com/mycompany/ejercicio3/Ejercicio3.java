/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

/**
 *
 * @author kevinlatinomarin
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int numero;

        System.out.print("Digite un número (negativo para salir): ");
        numero = scanner.nextInt();

        while (numero >= 0) {
            int cuadrado = numero * numero;
            System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

            System.out.print("Digite otro número (negativo para salir): ");
            numero = scanner.nextInt();
        }

        System.out.println("Programa finalizado. Digitó un número negativo.");
    }
}
