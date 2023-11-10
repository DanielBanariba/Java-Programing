public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        assert numerador != denominador : "El denominador no debe ser cero";
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
