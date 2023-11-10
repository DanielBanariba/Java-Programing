public class Programa {

    public static void main(String[] args) {
        //Lamo la funcion Imprimir
        System.out.println("Numeos descendetes con recursividad");
        numerosDescendentes(5);
        System.out.println("Numeros ascendentes con recursividad");
        System.out.println();
        numerosAscendentes(1,10);
    }


    //Algoritmo recursivo que imprima numeros del n al 1
    public static void numerosAscendentes(int numero1, int numero2){
        //Caso base, caso conocido
        if (numero1 == numero2)
            return;
        System.out.print(numero1 + ", ");


        //caso resurvio
        numerosAscendentes(numero1+1, numero2);
    }

    public static void numerosDescendentes(int numero1){
        if (numero1 == 0)
            return;

        System.out.print(numero1 + ", ");

        //Caso recursivo: lineal solo llama 1 vez a si misma
        numerosDescendentes(numero1-1);
    }
}
