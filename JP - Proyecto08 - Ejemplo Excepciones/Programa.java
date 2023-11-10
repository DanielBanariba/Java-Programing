import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		try {
			Fraccion division = new Fraccion();
			Scanner entrada = new Scanner(System.in);

			//---------------------------------------------
			System.out.println("Ingrese el numerador");
			int valor1 = entrada.nextInt();
			division.setNumerador(valor1);

			//---------------------------------------------
			System.out.println("Ingrese el numerador :");
			int valor2 = entrada.nextInt();
			division.setDenominador(valor2);

			//Caputra una letra
		}catch (InputMismatchException exception){
			System.out.println("EXCEPCION No ingreso un numero");


		}catch (DenominadorCeroException exception){
			System.out.println(exception.getMensaje());


		}catch(Exception excepcion) {
			//System.out.println("<ERROR> Ingresó el 0 en el denominador");
			System.out.println(excepcion.getMessage());
		}
		System.out.println("<FIN> Fin del programa");
	}
}