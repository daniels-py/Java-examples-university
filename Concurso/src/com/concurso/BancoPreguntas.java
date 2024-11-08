package com.concurso;

import  java.util.ArrayList;
import  java.util.List;
import  java.util.Random;

public class BancoPreguntas {

    private List<Pregunta> preguntasFaciles;
    private List<Pregunta> preguntasIntermedias;
    private List<Pregunta> preguntasDificiles;

    public BancoPreguntas() {
        preguntasFaciles = new ArrayList<>();
        preguntasIntermedias = new ArrayList<>();
        preguntasDificiles = new ArrayList<>();
    }

    // Métodos para agregar preguntas
    public void agregarPreguntaFacil(Pregunta pregunta) {
        preguntasFaciles.add(pregunta);
    }

    public void agregarPreguntaIntermedia(Pregunta pregunta) {
        preguntasIntermedias.add(pregunta);
    }

    public void agregarPreguntaDificil(Pregunta pregunta) {
        preguntasDificiles.add(pregunta);
    }

    // Método para obtener una pregunta aleatoria de un nivel específico
    public Pregunta obtenerPreguntaAleatoria(String dificultad) {
        Random random = new Random();
        switch (dificultad.toLowerCase()) {
            case "facil":
                return preguntasFaciles.get(random.nextInt(preguntasFaciles.size()));
            case "intermedia":
                return preguntasIntermedias.get(random.nextInt(preguntasIntermedias.size()));
            case "dificil":
                return preguntasDificiles.get(random.nextInt(preguntasDificiles.size()));
            default:
                return null;
        }
    }

}
