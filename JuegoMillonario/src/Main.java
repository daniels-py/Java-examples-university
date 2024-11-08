
import vista.VistaConcurso;
import modelo.BancoPreguntas;
import modelo.Pregunta;
import modelo.Opcion;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // Inicializa el banco de preguntas
        BancoPreguntas bancoPreguntas = new BancoPreguntas();

        // Crea la vista (interfaz gráfica)
        VistaConcurso vista = new VistaConcurso();

        // Crea un ActionListener que se encargue de las interacciones con los botones
        vista.agregarEventos(new ActionListener() {
            private int puntaje = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton fuente = (JButton) e.getSource();
                int indiceOpcion = -1;

                // Buscar cuál botón fue presionado
                for (int i = 0; i < vista.getBotonesOpciones().length; i++) {
                    if (fuente == vista.getBotonesOpciones()[i]) {
                        indiceOpcion = i;
                        break;
                    }
                }

                // Obtener una pregunta aleatoria
                Pregunta pregunta = bancoPreguntas.obtenerPreguntaAleatoria();
                boolean respuestaCorrecta = pregunta.getOpciones().get(indiceOpcion).esCorrecta();

                // Verificar la respuesta
                if (respuestaCorrecta) {
                    puntaje++;  // Incrementa el puntaje si la respuesta es correcta
                    JOptionPane.showMessageDialog(vista, "¡Correcto! Puntaje: " + puntaje);
                } else {
                    JOptionPane.showMessageDialog(vista, "¡Incorrecto! Puntaje final: " + puntaje);
                    System.exit(0);  // Termina el juego si la respuesta es incorrecta
                }

                // Actualizar la vista con una nueva pregunta
                vista.actualizarVista(pregunta.getPregunta(), pregunta.getOpciones().stream()
                        .map(Opcion::getTexto).toArray(String[]::new));
            }
        });

        // Muestra la ventana del juego
        vista.setVisible(true);

        // Inicia el juego con la primera pregunta
        Pregunta primeraPregunta = bancoPreguntas.obtenerPreguntaAleatoria();
        vista.actualizarVista(primeraPregunta.getPregunta(), primeraPregunta.getOpciones().stream()
                .map(Opcion::getTexto).toArray(String[]::new));
    }
}
