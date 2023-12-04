
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int num;
        String salida = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba 1 numero entero positivo");
        num = input.nextInt();

            if(num > 0){
                while(num > 0){
                    salida = (num % 2) + salida;

                    num /= 2;
                
            }
        System.out.print(salida);
        }
    }
}
