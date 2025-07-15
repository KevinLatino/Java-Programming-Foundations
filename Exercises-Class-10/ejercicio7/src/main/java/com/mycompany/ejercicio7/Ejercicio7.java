
package com.mycompany.ejercicio7;

import javax.swing.JOptionPane;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog(
            null, 
            "Escriba su nombre", 
            "Entrada", 
            JOptionPane.QUESTION_MESSAGE
        );
        
        if (nombre == null || nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ingresó un nombre válido");
            return;
        }
        
        String[] carreras = {
            "Ingeniería en sistemas computacionales",
            "Ingeniería Industrial", 
            "Ingeniería Civil",
            "Administración de Empresas",
            "Medicina"
        };
        
        String carreraSeleccionada = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione una carrera a cursar",
            "Carrera",
            JOptionPane.QUESTION_MESSAGE,
            null,
            carreras,
            carreras[0] 
        );
        
        if (carreraSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "No se seleccionó una carrera");
            return;
        }
        
        String[] opciones = {"Opcion A", "Opcion B", "Opcion C", "Opcion D"};
        
        int opcionSeleccionada = JOptionPane.showOptionDialog(
            null,
            "Es necesario que seleccione una opcion",
            "Título",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0] 
        );
        
        if (opcionSeleccionada != -1) {
            String mensaje = """
                             Informaci\u00f3n ingresada:
                             Nombre: """ + nombre + "\n" +
                           "Carrera: " + carreraSeleccionada + "\n" +
                           "Opción seleccionada: " + opciones[opcionSeleccionada];
            
            JOptionPane.showMessageDialog(
                null, 
                mensaje, 
                "Resumen", 
                JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(null, "No se seleccionó ninguna opción");
        }
    }
}