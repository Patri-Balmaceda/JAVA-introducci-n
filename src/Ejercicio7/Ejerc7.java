/*
 Crear un programa que dado un número determine si es par o impar.
 */
package Ejercicio7;
import java.util.Locale;
import java.util.Scanner;

public class Ejerc7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese un número");
        int num = leer.nextInt();
        if (num == 0) {
            System.out.println("el número es cero");
        } else if (num % 2 == 0) {
            System.out.println("el número es par");
        } else {
            System.out.println("el número es impar");
        }
    }
}