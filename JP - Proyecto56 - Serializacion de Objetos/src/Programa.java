import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Programa {

    public static void main(String[] args) {
        // Creamos un objeto de tipo Jugador
        Jugador daniel = new Jugador();
        daniel.nombre = "DanielBanariba";
        daniel.x = 550;
        daniel.y = 700;
        daniel.z = 5;
        // Serializacion
        Path carpeta = Paths.get("jugadores/serializados");
        try {
            // Creamos una carpeta
            Files.createDirectories(carpeta);
            String strArchivo = "daniel.obj";
            // Creamos un objeto FileOutputStream
            String strRutaArchivo = carpeta.resolve(strArchivo).toString();
            System.out.println(strRutaArchivo);
            FileOutputStream fStream = new FileOutputStream(strRutaArchivo);
            // Creamos un objeto ObjectOutputStream
            ObjectOutputStream oStream = new ObjectOutputStream(fStream);
            // Enviamos el objeto al archivo
            oStream.writeObject(daniel);
            // Cerramos los recursos
            oStream.close();
            fStream.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        // Creamos un objeto File
    }
}