/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio6;
import javax.swing.JOptionPane;
public class Ejercicio6 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(
            null,
            "Mensaje con dos parametros",
            "Mensaje",
            JOptionPane.PLAIN_MESSAGE
        );
        
        JOptionPane.showMessageDialog(
            null, 
            "Mensaje de advertencia", 
            "WARNING_MESSAGE", 
            JOptionPane.WARNING_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null, 
            "Mensaje sin icono",
            "PLAIN_MESSAGE", 
            JOptionPane.PLAIN_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null, 
            "Mensaje de error", 
            "ERROR_MESSAGE", 
            JOptionPane.ERROR_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null, 
            "Mensaje de información", 
            "INFORMACIÓN_MESSAGE", 
            JOptionPane.INFORMATION_MESSAGE
        );

        JOptionPane.showMessageDialog(
            null, 
            "Mensaje de pregunta", 
            "QUESTION_MESSAGE", 
            JOptionPane.QUESTION_MESSAGE
        );
    }
}
