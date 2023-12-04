
package ejercicio.pkg10;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        String cadena;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce texto y/o numeros, se detectaran todos los numeros escritos");
        cadena = input.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
           if(cadena.charAt(i) == '0' || cadena.charAt(i) == '1' || cadena.charAt(i) == '2' || cadena.charAt(i) == '3' || cadena.charAt(i) == '4')
            System.out.print(cadena.charAt(i) + " - ");
           if(cadena.charAt(i) == '5' || cadena.charAt(i) == '6' || cadena.charAt(i) == '7' || cadena.charAt(i) == '8' || cadena.charAt(i) == '9')
            System.out.print(cadena.charAt(i) + " - ");
        }
    }
    
}
