/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla 
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función 
Math.sqrt()
 */
package Ejercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Ejerc5 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese un número entero");
        int num=leer.nextInt();
        System.out.println("El doble de "+num+ " es " + (num*2));
        System.out.println("El triple de "+num+ " es " + (num*3));
        System.out.println("La raíz cuadrada de "+num+ " es " +Math.sqrt(num));
    }
    
}
