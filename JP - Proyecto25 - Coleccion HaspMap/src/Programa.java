import java.util.HashMap;

public class Programa {
    public static void main(String[] args) {
        //Creamos un arreglos que va a contener nombres
        String[] nombres = new String[4];
        int[] edades = new int[4];

        //Agregamos los nombres y las edades
        nombres[0] = "Luis" ;      edades[0] = 17;
        nombres[1] = "Pedro";      edades[1] = 21;
        nombres[2] = "Ana"  ;      edades[2] = 33;
        nombres[3] = "Joe"  ;      edades[3] = 14;

        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i] + " tiene " + edades[i] + " anios ");
        }

        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();

        //Forma alternativa usando la coleccion con el HashMap
        HashMap<String, Integer> mapNombresEdades = new HashMap<String, Integer>();

        //Asocio cada nombre con su edad, osea hago un arreglo
        mapNombresEdades.put("Luis" , 17);
        mapNombresEdades.put("Pedro", 21);
        mapNombresEdades.put("Ana"  , 33);
        mapNombresEdades.put("Joe"  , 14);

        //Imprimir el mapa Hash o arreglo asociativo
                                    //Con el KeySet le digo, dame las llaves del arreglo
        for (String llave : mapNombresEdades.keySet()) {
            int valor = mapNombresEdades.get(llave);
            System.out.println(llave + " tiene " + valor + " anios");
        }
    }
}
