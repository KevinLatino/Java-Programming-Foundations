package com.mycompany.ejercicio5;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejercicio5 extends JFrame implements ChangeListener {

    private JCheckBox check1, check2, check3;

    public Ejercicio5() {
        setLayout(null);

        check1 = new JCheckBox("Inglés");
        check1.setBounds(10, 10, 150, 30);
        check1.addChangeListener(this);
        add(check1);

        check2 = new JCheckBox("Francés");
        check2.setBounds(10, 50, 150, 30);
        check2.addChangeListener(this);
        add(check2);

        check3 = new JCheckBox("Alemán");
        check3.setBounds(10, 90, 150, 30);
        check3.addChangeListener(this);
        add(check3);

        setTitle("Idiomas");
        setBounds(0, 0, 300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        String cad = "";

        if (check1.isSelected()) {
            cad += "Inglés-";
        }
        if (check2.isSelected()) {
            cad += "Francés-";
        }
        if (check3.isSelected()) {
            cad += "Alemán-";
        }

        setTitle(cad);
    }

    public static void main(String[] args) {
        new Ejercicio5();
    }
}
