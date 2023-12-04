
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        String letra;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("escribe una letra o espacio");
            letra = input.nextLine();
            switch(letra){
                case("a"):
                    System.out.println("es una vocal");
                    break;
                case("e"):
                    System.out.println("es una vocal");
                    break;
                case("i"):
                    System.out.println("es una vocal");
                    break;
                case("o"):
                    System.out.println("es una vocal");
                    break;
                case("u"):
                    System.out.println("es una vocal");
                    break;
                default:
                    System.out.println("no es una vocal");
            }
                
        }while(!" ".equals(letra));
    }
    
}
