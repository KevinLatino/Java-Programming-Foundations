/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    private Scanner leer;
    private int numero;

    public void leer() {
        leer = new Scanner(System.in);
        System.out.print("Digite un numero: ");
        numero = leer.nextInt();
    }

    public void validar() {
        if (numero % 2 == 0) {
            System.out.print("El numero " + numero + " es par");
        } else {
            System.out.print("El numero " + numero + " es impar");
        }
    }

    public static void main(String[] args) {
        Ejercicio1 instancia = new Ejercicio1();
        instancia.leer();
        instancia.validar();
    }
}