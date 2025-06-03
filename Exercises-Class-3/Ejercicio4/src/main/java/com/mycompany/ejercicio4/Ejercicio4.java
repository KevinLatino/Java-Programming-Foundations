/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de flores que desea llevar: ");
        int cantidad = scanner.nextInt();
        scanner.close();

        int precioPorFlor = 350;
        double total;

        if (cantidad > 10) {
            total = cantidad * precioPorFlor * 0.90;
        } else {
            total = cantidad * precioPorFlor;
        }

        System.out.println("Llevará " + cantidad + " flores y el costo total a pagar es: ¢" + total);
    }
}

