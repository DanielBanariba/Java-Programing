public class Programa {
    public static void main(String[] args) {
        String cadena1 = "";
        //Mide cuanto tiempo tarda en ejecutar el codigo
        long tiempoInicial = System.nanoTime();

        for(int i=0; i<1000000; i++) {
            cadena1 += "a";
        }

        long tiempoFinal =  System.nanoTime();
        long tiempoTranscurrido = tiempoFinal - tiempoInicial;

        System.out.println("Concatenar una String se tardó: " + tiempoTranscurrido + " milisegundos");

        // Version usando StringBuilder
        StringBuilder cadena2 = new StringBuilder();
        tiempoInicial = System.nanoTime();

        for(int i = 0; i < 1000000 ; i++) {
            cadena2.append("a");
        }

        tiempoFinal = System.nanoTime();
        tiempoTranscurrido = tiempoFinal - tiempoInicial;
        System.out.println("Concatenar un StringBuilder se tardó: " + tiempoTranscurrido + " milisegundos");
    }
}
