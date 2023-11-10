public class Programa {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.radio = 3;

        System.out.println("El area del circulo es: " + circulo1.area());

        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.alto = 5;
        rectangulo1.ancho = 3;

        System.out.println("El area del rectangulo es: " + rectangulo1.area());



        //ESTO ES UN MALDITO POLIMORFISMO
        Figura figura = circulo1;
        System.out.println("figura.area()=>" + figura.area());

        figura = rectangulo1;
        System.out.println("Rectangulo figura()=>" + figura.area());

    }
}