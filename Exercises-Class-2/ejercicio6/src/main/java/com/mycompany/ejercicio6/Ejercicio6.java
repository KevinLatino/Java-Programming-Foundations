/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;
import java.util.Scanner;

/**
 *
 * @author aleja
 */

public class Ejercicio6 {
    private int numero;
    
    public Ejercicio6(int numero) {
        this.numero = numero;
    }
    
    public Ejercicio6(int numero, int terminos) {
        this.numero = numero;
        mostrarTabla(terminos);
    }
    
    public void mostrarTabla() {
        System.out.println("=== Tabla del " + numero + " ===");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        System.out.println();
    }
    
    public void mostrarTabla(int terminos) {
        System.out.println("=== Tabla del " + numero + " (primeros " + terminos + " terminos) ===");
        for (int i = 1; i <= terminos; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¡Bienvenido al programa de tablas de multiplicar!");
        
        System.out.print("Ingrese el numero para la tabla de multiplicar: ");
        int numero = scanner.nextInt();
        
        System.out.print("Ingrese cuantos terminos desea mostrar: ");
        int terminos = scanner.nextInt();
        
        Ejercicio6 tabla1 = new Ejercicio6(numero);
        tabla1.mostrarTabla();
        
        Ejercicio6 tabla2 = new Ejercicio6(numero, terminos);
        
        scanner.close();
    }
}
