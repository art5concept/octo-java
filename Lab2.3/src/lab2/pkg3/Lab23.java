/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// PROGRAMA DE CALCULO DEL PROMEDIO DE UNA n NOTAS
package lab2.pkg3;

// importar clase para poder leer del teclado
import java.util.Scanner;

/**
 *
 * @author felix
 */
public class Lab23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// se crea el objeto read como instancia de scanner system.in
        Scanner read = new Scanner(System.in);
// se imprime un mensaje en pantalla
        System.out.println("Ingresa el numero de notas a las que les sacaras el promedio");
// se lee el numero de notas que se van a ingresar
        int n = read.nextInt();
// se crea un array del tamaño de notas que se van a ingresar
        float[] notas = new float[n];
        int i = 0;
// se inicia el clico while para recorrer el array y se usa el metodo length para conocer el tamaño del array
        while (i < notas.length) {
// mensaje de seguimiento para ingresar una nota
            System.out.printf("Ingresa nota :%d\n", i + 1);
            if (i == 0) {
// se lee y guarda la primera nota
                notas[i] = read.nextFloat();
            } else {
// para las siguientes notas se suma nota en la posicion anterior y se suma el nuevo valor introducido
                notas[i] = notas[i - 1] + read.nextFloat();
            }

            i++;
        }
// finalmente se imprimen el promedio de las notas dividiendo la suma de las notas entre el total de notas
        System.out.printf("El promedio de las notas es: %.2f\n", notas[notas.length - 1] / notas.length);
    }

}
