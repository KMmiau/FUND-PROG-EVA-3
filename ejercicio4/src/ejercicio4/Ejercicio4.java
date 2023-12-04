
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int num, sino = 2;
        Scanner input = new Scanner(System.in);
    
        
        do{
        System.out.println("Escriba un numero");
        num = input.nextInt();
        if(num > 0)
                System.out.println("Es positivo");
        else if(num == 0)
                System.out.println("Es cero");
        else
                System.out.println("es negativo");
        System.out.println("quieres terminar el programa?");
            System.out.println("si = 1");
            System.out.println("no = 2");
            sino = input.nextInt();
        }while(sino == 2);
        
    }
    
}
