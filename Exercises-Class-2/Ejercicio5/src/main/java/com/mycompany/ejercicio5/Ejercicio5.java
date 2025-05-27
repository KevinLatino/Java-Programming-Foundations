/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    private double numero1;
    private double numero2;

    public Ejercicio5(double num1, double num2) {
        numero1 = num1;
        numero2 = num2;
    }

    public double suma() {
        return numero1 + numero2;
    }

    public double resta() {
        return numero1 - numero2;
    }

    public double multiplicacion() {
        return numero1 * numero2;
    }

    public double division() {
        return numero1 / numero2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        Ejercicio5 op = new Ejercicio5(num1, num2);

        System.out.println("Suma: "            + op.suma());
        System.out.println("Resta: "           + op.resta());
        System.out.println("Multiplicación: "  + op.multiplicacion());
        System.out.println("División: "        + op.division());
    }
}
