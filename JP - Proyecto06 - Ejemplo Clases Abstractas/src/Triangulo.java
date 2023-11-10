public class Triangulo extends Figura{
    public double base;
    public double altura;

    @Override
    public double area(){
        return 0.5*base*altura;
    }
}
