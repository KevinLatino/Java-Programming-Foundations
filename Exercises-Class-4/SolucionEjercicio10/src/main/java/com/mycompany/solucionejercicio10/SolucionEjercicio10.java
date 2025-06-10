/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solucionejercicio10;
import java.util.Scanner;
public class SolucionEjercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respuesta;
        
        do {
            System.out.println("\n --- menu --- ");
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("0. Salir ");
            System.out.print("Elija una opción: ");
            respuesta = scanner.nextInt();
            
            switch (respuesta) {
                case 1:
                    System.out.println("Escogiste la opción 1.");
                    break;
                case 2:
                    System.out.println("Escogiste la opción 2.");
                    break;
                case 3:
                    System.out.println("Escogiste la opción 3.");
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opción invalida.");
            }

        } while (respuesta != 0);

        scanner.close();
        
    }
}
