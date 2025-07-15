/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import javax.swing.*;
/**
 *
 * @author aleja
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        
        String[] opciones = {"Casado/a", "Soltero/a", "Divorciado/a", "Otro"};
        
        Object seleccion = JOptionPane.showInputDialog(
            null,
            "Seleccione una opción:",
            "Seleccione su estado civil", 
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            opciones, 
            "Otro"
        );
        

        if (seleccion != null) {
            System.out.println("El usuario ha elegido: " + seleccion);
            
            String mensaje = "";
            switch (seleccion.toString()) {
                case "Casado/a":
                    mensaje = "¡Felicidades por su matrimonio!";
                    break;
                case "Soltero/a":
                    mensaje = "¡Disfrute su soltería!";
                    break;
                case "Divorciado/a":
                    mensaje = "Esperamos que todo esté bien.";
                    break;
                case "Otro":
                    mensaje = "Gracias por su respuesta.";
                    break;
            }
            
            
            JOptionPane.showMessageDialog(null, 
                "Ha seleccionado: " + seleccion + "\n" + mensaje,
                "Confirmación",
                JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("El usuario canceló la selección.");
            JOptionPane.showMessageDialog(null, 
                "No se seleccionó ninguna opción.",
                "Información",
                JOptionPane.WARNING_MESSAGE);
        }
        
     
        System.exit(0);
    }
}