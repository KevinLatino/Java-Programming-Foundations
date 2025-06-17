/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solucionejercicio1;
import java.util.Scanner;

public class Solucionejercicio1 {
    private Scanner teclado;
    private int[] sueldos;

    public void cargar() {
        teclado = new Scanner(System.in);
        sueldos = new int[5];
        for(int i = 0; i < 5; i++) {
            System.out.print("Ingrese el valor para sueldos[" + i + "]: ");
            sueldos[i] = teclado.nextInt();
        }
    }

    public void imprimir() {
        for(int f = 0; f < 5; f++) {
            System.out.println(sueldos[f]);
        }
    }

    public static void main(String[] args) {
        Solucionejercicio1 llamar = new Solucionejercicio1();
        llamar.cargar();
        llamar.imprimir();
    }
}