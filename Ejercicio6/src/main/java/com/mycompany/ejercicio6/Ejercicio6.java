/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;

import java.util.Scanner; 

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el lado del cuadrado: ");

        double lado = teclado.nextDouble();
        double perimetro = lado * 4;

        System.out.println("El perímetro del cuadrado es: " + perimetro);
        teclado.close();
    }
}

