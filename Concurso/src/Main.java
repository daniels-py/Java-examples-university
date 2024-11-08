package com.concurso;
import javax.swing.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        BancoPreguntas banco = new BancoPreguntas();

        // Agregar algunas preguntas de ejemplo
        banco.agregarPreguntaFacil(new Pregunta("¿Cuál es el planeta más cercano al Sol?",
                Arrays.asList(new Opcion("Mercurio", true), new Opcion("Venus", false),
                        new Opcion("Tierra", false), new Opcion("Marte", false))));

        banco.agregarPreguntaIntermedia(new Pregunta("¿Cuál es la capital de Japón?",
                Arrays.asList(new Opcion("Tokio", true), new Opcion("Kioto", false),
                        new Opcion("Osaka", false), new Opcion("Nagoya", false))));

        banco.agregarPreguntaDificil(new Pregunta("¿Cuál es la raíz cuadrada de 256?",
                Arrays.asList(new Opcion("16", true), new Opcion("18", false),
                        new Opcion("14", false), new Opcion("12", false))));

        // Crear el juego y la interfaz
        Concurso concurso = new Concurso(banco);
        SwingUtilities.invokeLater(() -> {
            VistaConcurso vista = new VistaConcurso(concurso);
            vista.setVisible(true);
        });
    }
}