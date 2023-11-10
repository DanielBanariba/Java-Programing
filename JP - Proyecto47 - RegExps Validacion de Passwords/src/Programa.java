import java.util.Arrays;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean [] reglasCumplidas = new boolean[5];
        System.out.println("Ingrese una contrasennn para validarla");
        String password = in.nextLine();

        //Validaciones
        reglasCumplidas[0] = password.matches(".*[a-z].*");
        reglasCumplidas[1] = password.matches(".*[A-Z].*");
        reglasCumplidas[2] = password.matches(".*[0-9].*");
        reglasCumplidas[3] = password.matches(".*[!@#$%^&=_\\-+*].*");
        reglasCumplidas[4] = password.matches(".{8,}");

        int conteoReglas = 0;
        for (boolean variableMagica : reglasCumplidas) {
            conteoReglas += variableMagica ? 1:0;
        }
        System.out.println("Se cumplieron: " + conteoReglas + " reglas de " + reglasCumplidas.length);
        System.out.println(Arrays.toString(reglasCumplidas));
        if(!reglasCumplidas[0]) System.out.println("Su password no lleva ni una minúscula a-z");
        if(!reglasCumplidas[1]) System.out.println("Su password no lleva ni una mayúscula A-Z");
        if(!reglasCumplidas[2]) System.out.println("Su password no lleva ni un digito del 0 al 9");
        if(!reglasCumplidas[3]) System.out.println("Su password no lleva ni un caracter especial !@#$%&=_-+*");
        if(!reglasCumplidas[4]) System.out.println("Su password tiene menos de 8 caracteres");

        //Reto:
        //Hay una regla no escrita o especificada que debe definirse y es lo eu excuya caractecres no permitidos en el password
    }
}