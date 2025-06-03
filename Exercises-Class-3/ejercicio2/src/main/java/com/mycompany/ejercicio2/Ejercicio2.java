/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio2;

import java.util.*;

public class Ejercicio2 {

    public static final double PORCENTAJE_CCSS = 8.0;
    public static final double PORCENTAJE_BANCO_POPULAR = 1.0;

    public static double calcularDeduccionCCSS(double salarioBruto) {
        return salarioBruto * (PORCENTAJE_CCSS / 100.0);
    }

    public static double calcularDeduccionBancoPopular(double salarioBruto) {
        return salarioBruto * (PORCENTAJE_BANCO_POPULAR / 100.0);
    }

    public static double calcularTotalDeducciones(double deduccionCCSS, double deduccionBancoPopular) {
        return deduccionCCSS + deduccionBancoPopular;
    }

    public static double calcularSalarioNeto(double salarioBruto, double totalDeducciones) {
        return salarioBruto - totalDeducciones;
    }

    public static boolean esSalarioValido(double salario) {
        return salario > 0;
    }

    public static String leerNombreEmpleado(Scanner scanner) {
        String nombre;
        do {
            System.out.print("Ingrese el nombre del empleado: ");
            nombre = scanner.nextLine().trim();

            if (nombre.isEmpty()) {
                System.out.println("Error: El nombre no puede estar vacío. Intente nuevamente.");
            }
        } while (nombre.isEmpty());

        return nombre;
    }

    public static double leerSalarioMensual(Scanner scanner) {
        double salario;
        String entrada;

        do {
            System.out.print("Ingrese el salario mensual (los '.' son decimales): ₡");
            entrada = scanner.nextLine();
            entrada = entrada.replace(" ", "");
            entrada = entrada.replace(",", "");

            try {
                salario = Double.parseDouble(entrada);
                System.out.println("Salario ingresado: ₡" + salario);

                if (!esSalarioValido(salario)) {
                    System.out.println("Error: El salario debe ser mayor a 0. Intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido. Intente nuevamente.");
                salario = -1;
            }

        } while (!esSalarioValido(salario));

        return salario;
    }

    public static void mostrarDesgloseSalario(String nombreEmpleado, double salarioBruto,
            double deduccionCCSS, double deduccionBancoPopular,
            double totalDeducciones, double salarioNeto) {

        System.out.println("\n" + "=".repeat(50));
        System.out.println("         DESGLOSE DE SALARIO MENSUAL");
        System.out.println("=".repeat(50));
        System.out.println(nombreEmpleado);
        System.out.println("En este mes su salario se desglosa de la siguiente manera:");
        System.out.println();

        System.out.printf("%-35s ₡%,10.2f%n", "Salario mensual", salarioBruto);
        System.out.printf("%-35s ₡%,10.2f%n", "Salario bruto (sin deducciones)", salarioBruto);

        System.out.println("-".repeat(50));
        System.out.println("DEDUCCIONES:");
        System.out.printf("%-35s ₡%,10.2f%n",
                String.format("%.0f%% deducciones de CCSS", PORCENTAJE_CCSS),
                deduccionCCSS);
        System.out.printf("%-35s ₡%,10.2f%n",
                String.format("%.0f%% deducciones de Banco Popular", PORCENTAJE_BANCO_POPULAR),
                deduccionBancoPopular);

        System.out.println("-".repeat(50));
        System.out.printf("%-35s ₡%,10.2f%n", "Total de deducciones", totalDeducciones);
        System.out.println("=".repeat(50));
        System.out.printf("%-35s ₡%,10.2f%n", "Salario Neto", salarioNeto);
        System.out.println("=".repeat(50));

        double porcentajeDeduccionTotal = (totalDeducciones / salarioBruto) * 100;
        System.out.printf("%nRESUMEN:%n");
        System.out.printf("- Porcentaje total de deducciones: %.1f%%%n", porcentajeDeduccionTotal);
        System.out.printf("- Dinero que recibe efectivamente: ₡%,.2f%n", salarioNeto);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=".repeat(60));
        System.out.println("    CALCULADORA DE SALARIO Y DEDUCCIONES");
        System.out.println("=".repeat(60));
        System.out.println("Deducciones aplicadas:");
        System.out.println("• " + PORCENTAJE_CCSS + "% CCSS (Caja Costarricense de Seguro Social)");
        System.out.println("• " + PORCENTAJE_BANCO_POPULAR + "% Banco Popular");
        System.out.println("=".repeat(60));

        String nombreEmpleado = leerNombreEmpleado(scanner);
        double salarioBruto = leerSalarioMensual(scanner);

        double deduccionCCSS = calcularDeduccionCCSS(salarioBruto);
        double deduccionBancoPopular = calcularDeduccionBancoPopular(salarioBruto);
        double totalDeducciones = calcularTotalDeducciones(deduccionCCSS, deduccionBancoPopular);
        double salarioNeto = calcularSalarioNeto(salarioBruto, totalDeducciones);

        mostrarDesgloseSalario(nombreEmpleado, salarioBruto, deduccionCCSS,
                deduccionBancoPopular, totalDeducciones, salarioNeto);

        System.out.println("\n¡Gracias por usar la Calculadora de Salario!");

        scanner.close();
    }
}
