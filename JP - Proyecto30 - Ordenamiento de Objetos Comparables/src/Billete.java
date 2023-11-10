public class Billete implements Comparable<Billete>{
    public String descripcion;
    public int cantidad;

    public Billete(String descripcion, int cantidad) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    @Override
    public int compareTo(Billete otro) {
        //Metrica para comprar los billetes
        return this.cantidad - otro.cantidad;
    }

    @Override
    public String toString(){
        return this.descripcion;
    }
}
