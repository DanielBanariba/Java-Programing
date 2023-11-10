public class Programa {
    public static void main(String[] args) {

        Vagon vagon1 = new Vagon();
        vagon1.contenido = "Arroz";
        vagon1.eslabon = null;

        vagon1.eslabon = new Vagon();
        vagon1.eslabon.contenido = "Maiz";

        vagon1.eslabon.eslabon = new Vagon();
        vagon1.eslabon.eslabon.contenido = "Harina";
        vagon1.eslabon.eslabon.eslabon = new Vagon();
        vagon1.eslabon.eslabon.eslabon.contenido = "Azucar";


        //Recorrer o iterar esta estructura de datos
        Vagon iterador = vagon1;

        while (iterador != null){
            //Obtengo el contenido del vagon del Vagon actual al que apunta interador
            String contenido = iterador.contenido;

            // Imprimo el contenido
            System.out.print ("(" + contenido + ")---->");

            //Hago que iterador avance al siguiente Vagon
            iterador = iterador.eslabon;
        }
    }
}