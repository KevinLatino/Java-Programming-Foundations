/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formulario;
import javax.swing.*;
public class Formulario extends JFrame {
    private JTextField textfield;
    private JScrollPane scrollpanel;
    private JTextArea textareal;
    public Formulario()  {
        setLayout(null);
        textfield=new JTextField();
        textfield.setBounds(10,10,200,30);
        add(textfield);
        textareal=new JTextArea();
        scrollpanel=new JScrollPane(textareal);
        scrollpanel.setBounds(10,50,400,300);
        add(scrollpanel);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        Formulario formulario1=new Formulario();
        formulario1.setBounds(0,0,540,400);
        formulario1.setVisible(true);
    }
}
