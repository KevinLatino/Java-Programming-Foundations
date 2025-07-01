/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio5 extends JFrame implements ActionListener {
    JButton boton1, boton2;
    
    public Ejercicio5() {
        setLayout(null);
        boton1 = new JButton("Finalizar");
        boton1.setBounds(150, 125, 200, 120);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            System.exit(0);
        }
    }
    
    public static void main(String[] ar) {
        Ejercicio5 formulario1 = new Ejercicio5();
        formulario1.setBounds(0, 0, 450, 350);
        formulario1.setVisible(true);
    }
}
