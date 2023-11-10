public class Programa {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Daniel Barrientos");
        try {
            persona1.setEdad(-20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
