public class Programa {
    public static void main(String[] args) {
        Pareja<Figura, String> pareja1 = new Pareja();
        Pareja<Triangulo, Integer> pareja2 = new Pareja<>();
        Pareja<Isoceles, Boolean> pareja3 = new Pareja<>();

        Pareja<String, Integer> nombreEdad = new Pareja<>();
        nombreEdad.elementos = "Daniel Barrientos";
        nombreEdad.elementos2 = 27;

        Pareja<Double, Double> coordenadas = new Pareja<>();
        coordenadas.elementos = 15.27;
        coordenadas.elementos2 = 93.75;

        // Uso de Comodines o wilcards
        Pareja<? extends Number, ? super Triangulo> parejaFueraDeLugar = new Pareja<>();



    }
    //Permite un limite de tipo de datos

}
