
package ejercicio.pkg9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        String cadena;
        String aparicion;
        int repe = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("introduce una cadena de texto");
        cadena = input.nextLine();
        System.out.println("que letra quieres revisar cuantas veces aparecio? (solo se usara la primera letra introducida)");
        aparicion = input.nextLine();
        System.out.println("letra elegida: " + aparicion.charAt(0));
        for (int i = 0; i < cadena.length(); i++) {
          if(cadena.charAt(i) == aparicion.charAt(0))
             ++repe;
       }
        System.out.println("la letra " + aparicion.charAt(0) + " aparece " + repe + " veces");
        
    }
    
}
