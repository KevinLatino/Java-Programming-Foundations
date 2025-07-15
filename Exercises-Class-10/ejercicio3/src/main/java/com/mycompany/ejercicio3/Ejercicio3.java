/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;
import javax.swing.*;

/**
 *
 * @author aleja
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        
        String seleccion = JOptionPane.showInputDialog(
            null, 
            "Digite su nombre:",
            "Input Dialog", 
            JOptionPane.QUESTION_MESSAGE 
        );
        
      
        if (seleccion != null && !seleccion.trim().isEmpty()) {
            System.out.println("El usuario ha escrito: " + seleccion);
            
          
            JOptionPane.showMessageDialog(null, 
                "¡Hola " + seleccion + "! Bienvenido al programa.",
                "Saludo",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("El usuario canceló o no ingresó ningún nombre.");
            JOptionPane.showMessageDialog(null, 
                "No se ingresó ningún nombre.",
                "Información",
                JOptionPane.WARNING_MESSAGE);
        }
        
      
        System.exit(0);
    }
}
