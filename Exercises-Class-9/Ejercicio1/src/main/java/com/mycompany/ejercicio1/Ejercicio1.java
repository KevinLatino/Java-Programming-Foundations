/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;
import javax.swing.*;
import java.awt.event.*;

public class Ejercicio1 extends JFrame implements ItemListener {
    private JComboBox combo1;

    public Ejercicio1() {
        setLayout(null);

        combo1 = new JComboBox();
        combo1.setBounds(10, 10, 150, 20);
        add(combo1);

        combo1.addItem("rojo");
        combo1.addItem("verde");
        combo1.addItem("azul");
        combo1.addItem("amarillo");
        combo1.addItem("negro");

        combo1.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == combo1) {
            String seleccionado = (String) combo1.getSelectedItem();
            setTitle(seleccionado);
        }
    }

    public static void main(String[] ar) {
        Ejercicio1 formulario1 = new Ejercicio1();
        formulario1.setBounds(0, 0, 400, 200);
        formulario1.setVisible(true);
    }
}
