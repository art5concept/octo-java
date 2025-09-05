/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1.pkg4;

// importar clase para leer el teclado
import java.util.Scanner;
// importar clase para excepciones
import java.util.InputMismatchException;

/**
 *
 * @author felix
 */
public class Lab14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Mensaje para explicar el uso del programa
        System.out.println("Introduce un numero del 1 al 5 para ganar un premio de la ferreteria");
// Inicia metodo para leer entrada del teclado
        Scanner read = new Scanner(System.in);
// Estructura de manejo de errores y excepciones
        try {
// Definicion de variable y lectura de la misma
            int opcion = read.nextInt();

// Inicion de estructura de decision "switch case"
                switch (opcion) {
                    case 1:
                        System.out.println("Ganaste un saco de cemento");
                        // Importante se debe colocar el break para no imprimir en cascada
                        break;
                    case 2:
                        System.out.println("Ganaste 10.00 en mercancia");
                        break;
                    case 3:
                        System.out.println("Ganaste 20 bloques");
                        break;
                    case 4:
                        System.out.println("Ganaste un galón de pintura");
                        break;
                    case 5:
                        System.out.println("Ganaste un 5% de descuento en tu compra");
                        break;
                    // Control de casos fuera de rango
                    default:
                        System.out.println("El numero que introduciste esta fuera del rango 1 a 5, perdiste tu premio.");

            }
        } catch (InputMismatchException e) {
            System.out.println("Error: El dato entrado no es un entero, perdiste tu premio");
            read.next();
        } finally {
            read.close();
        }
        System.out.println("----------------------");
        System.out.println("Gracias por Participar");
//==================================
//OTRA FORMA DE HACER SWITCH EN JAVA
//==================================
//        switch (opcion) {
//            case 1 -> System.out.println("Ganaste un saco de cemento");
//            case 2 -> System.out.println("Ganaste 10.00 en mercancia");
//            case 3 -> System.out.println("Ganaste 20 bloques");
//            case 4 -> System.out.println("Ganaste un galón de pintura");
//            case 5 -> System.out.println("Ganaste un 5% de descuento en tu compra");
//            default -> {
//                System.out.println("El numero que introduciste esta fuera del rango 1 a 5, perdiste tu premio.");
//                System.out.println("Gracias por Participar");
//            }
//        }
    }

}
