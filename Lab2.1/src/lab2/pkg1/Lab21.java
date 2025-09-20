/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// PROGRAMA QUE DETERMINA de 6 NUMEROS CUALES SON PARES E IMPARES USANDO while
package lab2.pkg1;

// importar clase para poder leer del teclado
import java.util.Scanner;


/**
 *
 * @author felix
 */
public class Lab21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// se crea una matriz de 6 x 3 para guardar los numeros
        int[][] numeros = new int[6][3];
// se inicializan los indices para las variables que recorreran la matriz i y j
        int i = 0;
        int j = 0;

        System.out.println("Ingresa 6 numeros");

        Scanner read = new Scanner(System.in);
// se anidan dos ciclos while para recorrer la matriz
        while (j < numeros[0].length) {

            while (i < numeros.length) {

// se hace la estructura del  descisiones condicionales con if else
                if (j == 0) {
// en esta fila 0 añadimos los numeros a la matriz
                    numeros[i][j] = read.nextInt();
                } else if (j == 1) {

// en esta fila 1 guardamos la paridad del la fila 0

                    if (numeros[i][j - 1] % 2 == 0) {
// analizamos la pariedad de los numeros de la fila anterior
                        numeros[i][j] = 1;
                    }

// en esta fila 2 guardamos l suma y cantidad de numeros pares he impares
                } else if (j == 2) {
                    if (numeros[i][j - 1] == 1) {
//cuando sea par sumamos y contamos los numeros y se guarda la suma en el indice 0,2 y el conteo en el 1,2
                        numeros[0][j] += numeros[i][0];
                        numeros[1][j]++;
                    } else {
// cuando sea par sumamos y contamos los numeros y se guarda la suma en el indice 2,2 y el conteo en el 3,2
                        numeros[2][j] += numeros[i][0];
                        numeros[3][j]++;
                    }
                }
            i++;
            }
            i = 0;
            j++;
        }

// Se imprimen los resultados
        System.out.println("++++++++++");

        System.out.printf("La suma de los   pares es:%d y el numero de numeros    pares es:%d \n", numeros[0][2], numeros[1][2]);
        System.out.printf("La suma de los impares es:%d y el numero de numeros impares es:%d \n", numeros[2][2], numeros[3][2]);

    }

}
