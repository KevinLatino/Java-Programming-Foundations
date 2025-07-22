

package com.mycompany.ejercicio5;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Ejercicio5 extends JFrame implements ActionListener {
    JButton b;
    Container c;
    
    Ejercicio5() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("Color");
        b.addActionListener(this);
        c.add(b);
    }
    
    public void actionPerformed(ActionEvent e) {
        Color initialColor = Color.RED;
        Color color = JColorChooser.showDialog(this, "Select a color", initialColor);
        if (color != null) {
            c.setBackground(color);
        }
    }
    
    public static void main(String[] args) {
        Ejercicio5 ch = new Ejercicio5();
        ch.setSize(400, 400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}