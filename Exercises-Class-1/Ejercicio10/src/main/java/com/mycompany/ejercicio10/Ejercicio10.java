package com.mycompany.ejercicio10;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String word;
        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;
        int totalVowels = 0;

        System.out.print("Ingrese una palabra o frase: ");
        word = read.nextLine();

        // Convertir a minúsculas para no distinguir entre mayúsculas y minúsculas
        word = word.toLowerCase();

        // Recorrer cada caracter de la palabra
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            switch (letter) {
                case 'a' -> {
                    aCount++;
                    totalVowels++;
                }
                case 'e' -> {
                    eCount++;
                    totalVowels++;
                }
                case 'i' -> {
                    iCount++;
                    totalVowels++;
                }
                case 'o' -> {
                    oCount++;
                    totalVowels++;
                }
                case 'u' -> {
                    uCount++;
                    totalVowels++;
                }
            }
        }

        // Mostrar el resultado
        System.out.println("Total de vocales: " + totalVowels);
        System.out.println("a: " + aCount);
        System.out.println("e: " + eCount);
        System.out.println("i: " + iCount);
        System.out.println("o: " + oCount);
        System.out.println("u: " + uCount);
    }
}