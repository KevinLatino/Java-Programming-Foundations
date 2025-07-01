/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosoluciondiez;
import javax.swing.*;

public class EjercicioSolucionDiez extends JFrame {
    private ImageIcon imagen = new ImageIcon("laimagen.png");
    private JLabel label1 = new JLabel(imagen);

    public EjercicioSolucionDiez() {
        setTitle("Muestra de Imagen en Java...");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().add(label1);
    }

    public static void main(String[] args) {
        EjercicioSolucionDiez p = new EjercicioSolucionDiez();
        p.setVisible(true);
    }
}