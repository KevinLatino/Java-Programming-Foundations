/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class Ejercicio3 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
       float C = 0;
       float F = 0;
       System.out.print("Digite un temperatura en Celsius: ");
       C = leer.nextFloat();
       F =  C * 9/5 + 32;
       System.out.print("La temperatura en Fahrenheit es: " + F);
       
    }
}
