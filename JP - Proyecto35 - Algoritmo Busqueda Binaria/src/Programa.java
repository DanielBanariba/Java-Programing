public class Programa {
    public static void main(String[] args) {
        String[] tiendas = {"Rojo", "Verde", "Azul", "Amarillo", "Negro"};
        String colorBuscado = "Azul";
        int tiendaEncontrado = busquedaSecuencial(colorBuscado, tiendas);
        if (tiendaEncontrado == -1) {
            System.out.println("El vestido con ese color no esta en ninguna tienda");
        }else{
            System.out.println("El vetido de color " + colorBuscado + " sta en la tienda " + tiendaEncontrado);
        }
    }

    public static int busquedaSecuencial(String busqueda, String[] arreglo){

        for (int i = 0; i < arreglo.length; i++) {
            if (busqueda.equals(arreglo[i]))
                return i;
        }
        return -1;
    }
}
