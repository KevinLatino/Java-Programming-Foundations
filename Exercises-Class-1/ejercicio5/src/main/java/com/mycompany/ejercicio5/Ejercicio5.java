/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Ejercicio5 {
    
    static final float valor_pi = 3.141592f;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int radio = 0;
        System.out.println("Digite el radio del circulo que desea calcular: ");
        radio = leer.nextInt();
        
        float area = valor_pi * radio * radio;
        System.out.println("El area del circulo es: " + area);
   }
}
