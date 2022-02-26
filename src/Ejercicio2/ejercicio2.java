/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre 
por pantalla
 */
package Ejercicio2;

import java.util.Scanner;

public class ejercicio2 {

     public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba su nombre");
        String nombre = leer.next();
        System.out.println("Su nombre es " + nombre);
    }
    
}
