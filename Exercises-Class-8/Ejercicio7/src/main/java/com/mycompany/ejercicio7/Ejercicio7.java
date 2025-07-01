package com.mycompany.ejercicio7;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio7 extends JFrame implements ActionListener {
    private final JTextField textfield1;
    private JLabel label1;
    private JButton boton1;
    
    public Ejercicio7() {
        setLayout(null);
        
        label1 = new JLabel("Usuario:");
        label1.setBounds(10, 10, 100, 30);
        add(label1);
        
        textfield1 = new JTextField();
        textfield1.setBounds(120, 10, 200, 30);
        add(textfield1);
        
        boton1 = new JButton("Aceptar");
        boton1.setBounds(10, 50, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            String texto = textfield1.getText();
            setTitle(texto);
        }
    }
    
    public static void main(String[] args) {
        Ejercicio7 formulario1 = new Ejercicio7();
        formulario1.setBounds(0, 0, 400, 150);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}