

package com.mycompany.ejercicio4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ejercicio4 extends JFrame implements ActionListener{

     private JMenuBar mb;
    private JMenu menu1, menu2, menu3;
    private JMenuItem mi1, mi2, mi3, mi4;
    
    public Ejercicio4() {
        setLayout(null);
        
        mb = new JMenuBar();
        setJMenuBar(mb);
        
        menu1 = new JMenu("Opciones");
        mb.add(menu1);
        
        menu2 = new JMenu("Tamaño de la ventana");
        menu1.add(menu2);
        
        mi1 = new JMenuItem("640*480");
        mi1.addActionListener(this);
        menu2.add(mi1);
        
        mi2 = new JMenuItem("1024*768");
        mi2.addActionListener(this);
        menu2.add(mi2);
        
        menu3 = new JMenu("Color de fondo");
        menu1.add(menu3);
        
        mi3 = new JMenuItem("Rojo");
        mi3.addActionListener(this);
        menu3.add(mi3);
        
        mi4 = new JMenuItem("Verde");
        mi4.addActionListener(this);
        menu3.add(mi4);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mi1) {
            setSize(640, 480);
        }
        if (e.getSource() == mi2) {
            setSize(1024, 768);
        }
        if (e.getSource() == mi3) {
            getContentPane().setBackground(new Color(255, 0, 0)); 
        }
        if (e.getSource() == mi4) {
            getContentPane().setBackground(new Color(0, 255, 0)); 
        }
    }
    
    public static void main(String[] args) {
        Ejercicio4 formulario1 = new Ejercicio4();
        formulario1.setBounds(0, 0, 300, 200);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
