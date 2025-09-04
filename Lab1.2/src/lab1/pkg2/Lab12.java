/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1.pkg2;

import java.util.Scanner;

/**
 *
 * @author felix
 */
public class Lab12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, min;

        Scanner read = new Scanner(System.in);
        System.out.println("Introduce 3 numeros");

        min = read.nextInt();
        num1 = read.nextInt();

        if (num1 > min) {
            num1 = read.nextInt();
        } else {
            min = num1;
            num1 = read.nextInt();
        }

        if (num1 > min) {
            System.out.printf("El menor es: %d\n", min);
        } else {
            min = num1;
            System.out.printf("El menor es: %d\n", min);
        }
    }
}
