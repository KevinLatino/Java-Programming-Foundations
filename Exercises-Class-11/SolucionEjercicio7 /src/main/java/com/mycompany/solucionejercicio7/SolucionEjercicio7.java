/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solucionejercicio7;
import javax.swing.*;
public class SolucionEjercicio7 {
    JFrame f;
    SolucionEjercicio7() {
       f=new JFrame(); 
       String data[][]={ {"119720361", "Valeria", "900000"},
                         {"119392831", "Erick", "934000"},
                         {"113330361", "Amalia", "10000000"} };
        String column[]={"Cedula","Nombre","Salario"};
        JTable jt=new JTable(data,column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
       new SolucionEjercicio7();
    }
}
