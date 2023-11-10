import java.util.Random;

public class Programa {

    //Metodo que ordena un arreglo de n enteros, mediante el algoritmo de ordenamiento burbuja
    public static void main(String[] args) {
        int[] arregloDePrueba = generarArreglo(10);

        System.out.println("Antes del ordenamiento");
        imprimirArreglo(arregloDePrueba);

        bubleSort(arregloDePrueba);

        System.out.println("Despues del ordenamiento");
        imprimirArreglo(arregloDePrueba);
    }

    //Metodo que devuelve un arreglo de numeros enteros
    public static int[] generarArreglo(int numero){
        int[] arreglo = new int[numero];

        Random numeroAleatorio = new Random();

        //Relleno el arreglo con numeros aleatorios
        for (int i = 0; i < numero; i++) {
            arreglo[i] = numeroAleatorio.nextInt(numero);
        }
        return arreglo;
    }

    public static void imprimirArreglo(int[] arreglo){

        System.out.print("[");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + (i < arreglo.length - 1 ? ",":""));
        }

        System.out.println("]");
    }

    public static void bubleSort(int[] arreglo){
        int numero = arreglo.length;
        for (int i = 0; i < numero-1; i++) {
            for (int j = 0; j < numero - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambia los elementos si están en el orden incorrecto
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }
    }
}
