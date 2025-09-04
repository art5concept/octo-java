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
// se definen 2 variables que se compararan
        int next, min;

        Scanner read = new Scanner(System.in);
        System.out.println("Introduce 3 numeros");

// se lee la primera variable
        min = read.nextInt();

// se crea un ciclo para poder generalizar la cantidad de numeros a comparar
        for (int i = 0; i < 2; i++) {

// se lee el siguiente numero
            next = read.nextInt();

// se comparan y si resulta que el siguiente es igual o menor se actualiza el nuevo menor
            if (next < min) {

                min = next;

            }

        }
// se imprime el numero menor de todos los ingresados
        System.out.printf("El menor es: %d\n", min);
    }
}
