/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class Ejercicio4 {
    private double lado;
    
    public void leerLado() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del lado del cuadrado: ");
        lado = scanner.nextDouble();
    }
    
    public void imprimirArea() {
        double area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    }
    
    public void imprimirPerimetro() {
        double perimetro = lado * 4;
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }
    
    public static void main(String[] args) {
        Ejercicio4 cuadrado = new Ejercicio4();
        
        System.out.println("CALCULADORA DE CUADRADO");
        System.out.println();
        
        cuadrado.leerLado();
        System.out.println();
        cuadrado.imprimirArea();
        cuadrado.imprimirPerimetro();
    }
}
