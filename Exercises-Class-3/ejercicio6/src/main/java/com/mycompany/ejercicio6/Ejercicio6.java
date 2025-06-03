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
    public static final double PRECIO_PAN = 700.0;
    public static final double DESCUENTO_PAN_VIEJO = 0.60;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        mostrarInformacion();
        int barrasVendidas = leerBarrasVendidas(scanner);
        calcularYMostrarResultados(barrasVendidas);
        
        scanner.close();
    }
    
    public static void mostrarInformacion() {
        System.out.println("=== PANADERiA ===");
        System.out.println("Precio por barra de pan: " + PRECIO_PAN);
        System.out.println("Descuento por pan del dia anterior: " + (DESCUENTO_PAN_VIEJO * 100) + "%");
        System.out.println();
    }
    
    public static int leerBarrasVendidas(Scanner scanner) {
        System.out.print("Ingrese el numero de barras vendidas que NO son del dia: ");
        int barras = scanner.nextInt();
        
        while (barras < 0) {
            System.out.print("Por favor ingrese un numero positivo: ");
            barras = scanner.nextInt();
        }
        
        return barras;
    }
    
    public static double calcularPrecioHabitual() {
        return PRECIO_PAN;
    }
    
    public static double calcularDescuento(double precioHabitual) {
        return precioHabitual * DESCUENTO_PAN_VIEJO;
    }
    
    public static double calcularPrecioFinal(double precioHabitual, double descuento) {
        return precioHabitual - descuento;
    }
    
    public static double calcularCostoTotal(int barrasVendidas, double precioFinal) {
        return barrasVendidas * precioFinal;
    }
    
    public static void calcularYMostrarResultados(int barrasVendidas) {
        double precioHabitual = calcularPrecioHabitual();
        double descuento = calcularDescuento(precioHabitual);
        double precioFinal = calcularPrecioFinal(precioHabitual, descuento);
        double costoTotal = calcularCostoTotal(barrasVendidas, precioFinal);
        
        mostrarResultados(barrasVendidas, precioHabitual, descuento, precioFinal, costoTotal);
    }
    
    public static void mostrarResultados(int barras, double precioHabitual, 
                                       double descuento, double precioFinal, double costoTotal) {
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Barras vendidas (no del dia): " + barras);
        System.out.println("Precio habitual por barra: " + String.format("%.2f", precioHabitual));
        System.out.println("Descuento por barra: " + String.format("%.2f", descuento));
        System.out.println("Precio final por barra: " + String.format("%.2f", precioFinal));
        System.out.println("Costo total: " + String.format("%.2f", costoTotal));
        
        double ahorroTotal = barras * descuento;
        System.out.println("Ahorro total por descuento: " + String.format("%.2f", ahorroTotal));
    }
}