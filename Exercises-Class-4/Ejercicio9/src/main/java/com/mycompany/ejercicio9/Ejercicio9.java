/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9;

import java.util.Scanner;

/**
 *
 * @author kevinlatinomarin
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int numero;

        do {
            System.out.print("Digite un número para saber si es primo o digite un número menor que a 2 para salir: ");
            numero = scanner.nextInt();

            if (numero >= 2) {
                boolean esPrimo = true;

                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }

                if (esPrimo) {
                    System.out.println(numero + " es un número primo.");
                } else {
                    System.out.println(numero + " no es un número primo.");
                }
            }

        } while (numero >= 2);

        System.out.println("Programa finalizado. Digitó un número menor que 2.");
    }
}
