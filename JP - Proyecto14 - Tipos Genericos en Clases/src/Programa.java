public class Programa {
    public static void main(String[] args) {


        Vagon vagon1 = new Vagon();
        vagon1.contenido = "Maiz";

        Vagon vagon2 = new Vagon();
        vagon2.contenido = 23;

        Vagon vagon3 = new Vagon();
        vagon3.contenido = false;

        // Si trato de concatenar el contenido del vagon a
        String frase = "Arroz y " + vagon1.contenido;
        System.out.println(frase);

        //Si trato de sumar el contendio del vagon b
        int numero = (int)vagon2.contenido + 5;
        System.out.println(numero);



        
    }
}
