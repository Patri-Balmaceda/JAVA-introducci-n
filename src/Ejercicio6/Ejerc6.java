/*
Implementar un programa que dado dos números enteros determine cuál es el 
mayor y lo muestre por pantalla.
 */
package Ejercicio6;
import java.util.Locale;
import java.util.Scanner;

public class Ejerc6 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("ingrese el primer número");
        int num1=leer.nextInt();
        System.out.println("ingrese el segundo número");
        int num2=leer.nextInt();
        if (num1>num2){
            System.out.println("El mayor de ambos números es: "+ num1);
        }else if(num1<num2){
            System.out.println("El mayor de ambos números es: "+ num2);
        }else{
            System.out.println("Los números son iguales.");
        }
    }
    
}
