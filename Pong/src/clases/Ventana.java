
package clases;


import javax.swing.*;

import control.EngineGraphics;

public class Ventana extends JFrame {

    Tablero lamina;
    Pelota p = new Pelota();

    public Ventana() {
        setTitle("Pong");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        lamina = new Tablero();
        add(lamina);

        addKeyListener(new EventoTeclado());
        new EngineGraphics(lamina).start();
    }

}
