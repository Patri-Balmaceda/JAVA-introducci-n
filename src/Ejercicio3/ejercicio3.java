/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
después toda en minúsculas. Nota: investigar la función toUpperCase() y 
toLowerCase() en Java.
 */
package Ejercicio3;
import java.util.Locale;
import java.util.Scanner;
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese una frase: ");
        
        String frase = leer.next();
        
        System.out.println("La frase en mayúsculas es : " + frase.toUpperCase());
        System.out.println("La frase en minúsculas es : " + frase.toLowerCase());
        
    }
    
}
