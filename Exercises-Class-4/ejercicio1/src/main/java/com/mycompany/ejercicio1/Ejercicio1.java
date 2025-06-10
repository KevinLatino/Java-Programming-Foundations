/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingrese primer valor: ");
        num1 = teclado.nextInt();

        System.out.println("Ingrese segundo valor: ");
        num2 = teclado.nextInt();

        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
        } else {
            System.out.println("El mayor es: " + num2);
        }
    }
}

