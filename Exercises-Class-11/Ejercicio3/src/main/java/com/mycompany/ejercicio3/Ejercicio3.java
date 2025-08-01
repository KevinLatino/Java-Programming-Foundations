/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

import java.awt.*;
import javax.swing.*;

public class Ejercicio3 {
    private static void createAndShow() {
        final JFrame frame = new JFrame("JSplitPane Example");
        frame.setSize(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setLayout(new FlowLayout());

        String[] option1 = {"A", "B", "C", "D", "E"};
        JComboBox box1 = new JComboBox(option1);

        String[] option2 = {"1", "2", "3", "4", "5"};
        JComboBox box2 = new JComboBox(option2);

        Panel panel1 = new Panel();
        panel1.add(box1);

        Panel panel2 = new Panel();
        panel2.add(box2);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);
        frame.getContentPane().add(splitPane);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShow();
            }
        });
    }
}