public class Persona implements Comparable<Persona>{
    public String nombre;
    public int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona otra) {
        int comparacion = this.edad - otra.edad;
        return comparacion;
    }
}
