public class Programa {

    public static void main(String[] args) {
        int numero1 = 5, numero2 = 5;
        int resultado = multiplicar(numero1, numero2);
        System.out.println(resultado);
        System.out.println(String.format("Multiplicar %d con %d es %d", numero1, numero2, resultado));
    }

    //Mulplicacion usando recursividad
    public static int multiplicar(int numb1, int numb2){
        //Casos bases
        if (numb2 == 0){
            return 0;
        }if (numb2 == 1){
            return numb1;
        }if (numb2 <0 ){
            return -multiplicar(numb1, -numb2);
        }

        return multiplicar(numb1, numb2-1)+numb1;
    }
}
