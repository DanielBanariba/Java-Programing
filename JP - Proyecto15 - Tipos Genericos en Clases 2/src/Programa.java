import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {
        Vagon<String> vagon1 = new Vagon();
        vagon1.contenido = "Lácteos";

        Vagon<Integer> vagon2 = new Vagon();
        vagon2.contenido = 23;

        Vagon<Boolean> vagon3 = new Vagon();
        vagon3.contenido = false;

        // Interconecto los vagones para formar un trencito
        vagon1.eslabon = vagon2;
        /*
         *    ------ vagon1 -----   -------- vagon2 -----------
         *   contenido   eslabon      contenido   eslabon
         *       [  Lácteos   ] ----> [       23       ] --------->
         */
        vagon2.eslabon = vagon3;
        /*
         *    ---------- b --------   ---------- c -----------
         *   contenido   eslabon      contenido   eslabon
         * [       23       ] ---------> [      false     ] --------->
         */

        /*      a               b              c
         * [ Lácteos ] -----> [ 23 ] ----> [ false ] ----> NULL
         */

    }

}