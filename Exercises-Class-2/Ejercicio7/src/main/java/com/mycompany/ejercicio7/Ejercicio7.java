/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    private int valor1, valor2, valor3;
    private final int peso1 = 1;
    private final int peso2 = 2;
    private final int peso3 = 3;

    public void inicializar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese valor 1: ");
        valor1 = sc.nextInt();
        System.out.print("Ingrese valor 2: ");
        valor2 = sc.nextInt();
        System.out.print("Ingrese valor 3: ");
        valor3 = sc.nextInt();
    }

    public double calcularPromedioPonderado() {
        int sumaPesos = peso1 + peso2 + peso3; 
        double sumaProductos = valor1 * peso1
                             + valor2 * peso2
                             + valor3 * peso3;
        return sumaProductos / sumaPesos;
    }

    public static void main(String[] args) {
        Ejercicio7 prog = new Ejercicio7();
        prog.inicializar();
        double promedio = prog.calcularPromedioPonderado();
        System.out.println("Pesos usados: " 
            + prog.peso1 + ", " + prog.peso2 + ", " + prog.peso3);
        System.out.println("Promedio ponderado: " + promedio);
    }
}
