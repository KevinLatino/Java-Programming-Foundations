/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {
    Scanner teclado = new Scanner(System.in);
    int numero = 0;

    public void leer() {
        System.out.println("Digite el numero entre 0 y 10: ");
        numero = teclado.nextInt();
        if (numero < 0 || numero > 10)
            System.out.println("El numero no esta entre 0 y 10 !!!");
        else
            mostrartabla(numero);
    }

    public void mostrartabla(int x) {
        System.out.println("La tabla de multiplicar del " + x + " es: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + x + " = " + i * x);
        }
    }

    public static void main(String[] args) {
        Ejercicio4 llamar = new Ejercicio4();
        llamar.leer();
    }
}
