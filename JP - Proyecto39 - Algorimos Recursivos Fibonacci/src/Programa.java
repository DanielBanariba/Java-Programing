public class Programa {
    public static void main(String[] args) {
        int p = 5;
        int q = fibonaci(p);
        System.out.println("El Fibonachi de " + p + " es " + q);
    }

    public static int fibonaci(int numero){
        //Caso Base
        if (numero == 1) {
            return 1;
        }
        if (numero == 2) {
            return 1;
        }

        return fibonaci(numero-1) + fibonaci(numero-2);
    }
}
