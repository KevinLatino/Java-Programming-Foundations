/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solucionejercicio7;
import java.util.Scanner;
public class Solucionejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        System.out.printf("Su IMC es: %.2f\n", imc);
    }
}
