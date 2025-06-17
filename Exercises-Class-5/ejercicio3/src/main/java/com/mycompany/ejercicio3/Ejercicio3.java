package com.mycompany.ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {
    private Scanner teclado;
    private float[] turnoMan;
    private float[] turnoTar;
    public void cargar() {
        teclado=new Scanner(System.in);
        turnoMan=new float[4];
        turnoTar=new float[4];
        System.out.println("Sueldos de empleados del turno de la mañana.");
        for(int f=0;f<4;f++) {
            System.out.print("Ingrese sueldo: ");
            turnoMan[f]=teclado.nextFloat();
        }
        System.out.println("Sueldos de empleados del turno de la tarde.");
        for(int f=0;f<4;f++) {
            System.out.print("Ingrese sueldo: ");
            turnoTar[f]=teclado.nextFloat();
        }
    }
    public void calcularGastos() {
        float Salario_man=0;
        float Salario_tar=0;
        for(int f=0;f<4;f++){
            Salario_man=Salario_man+turnoMan[f];
            Salario_tar=Salario_tar+turnoTar[f];
        }
        System.out.println("Total de gastos del turno de la mañana: "+Salario_man);
        System.out.println("Total de gastos del turno de la tarde: "+Salario_tar);
    }
    public static void main(String[] args) {
        Ejercicio3 llamar=new Ejercicio3();
        llamar.cargar();
        llamar.calcularGastos();
    }
}