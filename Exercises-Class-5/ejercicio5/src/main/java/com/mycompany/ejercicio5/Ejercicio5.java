package com.mycompany.ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {
    private Scanner teclado;
    private int[][] matriz;

    public void cargar() {
        teclado = new Scanner(System.in);
        matriz = new int[3][5];
        for(int i=0; i<3; i++) {
            for(int j=0; j<5; j++) {
                System.out.print("Ingrese elemento en posición de matriz["+i+"]["+j+"]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }
    }

    public void imprimir() {
        for(int i=0; i<3; i++) {
            for(int j=0; j<5; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ejercicio5 llamar = new Ejercicio5();
        llamar.cargar();
        llamar.imprimir();
    }
}