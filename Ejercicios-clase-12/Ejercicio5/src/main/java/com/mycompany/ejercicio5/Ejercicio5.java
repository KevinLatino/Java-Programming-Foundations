/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Ejercicio5 {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(new File("datos.txt"));
            bw = new BufferedWriter(fw);
            bw.write("Linea 1");
            bw.newLine();
            bw.write("Linea 2");
        } catch (IOException ex) {
            System.out.println("Problemas en la creacion del archivo");
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) { 
                 System.out.println(ex.getMessage());    
            }
        }
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(new File("datos.txt"));
            br = new BufferedReader(fr);
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
        } catch (IOException ex) {
            System.out.println("Problemas en la lectura del archivo");
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                  System.out.println(ex.getMessage()); 
            }
        }
    }
}       
