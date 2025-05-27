/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        
        System.out.print("Digite la hora que deseas convertir en horas y minutos: ");
        horas = leer.nextInt();
        minutos = horas * 60;
        segundos = minutos * 60;
        System.out.print(horas + " horas en minutos son " + minutos + " y en segundos son " + segundos);
    }
}
