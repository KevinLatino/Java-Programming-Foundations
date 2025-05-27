package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author kevinlatinomarin
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();

        System.out.println("Ingrese el lado 1:");
        double l1 = scanner.nextDouble();

        System.out.println("Ingrese el lado 2:");
        double l2 = scanner.nextDouble();

        System.out.println("Ingrese el lado 3:");
        double l3 = scanner.nextDouble();

        triangulo.inicializarLados(l1, l2, l3);
        triangulo.imprimirLadoMayor();
        triangulo.esEquilatero();

        scanner.close();
    }
}

class Triangulo {
    private double lado1, lado2, lado3;

    public void inicializarLados(double l1, double l2, double l3) {
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
    }

    public void imprimirLadoMayor() {
        double mayor = lado1;

        if (lado2 > mayor) {
            mayor = lado2;
        }

        if (lado3 > mayor) {
            mayor = lado3;
        }

        System.out.println("El lado mayor es: " + mayor);
    }

    public void esEquilatero() {
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilátero.");
        } else {
            System.out.println("El triángulo no es equilátero.");
        }
    }
}
