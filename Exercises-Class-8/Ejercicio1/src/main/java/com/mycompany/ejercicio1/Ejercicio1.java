/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;
import javax.swing.*;

public class Ejercicio1 extends JFrame {
    private JLabel label1;

    public Ejercicio1() {
        setLayout(null);
        label1 = new JLabel("Hola Mundo.");
        label1.setBounds(50, 50, 200, 30);
        add(label1);
    }

    public static void main(String[] ar) {
        Ejercicio1 formulario1 = new Ejercicio1();
        formulario1.setBounds(200, 100, 1000, 600);
        formulario1.setVisible(true);
    }
}