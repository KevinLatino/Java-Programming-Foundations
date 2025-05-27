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
        Persona persona1 = new Persona();
        persona1.inicializar();
        persona1.imprimir();
        persona1.esMayorEdad();
    }
}

class Persona {
    private Scanner teclado;
    private String nombre;
    private int edad;

    public void inicializar() {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese la edad: ");
        edad = teclado.nextInt();
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void esMayorEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " no es mayor de edad.");
        }
    }
}
