/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1.pkg1;
import java.util.Scanner;

/**
 *
 * @author felix
 */
public class Lab11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float art1,art2,art3,art4,art5,subtotal;
        final float ITBMS,DESC;
        Scanner r=new Scanner (System.in);
        ITBMS = (float) 0.07;
        DESC = 0.3f;
        System.out.println("Introduce el precio de 5 articulos");
        art1=r.nextFloat();
        art2=r.nextFloat();
        art3=r.nextFloat();
        art4=r.nextFloat();
        art5=r.nextFloat();
        subtotal=art1+art2+art3+art4+art5;
        System.out.printf("El subtotal sin descuento es: $%.2f\n", subtotal);
        subtotal-=subtotal*DESC;
        System.out.printf("El subtotal con descuento del %.0f%% es: $%.2f\n", DESC * 100, subtotal);
        subtotal+=subtotal*ITBMS;
        System.out.printf("El total con descuento y agregando el impuesto del 7%% es: $%.2f\n", subtotal);
    }
    
}
