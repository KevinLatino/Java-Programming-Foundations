
package com.mycompany.ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nombres = new String[5];
        int[] edades = new int[5];
        
        System.out.println("=== REGISTRO DE PERSONAS ===");
        System.out.println("Ingrese los datos de 5 personas:\n");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Persona " + (i + 1) + ":");
            
            System.out.print("Nombre: ");
            nombres[i] = scanner.nextLine();
            
            System.out.print("Edad: ");
            edades[i] = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println(); 
        }
        
        System.out.println("=== PERSONAS MAYORES DE EDAD (18 años o más) ===");
        
        boolean hayMayores = false;
        
        for (int i = 0; i < 5; i++) {
            if (edades[i] >= 18) {
                System.out.println("- " + nombres[i] + " (" + edades[i] + " años)");
                hayMayores = true;
            }
        }
        
        if (!hayMayores) {
            System.out.println("No hay personas mayores de edad en la lista.");
        }
        
        scanner.close();
    }
}