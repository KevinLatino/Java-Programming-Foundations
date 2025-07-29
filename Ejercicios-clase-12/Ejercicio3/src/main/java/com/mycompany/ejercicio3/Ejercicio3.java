package com.mycompany.ejercicio3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ejercicio3 extends JFrame implements ActionListener {

    private JTextField textfield1, textfield2;
    private JButton boton1;

    public Ejercicio3() {
        setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Ingrese el primer número:");
        add(label1);

        textfield1 = new JTextField(10);
        add(textfield1);

        JLabel label2 = new JLabel("Ingrese el segundo número:");
        add(label2);

        textfield2 = new JTextField(10);
        add(textfield2);

        boton1 = new JButton("Dividir");
        boton1.addActionListener(this);
        add(boton1);

        setTitle("División de Enteros");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            String cad1 = textfield1.getText().trim();
            String cad2 = textfield2.getText().trim();

            try {
                int valor1 = Integer.parseInt(cad1);
                int valor2 = Integer.parseInt(cad2);

                if (valor2 == 0) {
                    setTitle("No se puede dividir por cero.");
                } else {
                    double resultado = (double) valor1 / valor2;
                    setTitle("La división de " + valor1 + " entre " + valor2 + " es " + resultado);
                }

            } catch (NumberFormatException ex) {
                setTitle("Debe ingresar números enteros.");
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio3 formulario1 = new Ejercicio3();
        formulario1.setBounds(0, 0, 450, 170);
        formulario1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        formulario1.setVisible(true);
    }
}
