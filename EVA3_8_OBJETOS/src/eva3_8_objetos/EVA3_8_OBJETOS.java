
package eva3_8_objetos;

public class EVA3_8_OBJETOS {

   public static void main(String[] args) {
      // TODO code application logic here
      Persona perso1 = new Persona();
      //Scanner input = new Scanner(System.in);
      //int[] arreglo = new int[5];
      System.out.println(perso1);
      perso1.nombre = "Juan";
      perso1.apellido = "Perez";
      perso1.edad = 50;
      System.out.println(perso1);
      imprimirPersonas(perso1);
      
      Persona perso2 = new Persona();
      perso2.nombre = "Pedro";
      perso2.apellido = "Paramo";
      perso2.edad = 70;
      System.out.println(perso2);
      imprimirPersonas(perso2);
   }
   public static void imprimirPersonas(Persona perso){
      System.out.println("Direccion " + perso);
      System.out.println("Nombre completo " + perso.nombre + " " + perso.apellido);
      System.out.println("Edad: " + perso.edad);
   }
}
//Son plantillas
//Son tipos de datos
class Persona{
   String nombre;
   String apellido;
   int edad;
}