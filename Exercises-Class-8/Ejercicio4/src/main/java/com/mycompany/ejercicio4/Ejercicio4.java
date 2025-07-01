package com.mycompany.ejercicio4;

import javax.swing.*;
import java.awt.*;

public class Ejercicio4 extends JFrame {

    public Ejercicio4() {
        setLayout(null);

        JLabel label1 = new JLabel("Rojo");
        label1.setBounds(10, 20, 100, 30);
        label1.setForeground(Color.RED);
        add(label1);

        JLabel label2 = new JLabel("Verde");
        label2.setBounds(10, 60, 100, 30);
        label2.setForeground(Color.GREEN);
        add(label2);

        JLabel label3 = new JLabel("Azul");
        label3.setBounds(10, 100, 100, 30);
        label3.setForeground(Color.BLUE);
        add(label3);

        setTitle("Colores");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio4();
    }
}
