public class Programa {

    public static void main(String[] args) {
        // Creamos un boleto
        Boleto ticket1 = new Boleto();
        ticket1.evento = "Concierto Mägo de Oz";
        ticket1.tipo = TipoDeBoleto.VIP;

        // Creamos otro boleto
        Boleto ticket2 = new Boleto();
        ticket2.evento = "Concierto de Coldplay";
        ticket2.tipo = TipoDeBoleto.SILLA;

        // Creamos otro boleto
        Boleto ticket3 = new Boleto();
        ticket3.evento = "Tierra Santa";
        ticket3.tipo = TipoDeBoleto.GRADERÍA;

        //Los enumerados se tratan como items dentro de una coleccion
        for (TipoDeBoleto variableMagica : TipoDeBoleto.values()){
            System.out.println("Nombre: " + variableMagica.name());
            System.out.println("Ordinal: " + variableMagica.ordinal());
            System.out.println("-----------------------------------------------");

        }
    }
}
