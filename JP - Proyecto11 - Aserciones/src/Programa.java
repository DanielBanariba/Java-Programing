import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero entre 1 y 10 (Ambos inclusive)");
        int numero = entrada.nextInt();

        //Las aserciones sirven para como puntos de validacion dentro del codigo
        assert (numero >= 1 && numero <= 10);

        System.out.println("El doble de ese numero es: " + (2*numero));

    }
}
