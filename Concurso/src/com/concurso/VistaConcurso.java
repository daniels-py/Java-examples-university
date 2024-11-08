package com.concurso;


import  javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;



public class VistaConcurso extends JFrame {
    private JLabel lblPregunta;
    private JButton[] btnOpciones;
    private JLabel lblPuntaje;
    private Concurso concurso;
    private Pregunta preguntaActual;

    // Constructor
    public VistaConcurso(Concurso concurso) {
        this.concurso = concurso;
        this.btnOpciones = new JButton[4];
        inicializarComponentes();
        mostrarNuevaPregunta();
    }

    // Método para inicializar los componentes de la interfaz
    private void inicializarComponentes() {
        setTitle("¿Quién Quiere Ser Millonario?");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel para la pregunta
        lblPregunta = new JLabel("Pregunta");
        lblPregunta.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblPregunta, BorderLayout.NORTH);

        // Panel para las opciones
        JPanel panelOpciones = new JPanel();
        panelOpciones.setLayout(new GridLayout(2, 2));
        for (int i = 0; i < 4; i++) {
            btnOpciones[i] = new JButton("Opción " + (i + 1));
            panelOpciones.add(btnOpciones[i]);
            btnOpciones[i].addActionListener(new ManejadorOpciones());
        }
        add(panelOpciones, BorderLayout.CENTER);

        // Etiqueta para el puntaje
        lblPuntaje = new JLabel("Puntaje: 0");
        lblPuntaje.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblPuntaje, BorderLayout.SOUTH);
    }

    // Método para mostrar una nueva pregunta
    private void mostrarNuevaPregunta() {
        preguntaActual = concurso.obtenerPreguntaActual();
        lblPregunta.setText(preguntaActual.getEnunciado());
        List<Opcion> opciones = preguntaActual.getOpciones();
        for (int i = 0; i < opciones.size(); i++) {
            btnOpciones[i].setText(opciones.get(i).getTexto());
        }
    }

    // Manejador para los botones de opciones
    private class ManejadorOpciones implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton botonPresionado = (JButton) e.getSource();
            String textoOpcion = botonPresionado.getText();
            boolean esCorrecto = concurso.verificarRespuestas(preguntaActual, textoOpcion);
            if (esCorrecto) {
                lblPuntaje.setText("Puntaje: " + concurso.getPuntaje());
                mostrarNuevaPregunta();
            } else {
                JOptionPane.showMessageDialog(VistaConcurso.this, "Respuesta incorrecta. Fin del juego.");
                dispose(); // Cierra la ventana
            }
        }
    }
}
