
package com.mycompany.ejercicio8;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio8 extends JFrame implements ActionListener {
    private JTextField textfield1, textfield2;
    private JButton boton1;
    
    public Ejercicio8() {
        setLayout(null);
        
        // Create and configure first text field
        textfield1 = new JTextField();
        textfield1.setBounds(10, 10, 150, 30);
        add(textfield1);
        
        // Create and configure second text field
        textfield2 = new JTextField();
        textfield2.setBounds(10, 50, 150, 30);
        add(textfield2);
        
        // Create and configure the sum button
        boton1 = new JButton("Sumar");
        boton1.setBounds(10, 90, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            try {
                String cad1 = textfield1.getText();
                String cad2 = textfield2.getText();
                int x1 = Integer.parseInt(cad1);
                int x2 = Integer.parseInt(cad2);
                int suma = x1 + x2;
                String total = String.valueOf(suma);
                setTitle(total);
            } catch (NumberFormatException ex) {
                setTitle("Error: Ingrese números válidos");
            }
        }
    }
    
    public static void main(String[] args) {
        Ejercicio8 formulario1 = new Ejercicio8();
        formulario1.setBounds(0, 0, 200, 180);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
