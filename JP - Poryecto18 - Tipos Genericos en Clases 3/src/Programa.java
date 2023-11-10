public class Programa {
    public static void main(String[] args) {

        //Demostracion que podemos tener dos tipos diferentes de variables
        Pareja<String, String> po1 = new Pareja<>();
        po1.elemento1 = "Juan";
        po1.elemento2 = "Maria";

        Pareja<String, Integer> po2 = new Pareja<>();
        po2.elemento1 = "Hola";
        po2.elemento2 = 24;
    }
}
