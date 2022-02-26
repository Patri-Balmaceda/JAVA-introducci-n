/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma.
 */
package Ejercicio1;

import java.util.Locale;  // no olvidar importar los archivos!!
import java.util.Scanner;
public class Ejercicio1 {

     public static void main(String[] args) {
        //definir Scanner
        Scanner leer = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         
        System.out.println("ingrese un número");
        //int es el tipo de dato para los nros enteros
        int entero = leer.nextInt(); //asigno valor a la vble leer
        System.out.println("ingrese otro número");
        int entero2 = leer.nextInt();
        System.out.println("La suma de los números es " + (entero + entero2));
    }
    
}
