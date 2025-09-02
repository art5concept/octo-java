/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1java;
import java.util.Scanner;

/**
 *
 * @author felix
 */
public class Ejemplo1java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota1,nota2,nota3,val,prom;
        Scanner leer=new Scanner (System.in);
        System.out.println("Introduzca nota 1:");
        nota1=leer.nextFloat();
        System.out.println("Introduzca nota 2:");
        nota2=leer.nextFloat();
        System.out.println("Introduzca nota 3:");
        nota3=leer.nextFloat();
        val=nota1+nota2+nota3;
        prom=val/3;
        System.out.printf("El promedio de las notas es: %.2f\n", prom);
        // TODO code application logic here
    }
    
}
