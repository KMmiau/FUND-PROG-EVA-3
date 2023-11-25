
package eva3_4_funcion_arreglo;

public class EVA3_4_FUNCION_ARREGLO {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = crearArreglo(10, 100);
        
        for (int valor : arreglo) {
            System.out.print("[" + valor + "]");
        }
    }
public static int[] crearArreglo(int tamaño, int rango){
    int[] arreglo = new int[tamaño];
    for (int i = 0; i < arreglo.length; i++) {
        arreglo[i] = (int)(Math.random() * rango);
    }
    return arreglo;
}
}
