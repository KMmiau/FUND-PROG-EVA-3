
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba 1 numero entero positivo");
        num = input.nextInt();

            if(num > 0){
                while(num > 0){
                    System.out.print((num % 2));
                    num /= 2;
                
            }
        }
    }
}
