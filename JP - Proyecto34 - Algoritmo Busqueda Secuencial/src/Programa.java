public class Programa {
    public static void main(String[] args) {
        String[] tiendas = {"Rojo", "Verde", "Azul", "Amarillo", "Negro"};
        String colorBuscado = "Azul";
        int tiendaEncontrado = busquedaBinaria(colorBuscado, tiendas);
        if (tiendaEncontrado == -1) {
            System.out.println("El vestido con ese color no esta en ninguna tienda");
        }else{
            System.out.println("El vetido de color " + colorBuscado + " sta en la tienda " + tiendaEncontrado);
        }
    }

    public static int busquedaBinaria(String busqueda, String[] arreglo){

    }
}
