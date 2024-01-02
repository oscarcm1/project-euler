/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.euler;

/**
 *
 * @author oscarcm1 Problem 2
 */
public class Euler {

    public static void main(String[] args) {
        fibonacci(5000000);
    }

    public static void fibonacci(int limite) {

        int[] listfibonacci = new int[100];
        int a = 0;

        listfibonacci[0] = 1;
        listfibonacci[1] = 2;

        for (int i = 2; i < 35; i++) {
            listfibonacci[i] = listfibonacci[i - 1] + listfibonacci[i - 2];
            
            if (listfibonacci[i - 1] % 2 == 0) {
                a += listfibonacci[i - 1];
                if (a >= limite) {
                    break;
                }
            }

        }
        System.out.println("La respuesta es: " + a);

    }
}
