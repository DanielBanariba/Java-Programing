public class Programa {
    public static void main(String[] args) {
        Persona daniel = new Persona("Daniel Barrientos", 26);
        Persona nina = new Persona("Nina Barrientos", 15);

        if (daniel.edad>nina.edad){
            System.out.println("Daniel es Mayor que Nina");
        }else {
            System.out.println("Nina es Mayor que Daniel");
        }

        System.out.println(daniel.compareTo(nina));


    }


}
