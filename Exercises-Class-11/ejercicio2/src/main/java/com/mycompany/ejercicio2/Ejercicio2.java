/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author aleja
 */
public class Ejercicio2 {
    JFrame myFrame = null;
    
    private void test() {
        myFrame = new JFrame("JEditorPane Test");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setSize(400, 200);
        
        JEditorPane myPane = new JEditorPane();
        myPane.setContentType("text/plain");
        myPane.setText("Sleeping is necessary for a healthy body. " +
                      "But sleeping in unnecessary times may spoil our health, wealth and studies. " +
                      "Doctors advise that the sleeping at improper timings may lead for obesity during the students days.");
        
        myPane.setEditable(false);
        
        JScrollPane scrollPane = new JScrollPane(myPane);
        

        myFrame.setContentPane(scrollPane);
        myFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new Ejercicio2().test();
    }
}
