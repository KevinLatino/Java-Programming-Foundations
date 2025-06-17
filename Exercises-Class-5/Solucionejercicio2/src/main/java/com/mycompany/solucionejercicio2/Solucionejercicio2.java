/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solucionejercicio2;
import java.util.Scanner;

public class Solucionejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float[] alturas = new float[5];
        float suma = 0;

        // Leer alturas
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la altura de la persona " + (i + 1) + ": ");
            alturas[i] = teclado.nextFloat();
            suma += alturas[i]; // Acumular la suma
        }

        // Calcular promedio
        float promedio = suma / 5;

        // Mostrar resultado
        System.out.println("El promedio de las alturas es: " + promedio);
    }
}
