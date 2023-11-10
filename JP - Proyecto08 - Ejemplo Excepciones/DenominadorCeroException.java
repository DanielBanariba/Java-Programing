public class DenominadorCeroException extends Exception{
    String mensaje;

    // Creamos el constructor con parametros
    public DenominadorCeroException(String mensaje){
        this.mensaje = mensaje;
    }

    //Creamos el constructor sin parametros
    public DenominadorCeroException(){
        this.mensaje = "No se permite 0 en el denominador";
    }
    //Redefinir el metodo getMessage



    public String getMensaje(){
        return this.mensaje;
    }
}