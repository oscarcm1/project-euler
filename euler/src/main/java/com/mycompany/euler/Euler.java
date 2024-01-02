/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.euler;

/**
 *
 * @author oscarcm1
 *
 * Problem 1
 */
public class Euler {

    public static void main(String[] args) {

        problema1(3, 5, 1000);

    }

    public static int problema1(int mul1, int mul2, int longitud) {

        int answer = 0;

        for (int i = 0; i < longitud; i++) {

            if (i % mul1 == 0 || i % mul2 == 0) {
                answer += i;
            }
        }

        System.out.println("El resultado es: " + answer);
        return answer;
    }

}
