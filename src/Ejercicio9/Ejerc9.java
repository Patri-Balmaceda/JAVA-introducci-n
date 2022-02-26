/*
 Realizar un programa que solo permita introducir frases o palabras de 8 de 
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función length() en Java
 */
package Ejercicio9;
import java.util.Locale;
import java.util.Scanner;

public class Ejerc9 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese una frase");
        String frase=leer.next();
        if (frase.length()==8) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
