/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String texto = "";
        String textoMayusculas = "";
        System.out.print("Digite un texto que quieras ver en mayusculas: ");
        texto = leer.nextLine();
        textoMayusculas = texto.toUpperCase();
        System.out.println("El texto en mayusculas seria: " + textoMayusculas);
        
    }
}
