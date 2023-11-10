//Solo va a permitir una instancia
public class Singleton {

    private static Singleton instancia;

    private Singleton() {
        System.out.println("Se creo una instancia");
    }

    //Definimos un metodo para obtener la intancia
    public static Singleton obtenerInstancia(){
        if (instancia == null) instancia = new Singleton();
        return instancia;
    }
}