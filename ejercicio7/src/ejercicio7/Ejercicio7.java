
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        int num, numMayor, numMenor;
        numMayor = 0; numMenor = 0;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("introduce un numero");
            num = input.nextInt();
            if(num <= numMenor)
                numMenor = num;
            if(num > numMayor)
                numMayor = num;
        }while(num >= 0);
        System.out.println("Numero mas grande: " + numMayor);
        System.out.println("Numero mas pequeño: " + numMenor);
    }
    
}
