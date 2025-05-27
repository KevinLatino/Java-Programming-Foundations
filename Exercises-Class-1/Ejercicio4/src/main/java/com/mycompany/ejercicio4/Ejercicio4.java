/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;
import java.util.Scanner;


/**
 *
 * @author kevinlatinomarin
 */

public class Ejercicio4 {

    public static void main(String[] args) {       
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = entrada.nextDouble();

        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero2 != 0 ? numero1 / numero2 : 0;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        if (numero2 != 0) {
            System.out.println("División: " + division);
        } else {
            System.out.println("No se puede dividir entre 0.");
        }
    
    }
}
