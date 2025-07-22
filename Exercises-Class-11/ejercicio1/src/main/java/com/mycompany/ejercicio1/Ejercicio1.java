/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author aleja
 */
public class Ejercicio1 extends JFrame implements ActionListener {
    private JPopupMenu popupmenu;
    private JMenuItem cut, copy, paste;
    
    public Ejercicio1() {
        final JFrame f = new JFrame("PopupMenu Example");
        final JPopupMenu popupmenu = new JPopupMenu("Edit");
        
        // Crear elementos del menú popup
        JMenuItem cut = new JMenuItem("Cut");
        JMenuItem copy = new JMenuItem("Copy");
        JMenuItem paste = new JMenuItem("Paste");
        
        // Agregar ActionListener a cada elemento
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        
        // Agregar elementos al popup menu
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);
        
        // Agregar MouseListener para detectar click derecho
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // Verificar si es click derecho
                if (SwingUtilities.isRightMouseButton(e)) {
                    popupmenu.show(f, e.getX(), e.getY());
                }
            }
        });
        
        // Configurar el JFrame
        f.add(popupmenu);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Agregar etiqueta informativa
        JLabel label = new JLabel("Haz click derecho para ver el menú popup");
        label.setBounds(50, 100, 250, 30);
        f.add(label);
    }
    
    // Implementar ActionListener para manejar eventos del menú
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        
        switch (comando) {
            case "Cut":
                JOptionPane.showMessageDialog(this, "Has seleccionado: Cortar");
                break;
            case "Copy":
                JOptionPane.showMessageDialog(this, "Has seleccionado: Copiar");
                break;
            case "Paste":
                JOptionPane.showMessageDialog(this, "Has seleccionado: Pegar");
                break;
        }
    }
    
    public static void main(String args[]) {
        new Ejercicio1();
    }
}