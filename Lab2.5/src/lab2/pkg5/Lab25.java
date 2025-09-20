/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// PROGRAMA QUE MUESTRA PARES E IMPARES ENTRE EL 1 Y 50
package lab2.pkg5;

/**
 *
 * @author felix
 */
public class Lab25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// se imprime un titulo para diferenciar cual es impar y cual es par
        System.out.println("Los numeros pares son:");
// se inicia un contador en 1 para poder usar el while
        int i = 1;
// se verifica si se comple la condicion del while primero
        while (i < 26) {
// se imprimen los digitos pares usando operaciones bit a bit corriendo un bit a la derecha
// los bits para hacer multiplicacion por 2
// a cualquier numero binario 
            System.out.println(i << 1);
            i++;
        }

        System.out.println("Los numeros impares son");
// ciclo para los numeros impares
        i = 0;
        while (i < 25) {
// se imprimen los impares usando operaciones bit a bit primero corriendo un bit para multiplicar por dos y sumando 1
            System.out.println((i << 1 | 1));
            i++;
        }

//        jugando con operaciones bit a bit  para obtener el mismo resultado
//        System.out.println("Los numeros pares son:");
//        i = 0;
//
//        while (i < (1 << 4) + (1 << 3) - ~0) {
//            System.out.println((i | 1) << 1);
//            i++;
//        }

    }

}
