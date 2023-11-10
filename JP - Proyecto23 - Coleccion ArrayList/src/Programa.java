import java.util.ArrayList;
import java.util.Iterator;

public class Programa {
    public static void main(String[] args) {
        ArrayList<String> trenDeProductos = new ArrayList<String>();
        trenDeProductos.add("Arroz");
        trenDeProductos.add("Maiz");
        trenDeProductos.add("Harina");
        trenDeProductos.add("Azucar");

        Iterator<String> iterator = trenDeProductos.iterator();

        while (iterator.hasNext()){
            String contenido = iterator.next();
            System.out.print("(" + contenido + ")--->");
        }
        System.out.println();

        //Metodos adicionales del ArrayList
        int cantidad = trenDeProductos.size();

        //Buscar un elemento
        int posicioHarina = trenDeProductos.indexOf("Harina");

        //Elimina el elemento
        trenDeProductos.remove(posicioHarina);

        //Elimino el elemento que contiene el Azucar
        trenDeProductos.remove("Azucar");

        //Imprimo la coleccion
        System.out.println(trenDeProductos);

        //Agregar elementos al inicio
        trenDeProductos.add(0,"Frutas");
    }
}
