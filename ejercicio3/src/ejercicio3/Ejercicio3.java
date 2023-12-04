
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        int num, num2, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("escriba 1 numero para sumar todos los numeros entre ese numero y 1");
        num2 = input.nextInt();
        for (int i = 1; i <= num2; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
    
}
