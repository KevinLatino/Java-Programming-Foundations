/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;
import java.util.Scanner;


/**
 *
 * @author kevinlatinomarin
 */
public class Ejercicio2 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Ingrese la primera nota: ");
    double nota1 = input.nextDouble();

    System.out.print("Ingrese la segunda nota: ");
    double nota2 = input.nextDouble();

    System.out.print("Ingrese la tercera nota: ");
    double nota3 = input.nextDouble();

    double promedio = (nota1 + nota2 + nota3) / 3;

    System.out.println("El promedio es: " + promedio);
 }
    
} 
