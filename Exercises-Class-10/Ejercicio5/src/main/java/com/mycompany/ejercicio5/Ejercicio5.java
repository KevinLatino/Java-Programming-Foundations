/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;
import javax.swing. *;
public class Ejercicio5 {
    public static void main(String[] args) {
        int confirmado = JOptionPane.showConfirmDialog(
        null,
        "¿Lo confirmas?");
        
        if (JOptionPane.OK_OPTION == confirmado)
                System.out.println("Confirmado borrar...");
        else
                System.out.println("No borrar...");
    }
}
