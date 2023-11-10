import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Programa {
    public static void main(String[] args) {
        String strRutaBase = "C:\\Users\\banar\\Desktop\\Java Modulo 3 INFOP\\JP - Proyecto53 - Atributos de Archivos\\archivos";
        String strNombreArchivoOculto = "oculto.txt";
        String strNombreArchivoEjecutable = "ejecutable.exe";
        String strNombreArchivoSoloLectura = "solo_lectura.txt";
        String strNombreArchivoBloqueado = "bloqueado.txt";

        // Armado de rutas
        Path rutaArchivoOculto = Paths.get(strRutaBase, strNombreArchivoOculto);
        Path rutaArchivoEjecutable = Paths.get(strRutaBase, strNombreArchivoEjecutable);
        Path rutaArchivoSoloLectura = Paths.get(strRutaBase, strNombreArchivoSoloLectura);
        Path rutaArchivoBloqueado = Paths.get(strRutaBase, strNombreArchivoBloqueado);

        // Verificamos si los archivos existen
        boolean archivoOcultoExiste = Files.exists(rutaArchivoOculto);
        boolean archivoEjecutableExiste = Files.exists(rutaArchivoEjecutable);
        boolean archivoSoloLecturaExiste = Files.exists(rutaArchivoSoloLectura);
        boolean archivoBloqueadoExiste = Files.exists(rutaArchivoBloqueado);

        // Verificamos el atributo nombrado en el nombre del archivo.
        try {
            boolean archivoEstaOculto = Files.isHidden(rutaArchivoOculto);
            boolean archivoEsEjecutable = Files.isExecutable(rutaArchivoEjecutable);
            boolean archivoEsSoloLectura = Files.isWritable(rutaArchivoSoloLectura) == false && Files.isReadable(rutaArchivoSoloLectura) == true;
            boolean archivoEstaBloqueado = Files.isWritable(rutaArchivoBloqueado);

            // Impresion del analisis de los archivos
            System.out.println("el archivo " + strNombreArchivoOculto + " esta oculto: " + archivoEstaOculto);
            System.out.println("el archivo " + strNombreArchivoEjecutable + " es ejecutable: " + archivoEsEjecutable);
            System.out.println("el archivo " + strNombreArchivoSoloLectura + " es de solo lectura: " + archivoEsSoloLectura);
            System.out.println("el archivo " + strNombreArchivoBloqueado + " esta bloqueado: " + archivoEstaBloqueado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}