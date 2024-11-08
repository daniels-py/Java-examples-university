package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class VistaConcurso extends JFrame {
    private JPanel panelPrincipal;
    private JLabel etiquetaPregunta;
    private JButton[] botonesOpciones;

    // Constructor
    public VistaConcurso() {
        setTitle("¿Quién quiere ser millonario?");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Centra la ventana en la pantalla

        // Crear componentes
        panelPrincipal = new JPanel();
        etiquetaPregunta = new JLabel("Pregunta?");
        botonesOpciones = new JButton[4];  // Cuatro botones para las opciones

        // Configuración del panel
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
        panelPrincipal.add(etiquetaPregunta);

        // Crear botones de opción
        for (int i = 0; i < 4; i++) {
            botonesOpciones[i] = new JButton("Opción " + (i + 1));
            panelPrincipal.add(botonesOpciones[i]);
        }

        add(panelPrincipal);
    }

    // Método para actualizar la vista con la pregunta y opciones
    public void actualizarVista(String pregunta, String[] opciones) {
        etiquetaPregunta.setText(pregunta);  // Actualiza el texto de la pregunta

        for (int i = 0; i < 4; i++) {
            botonesOpciones[i].setText(opciones[i]);  // Actualiza los botones con las opciones
        }
    }

    // Método para agregar eventos a los botones
    public void agregarEventos(ActionListener actionListener) {
        for (JButton boton : botonesOpciones) {
            boton.addActionListener(actionListener);  // Asigna el evento a cada botón
        }
    }

    // Getters para los botones de opciones
    public JButton[] getBotonesOpciones() {
        return botonesOpciones;
    }
}
