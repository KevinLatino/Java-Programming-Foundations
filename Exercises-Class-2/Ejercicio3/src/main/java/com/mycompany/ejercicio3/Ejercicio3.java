/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

public class Ejercicio3  {
    private Scanner leer;
    int x, y;

    public void inicializar() {
        leer = new Scanner(System.in);
        System.out.print("Ingrese coordenada x :");
        x = leer.nextInt();
        System.out.print("Ingrese coordenada y :");
        y = leer.nextInt();
    }

    public void imprimirCuadrante() {
        if (x > 0 & y > 0) {
            System.out.print("Se encuentra en el primer cuadrante.");
        } else {
            if (x < 0 & y > 0) {
                System.out.print("Se encuentra en el segundo cuadrante.");
            } else {
                if (x < 0 & y < 0) {
                    System.out.print("Se encuentra en el tercer cuadrante.");
                } else {
                    if (x > 0 & y < 0) {
                        System.out.print("Se encuentra en el cuarto cuadrante.");
                    } else {
                        System.out.print("El punto no esta en un cuadrante.");
                    }
                }
            }
        }
    }

    public static void main(String[] ar) {
        Ejercicio3  coordenadas;
        coordenadas = new Ejercicio3 ();
        coordenadas.inicializar();
        coordenadas.imprimirCuadrante();
    }
}