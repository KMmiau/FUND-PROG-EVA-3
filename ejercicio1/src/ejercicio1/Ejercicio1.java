
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int num, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba 2 numeros enteros positivos, el primero tiene que ser mas pequeño o no se imprimira nada");
        num = input.nextInt();
        System.out.println("numero 2");
        num2 = input.nextInt();
        
        for (int i = num; i <= num2; i++) {
            if(num < 0){
                System.out.println("numero negativo no permitido");
                break;
            }
            if(num2 < 0){
                System.out.println("numero negativo no permitido");
                break;
            }
            System.out.print(i + " - ");
        }
    }
    
}
