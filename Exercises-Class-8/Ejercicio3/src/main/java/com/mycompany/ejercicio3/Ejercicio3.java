package com.mycompany.ejercicio3;

import javax.swing.*;

public class Ejercicio3 extends JFrame {

    public Ejercicio3() {
        setLayout(null);

        JLabel nombrePrograma = new JLabel("Mi Programa Java");
        nombrePrograma.setBounds(20, 20, 200, 30);
        add(nombrePrograma);

        JLabel versionPrograma = new JLabel("Versión 1.0");
        versionPrograma.setBounds(20, 100, 200, 30);
        add(versionPrograma);

        setTitle("Ventana Principal");
        setSize(300, 200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejercicio3();
    }
}
