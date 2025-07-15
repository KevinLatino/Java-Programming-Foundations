/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        int seleccion = JOptionPane.showOptionDialog(
            null,
            "Seleccione opcion",
            "Selector de opciones",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null, 
            new Object[] { "opcion 1", "opcion 2", "opcion 3" }, 
            "opcion 2"
        );

        if (seleccion != -1) {
            System.out.println("seleccionada opcion " + (seleccion + 1));
        }
    }
}
