/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solucionejercicio7;
import java.util.Scanner;
public class SolucionEjercicio7 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int numero = 0;
    System.out.print("Digite un numero: ");
    numero = leer.nextInt();
    switch (numero)  {
        case 0:
            System.out.println("El " + numero + " es cero.");
            break;
        case 1:
            System.out.println("El " + numero + " es uno.");
            break;
        case 2:
            System.out.println("El " + numero + " es dos.");
            break;
        case 3:
            System.out.println("El " + numero + " es tres.");
            break;
        default:
            System.out.println("El " + numero + " es mayor a tres.");
            
        }
    }
}
