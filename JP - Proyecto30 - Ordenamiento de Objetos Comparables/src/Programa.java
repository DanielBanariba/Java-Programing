import java.util.ArrayList;
import java.util.Collections;

public class Programa {
    public static void main(String[] args) {
        Billete uno = new Billete("Un Lempira", 1);
        Billete dos = new Billete("Dos Lempira", 2);
        Billete cinco = new Billete("Cinco Lempira", 5);
        Billete diez = new Billete("Diez Lempira", 10);
        Billete veinte = new Billete("Veinte Lempira", 20);
        Billete cincuenta = new Billete("Cincuenta Lempira", 50);
        Billete cien = new Billete("Cien Lempira", 100);
        Billete docientos = new Billete("Docientos Lempira", 200);
        Billete quinientos = new Billete("Quinientos Lempira", 500);

        ArrayList<Billete> listaDeBilleta = new ArrayList<Billete>();

        listaDeBilleta.add(quinientos);
        listaDeBilleta.add(uno);
        listaDeBilleta.add(docientos);
        listaDeBilleta.add(veinte);
        listaDeBilleta.add(cinco);
        listaDeBilleta.add(cincuenta);
        listaDeBilleta.add(dos);
        listaDeBilleta.add(cien);
        listaDeBilleta.add(diez);
        System.out.println("Antes de ordena: " + listaDeBilleta);

        //Ordenar la lista
        Collections.sort(listaDeBilleta);

        System.out.println("Despues de Ordenar: " + listaDeBilleta);





    }
}
