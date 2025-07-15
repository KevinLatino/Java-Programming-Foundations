

package com.mycompany.ejercicio8;

import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog(
            null,
            "¿Cuál es tu nombre?",
            "Entrada",
            JOptionPane.QUESTION_MESSAGE
        );
        
        if (nombre == null) {
            JOptionPane.showMessageDialog(
                null,
                "Operación cancelada por el usuario",
                "Cancelado",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        } else if (nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                null,
                "No se ingresó un nombre válido",
                "Error",
                JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        
        int confirmacion = JOptionPane.showConfirmDialog(
            null,
            "¿Está realmente seguro?",
            "Seleccionar una Opción",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        
        switch (confirmacion) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(
                    null,
                    "Hola " + nombre + "!\nHa seleccionado: SÍ",
                    "Confirmación",
                    JOptionPane.INFORMATION_MESSAGE
                );
                JOptionPane.showMessageDialog(
                    null,
                    "Operación realizada correctamente",
                    "Mensaje",
                    JOptionPane.INFORMATION_MESSAGE
                );
                break;
                
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(
                    null,
                    "Hola " + nombre + "!\nHa seleccionado: NO",
                    "Confirmación",
                    JOptionPane.INFORMATION_MESSAGE
                );
                JOptionPane.showMessageDialog(
                    null,
                    "Operación realizada correctamente",
                    "Mensaje",
                    JOptionPane.INFORMATION_MESSAGE
                );
                break;
                
            case JOptionPane.CANCEL_OPTION:
            case JOptionPane.CLOSED_OPTION:
                JOptionPane.showMessageDialog(
                    null,
                    "Operación cancelada",
                    "Cancelado",
                    JOptionPane.WARNING_MESSAGE
                );
                break;
        }
    }
}