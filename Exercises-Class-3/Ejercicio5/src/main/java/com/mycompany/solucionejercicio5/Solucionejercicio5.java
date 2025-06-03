/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.solucionejercicio5;
import java.util.Scanner;
public class Solucionejercicio5 {
    public static double calculoArea (double radio, double altura) {
        double perimetro = 2 * Math.PI * radio;
        double arealateral = perimetro * altura;
        double areabase = 2 * Math.PI * radio * radio;
        double areatotal = arealateral + areabase;
        return areatotal;
    }
    public static double calculoVolumen(double radio, double altura) {
        double areabase = Math.PI * radio * radio;
        double volumen = areabase * altura;
        return volumen;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio del clindro: ");
        double radio = scanner.nextDouble();
        System.out.println("Ingrese la altura del clindro: ");
        double altura = scanner.nextDouble();
        
        double area = calculoArea(radio, altura);
        double volumen = calculoVolumen(radio, altura);
        
        System.out.println("Área del cilindro: " + area);
        System.out.println("Volumen del cilindro: " + volumen);
    }
}
