/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio8;

/**
 *
 * @author aleja
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        int[][] numeros = {{1,2,3,4}, {5,6,7}};
        for (int i = 0; i < numeros.length; ++i){
            for(int j = 0; j < numeros[i].length; ++j){
                System.out.println(numeros[i][j]);
            }
        }
    }
}
