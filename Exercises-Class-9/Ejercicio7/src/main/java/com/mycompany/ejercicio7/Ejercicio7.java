package com.mycompany.ejercicio7;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejercicio7 {
    public static void main(String[] args) {
        ResolutionSelectorFrame frame = new ResolutionSelectorFrame();
        frame.setBounds(0, 0, 350, 230);
        frame.setVisible(true);
    }
}

// Clase del formulario (no pública)
class ResolutionSelectorFrame extends JFrame implements ChangeListener {
    private JRadioButton radio640x480, radio800x600, radio1024x768;
    private ButtonGroup group;

    public ResolutionSelectorFrame() {
        setTitle("Selector de Resolución");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        group = new ButtonGroup();

        radio640x480 = new JRadioButton("640×480");
        radio640x480.setBounds(10, 20, 100, 30);
        radio640x480.addChangeListener(this);
        add(radio640x480);
        group.add(radio640x480);

        radio800x600 = new JRadioButton("800×600");
        radio800x600.setBounds(10, 70, 100, 30);
        radio800x600.addChangeListener(this);
        add(radio800x600);
        group.add(radio800x600);

        radio1024x768 = new JRadioButton("1024×768");
        radio1024x768.setBounds(10, 120, 100, 30);
        radio1024x768.addChangeListener(this);
        add(radio1024x768);
        group.add(radio1024x768);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (radio640x480.isSelected()) {
            setSize(640, 480);
        } else if (radio800x600.isSelected()) {
            setSize(800, 600);
        } else if (radio1024x768.isSelected()) {
            setSize(1024, 768);
        }
    }
}
