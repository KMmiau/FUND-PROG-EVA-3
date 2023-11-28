
package eva3_7_paso_referencia;

public class EVA3_7_PASO_REFERENCIA {

   public static void main(String[] args) {
      // TODO code application logic here
      int[] arreglo = new int[10];
      System.out.println("El valor en el arreglo main " + arreglo);
      llenarArreglo(arreglo);
      for (int i = 0; i < arreglo.length; i++) {
         System.out.print("[" + arreglo[i] + "]");
         
      }
   }
   
   public static void llenarArreglo(int[] valores){
      System.out.println("el valor del arreglo en llenarArreglo es " + valores);
      for (int i = 0; i < valores.length; i++) {
         valores[i] = (int)(Math.random() * 100);
      }
   }
}
