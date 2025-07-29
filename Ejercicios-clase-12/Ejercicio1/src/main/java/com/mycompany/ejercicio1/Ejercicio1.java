/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kevinlatinomarin
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese un número entero: ");
            int num = teclado.nextInt();
            int cuadrado = num * num;
            System.out.println("El cuadrado de " + num + " es " + cuadrado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero.");
        }
    }
}
