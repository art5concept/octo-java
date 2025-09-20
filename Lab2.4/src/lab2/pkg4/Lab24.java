/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// PROGRAMA QUE IMPRIME LOS IMPARES DEL 1 AL 100 do while
package lab2.pkg4;

/**
 *
 * @author felix
 */
public class Lab24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// usamos un contador para contar en que ciclo vamos
        int i = 0;
        do {
// imprimimos usando la formula para los impares
            System.out.println(i * 2 + 1);
//sumamos al contador 1
            i++;
//se evalua condicion para verificar si se debe repetir el ciclo
        } while (i < 50);
    }

}
