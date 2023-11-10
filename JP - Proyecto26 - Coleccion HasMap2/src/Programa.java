import java.util.HashMap;

public class Programa {
    public static void main(String[] args) {
        //Necesitamos asociar los paises de Centro America con sus capitales
        HashMap<String, String> mapPaisesCapitales = new HashMap<String, String>();

        //Ahora asociamos cada pais con su capital
        mapPaisesCapitales.put("Honduras", "Tegucigalpa");
        mapPaisesCapitales.put("Guatema", "Ciudad de Guatemala");
        mapPaisesCapitales.put("El Salvador", "San Salvador");
        mapPaisesCapitales.put("Nicaragua", "Managua");
        mapPaisesCapitales.put("Costa Rica", "San Jose");

        //Consultamos si esta el pais Panama y la capital de Belice en el HashMap
        boolean estaPanama   = mapPaisesCapitales.containsKey("Paname");
        boolean estaBelmopan = mapPaisesCapitales.containsKey("Belmopan");

        if (estaPanama == false)
            System.out.println("No incluye Panama en el mapa Hash");

        if (estaBelmopan == false)
            System.out.println("No incluye Belmopan en el mapa hash");

        System.out.println("Imprimiendo el mapa hash");

        for (String pais: mapPaisesCapitales.keySet()) {
            String capital = mapPaisesCapitales.get(pais);

            //Otra forma de concatenar
            System.out.println(String.format("La Capital de %s es %s", pais, capital));
        }
    }
}
