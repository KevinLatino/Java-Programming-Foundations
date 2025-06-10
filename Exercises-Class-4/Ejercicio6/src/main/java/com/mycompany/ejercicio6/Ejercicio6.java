/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;
/**
 *
 * @author aleja
 */
public class Ejercicio6 {
    
    public static void main(String[] args) {
        mostrarInformacion();
        mostrarNumerosParesYProducto();
    }
    
    public static void mostrarInformacion() {
        System.out.println("Este programa calcula el producto de los números impares entre 1 y 10");
        System.out.println();
    }
    
    public static void mostrarNumerosParesYProducto() {
        long producto = calcularProductoPares();
        String numerosImpares = obtenerNumerosPares();
        
        System.out.println("Los numeros impares entre 1 y 10 son: " + numerosImpares);
        System.out.println("El producto de estos numeros es: " + producto);
        System.out.println("Calculo: " + obtenerCalculoDetallado() + " = " + producto);
    }
    
    public static long calcularProductoPares() {
        long producto = 1;
        
        for (int i = 1; i <= 10; i += 2) {
            producto *= i;
        }
        
        return producto;
    }
    
    public static String obtenerNumerosPares() {
        String resultado = "";
        
        for (int i = 1; i <= 10; i += 2) {
            resultado += i;
            if (i < 9) {
                resultado += ", ";
            }
        }
        
        return resultado;
    }
    
    public static String obtenerCalculoDetallado() {
        String calculo = "";
        
        for (int i = 1; i <= 10; i += 2) {
            calculo += i;
            if (i < 9) {
                calculo += " x ";
            }
        }
        
        return calculo;
    }
}