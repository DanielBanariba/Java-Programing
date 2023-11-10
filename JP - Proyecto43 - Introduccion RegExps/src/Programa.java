import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Programa {
    public static void main(String[] args) {
        final String rapex = "[0-9]{13}";
        //final String string = "08011999806054";

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numero de identidad");
        final String string = in.nextLine();

        //Creando un objeto pattern a partir de la regex en la cadena
        final Pattern pattern = Pattern.compile(rapex, Pattern.MULTILINE);

        //Creando un moto de analisi a partir del patron y la cadena a analizar
        final Matcher matcher = pattern.matcher(string);

        //Si se encontro una coincidencia
        if (matcher.find()){
            System.out.println("Se encontro coincidencia");
        }else {
            System.out.println("No se encontro coincidencia");
        }

        while (matcher.find()){
            System.out.println("Full Match: " + matcher.group(0));

            for (int i=1; i <= matcher.groupCount(); i++){
                System.out.println("Group" + i + ": " + matcher.group(i));
            }
        }
    }
}
