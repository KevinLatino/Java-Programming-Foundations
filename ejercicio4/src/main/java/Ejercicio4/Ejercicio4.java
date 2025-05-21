package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = input.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = input.nextDouble();

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num2 != 0 ? (num1 / num2) : "No se puede dividir entre cero"));

        input.close();
    }
}
