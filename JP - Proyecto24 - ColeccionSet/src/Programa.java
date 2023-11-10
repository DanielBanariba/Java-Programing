import java.util.HashSet;
import java.util.Set;

public class Programa {
    public static void main(String[] args) {

        //Usamos un conjuntos para agregar los departamentos de Honduras
        Set<String> departamentos = new HashSet<String>();

        //Agregamos algunos departamentos
        departamentos.add("Francisco Morazan");
        departamentos.add("Choluteca");
        departamentos.add("El pararizo");
        departamentos.add("Teguscigalpa");
        departamentos.add("Santa Barbara");

        System.out.println(departamentos);

        //Que sucede si ingresamos Teguscigalpa otra vez en el arreglo departamento?
        departamentos.add("Teguscigalpa");
        System.out.println("Despues de tratar de ingresar Teguscigalpa por segunda vez");
        System.out.println(departamentos);

        //Verifica si el departamento Comayagua esta agregado en el arreglo
        boolean yaEstaComayagua = departamentos.contains("Comayagua");
        if (yaEstaComayagua == false) departamentos.add("Comayagua");

        System.out.println("Despues de tratar de ingresar Comayagua");
        System.out.println(departamentos);
    }

}
