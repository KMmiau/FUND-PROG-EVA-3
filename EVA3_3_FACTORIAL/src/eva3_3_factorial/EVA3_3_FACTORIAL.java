
package eva3_3_factorial;

public class EVA3_3_FACTORIAL {

    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 5;
        int factorial = calcularFactorial(numero);
        System.out.println("el factorial de 5 = " + factorial);
        
        int Ubase = 2;
        int Uexp = 3;
        int potencia = calcularPotencia(Ubase, Uexp);
        System.out.println("2 a la potencia 3 es = " + calcularPotencia(2, 3));
        System.out.println("5 a la potencia 5 es = " + calcularPotencia(5, 5));
    }
    
    public static int calcularFactorial(int num){
        //factorial de 5: 1 x 2 x 3 x 4 x 5 = 120
        //usar ciclos
        //regresar el valor calculado
        int resu = 1;
        for (int i = 1; i <= num; i++) {
            resu *= i; //resu = resu * i;
        }
        return resu;
    }
    
    //crear una funcion que calcule potencia de un numero entero
    public static int calcularPotencia(int base, int exp){
        int baseOriginal = base;
        for (int i = 1; i < exp; i++) {
            base *= baseOriginal;
        }
        return base;
    }
}
