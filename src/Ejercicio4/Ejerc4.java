/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)
 */
package Ejercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Ejerc4 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese la temperatura en grados centígrados: ");
        double grados=leer.nextDouble();
        double fahrenheit=(32+(9*grados)/5);
        System.out.println("La temperatura en grados fahrenheit es "+ fahrenheit);
    }
    
}
