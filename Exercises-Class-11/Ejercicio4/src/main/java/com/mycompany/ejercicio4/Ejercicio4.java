/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio4;

import javax.swing.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Password Field Example");
        JPasswordField value = new JPasswordField();
        JLabel l1 = new JLabel("Password:");
        l1.setBounds(20, 100, 80, 30);
        value.setBounds(100, 100, 100, 30);
        f.add(value); f.add(l1);
        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
