import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo");
        String nombreCompeto = in.nextLine();

        //Para separar una cadena: el metodo mas facil es usar split
        String separador = " ";
        String[] partes = nombreCompeto.split(separador);

        //Imprimimos las partes
        for (String variableMagica: partes){
            System.out.println(variableMagica);
        }

        System.out.println("Ingrese la fecha de Nacimiento");
        String fechaNacimiento = in.next();
        separador = "[/-]";

        partes = fechaNacimiento.split(separador);
        int annioNacimiento = Integer.parseInt(partes[2]);
        System.out.println("El que nacio es: " + annioNacimiento);
        int annioActual = Year.now().getValue();
        int edad = annioActual - annioNacimiento;

        System.out.println("Su edad es: " + edad);


        //Forma alterna de separar una cadena
        String frase = "Hoy es viernes y el cuerpo lo sabe";
        ArrayList<String> palabras = new ArrayList<String>();
        String palabraActual = "";

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra != '') {
                palabraActual += letra;
            } else {
                palabras.add(palabraActual);
                palabraActual = "";
            }
        }

        System.out.println("");
    }
}
