import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        saludeA("Carlos");
        saludeA(27);
        saludeA(true);
        saludeA(58.7);
    }

    //Metodo Generico
    public <T extends Number> double promedio (ArrayList<T> listaNumeros){

        double suma = 0.0;
        for (Number variableMagica : listaNumeros) {
            suma += variableMagica.doubleValue();
        }


        return suma / listaNumeros.size();
    }

    public static  <T> void saludeA(T valor){
        System.out.println("Hola " + valor);
    }
}
