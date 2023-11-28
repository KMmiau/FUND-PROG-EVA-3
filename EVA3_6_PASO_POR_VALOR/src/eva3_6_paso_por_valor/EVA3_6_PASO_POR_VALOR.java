
package eva3_6_paso_por_valor;

public class EVA3_6_PASO_POR_VALOR {

   public static void main(String[] args) {
      // TODO code application logic here
      int x = 10;
      System.out.println("el valor de x en el main es " + x);
      sumarValor(x);
      System.out.println("el valor de x despues de llamar a sumarValor es " + x);
   }
   public static void sumarValor(int valor){
      System.out.println("El valor recibido en sumarValor es " + valor);
      valor++;
      System.out.println("el valor modificado es " + valor);
      
   }
   
}
