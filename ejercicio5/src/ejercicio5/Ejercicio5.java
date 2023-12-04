
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int num, numori, num2, exp = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba 2 numeros enteros positivos, primero la base");
        num = input.nextInt();
        System.out.println("exponente");
        num2 = input.nextInt();
        numori = num;
        for (int i = 0; i < (num2 - 1); i++) {
            if(num < 0){
                System.out.println("numero negativo no permitido");
                break;
            }
            if(num2 < 0){
                System.out.println("numero negativo no permitido");
                break;
            }
            num *= numori;
        }
        System.out.println(num);
    }
    
}
