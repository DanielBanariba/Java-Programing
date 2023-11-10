import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        //Dentro de los parantesis se auto cirra la funcion
        try (Scanner in = new Scanner(System.in);){

            System.out.println("Dame tu nombre");
            String nombre = in.next();

            System.out.println("Dame tu fecha de nacimiento:");
            String fechaNacimiento = in.next();

            System.out.println("Deme su estatura");
            double estatura = in.nextDouble();

            //Calculamos la edad
            //El Primer paso: Separamos la fechaDeNacimiento en 3 partes usando el meotod split
            String[] partesFechaDeNacimiento = fechaNacimiento.split("/");

            //Partes de la fecha pero en cadenas;
            String strDia = partesFechaDeNacimiento[0];
            String strMes = partesFechaDeNacimiento[1];
            String strAnio = partesFechaDeNacimiento[2];

            //Convierte strAnno a entero = Casthing
            int annioNacimiento = Integer.parseInt(strAnio);

            //Calculamos la edad
            int edad = 2022 - annioNacimiento;

            System.out.println("La edad es " + edad);

            System.out.println("Cual es su sexo biologico");
            char sexo = in.next().charAt(0);

            //Variable que format
            
        }catch (IllegalStateException ex){
            System.out.println("Despida el programador, ese no sirve");

        }catch (ArrayIndexOutOfBoundsException | NumberFormatException ex){
            System.out.println("Ingreso la fecha ede forma incorrecta");

        }catch (InputMismatchException ex){
            System.out.println("Ingreso un valor ");

        //Siempre tiene que ir de ultimo
        }catch (Exception ex){
            System.out.println("Ocurrio un error inesperado");
            ex.printStackTrace();
        }

        System.out.println("El Programa termino");


    }
}