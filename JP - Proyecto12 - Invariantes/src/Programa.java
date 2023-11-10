import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Estudia o trabaja (E/T)");
        char letra = entrada.next().charAt(0);

        //Aqui validamos que la letra sea H o M

        assert letra == 'E' || letra == 'T' : "Ingreso el caracter equivocado";

        //Control de flujo con invarianza
        switch (letra){
            case 'E':
                System.out.println("La persona estudia");
                assert letra == 'E';
            case 'T':
                System.out.println("La persona trabaja");
                assert letra == 'T';
                break;
        }

        Fraccion fraccion = new Fraccion(1,0);

    }
}
