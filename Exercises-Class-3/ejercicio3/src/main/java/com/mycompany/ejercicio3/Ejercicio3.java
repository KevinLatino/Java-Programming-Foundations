/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    private Scanner leer;
    private int a;
    private int b;
    private int c;

    public void leer() {
        leer = new Scanner(System.in);
        System.out.print("Digite el primer numero: ");
        a = leer.nextInt();
        System.out.print("Digite el segundo numero: ");
        b = leer.nextInt();
        System.out.print("Digite el tercer numero: ");
        c = leer.nextInt();
    }

    public void evaluar() {
        if (a == b && b == c) {
            System.out.print("Los tres numeros son iguales");
        } else if (a >= b && a >= c) {
            System.out.print("El numero mayor es: " + a);
        } else if (b >= a && b >= c) {
            System.out.print("El numero mayor es: " + b);
        } else {
            System.out.print("El numero mayor es: " + c);
        }
    }

    public static void main(String[] args) {
        Ejercicio3 instancia = new Ejercicio3();
        instancia.leer();
        instancia.evaluar();
    }
}
