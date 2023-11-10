import java.awt.*;
import javax.swing.*;

public class Programa {
    public static void main(String[] args) {
        //Creamos una ventana
        JFrame ventana = new JFrame("Mi Ventana");

        JPanel panel = new JPanel();

        panel.setBounds(100,100,300,200);

        JButton boton = new JButton("Dame clic <3");
        boton.setBounds(136,92,48,16);


        panel.add(boton);

        ventana.add(panel);
        ventana.setSize(328,216);

        ventana.show();
    }
}
