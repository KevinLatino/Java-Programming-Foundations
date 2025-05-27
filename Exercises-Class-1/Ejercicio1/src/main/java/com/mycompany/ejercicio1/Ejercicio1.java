/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author kevinlatinomarin
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = entrada.nextInt();

        int suma = numero1 + numero2;

        System.out.println("La suma es: " + suma);
    }
}
