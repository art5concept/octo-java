/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1.pkg3;

import java.util.Scanner;

/**
 *
 * @author felix
 */
public class Lab13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Definicion de variables y datos necesarios para el programa
        float puntaje_final = 0;
        float puntaje = 0;
        int numero_notas = 4;
        float nota_minima[] = {91, 81, 71, 61, 0};
        char letra[] = {'A', 'B', 'C', 'D', 'F'};
        boolean texto[] = {true, true, true, false, false};
// Iniciar metodo Scanner
        Scanner read = new Scanner(System.in);
        System.out.printf("Introduce %d notas para calcular tu promedio\n", numero_notas);
// Creacion de variable global i para poder usarla nuevamente en 2 ciclos
        int i = 0;
// Ciclo para introducir las notas
        for (i = 0; i < numero_notas; i++) {
            puntaje = read.nextFloat();
// Condicion para evitar poner notas fuera de rango
            if (puntaje > 100 || puntaje < 0) {
                System.out.println("Nota no valida ingresala nuevamente");
                i--;
            } else {
                puntaje_final += puntaje;

            }

        }
// Calculo del promedio final
        puntaje_final /= i;

//  Ciclo para determinar la nota (letra) y mensaje
        for (i = 0; i < nota_minima.length; i++) {

            if (puntaje_final >= nota_minima[i]) {
                break;
            }

        }
//  Uso del operador ternario para determinar en si debe decir aprobado o reprobado
        System.out.printf("%c, %s\n", letra[i], texto[i] ? "Aprobado" : "Reprobado");

    }
}
