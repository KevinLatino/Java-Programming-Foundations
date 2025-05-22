/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int precio = 0;
        int cantidad = 0;
        System.out.print("Digite el precio del articulo que desea comprar: ");
        precio = leer.nextInt();
        System.out.print("Digite la cantidad que vas a llevar de este articulo: ");
        cantidad = leer.nextInt();
        
        precio *= cantidad;
        System.out.print("El monto a pagar seria de " + precio + " colones");
    }
}
