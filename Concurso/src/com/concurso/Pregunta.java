package com.concurso;

import java.util.List;

public class Pregunta {

    private String enunciado;
    private List<Opcion> opciones;

    // contructor para los enunciado y las opcciones

    public Pregunta(String enunciado, List<Opcion> opciones) {
        this.enunciado = enunciado;
        this.opciones = opciones;
    }

    // configurar y almacernar enunciados y opcciones

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public List<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<Opcion> opciones) {
        this.opciones = opciones;
    }

    // Método para verificar si una opción es correcta
    public boolean verificarRespuesta(String textoRespuesta) {
        for (Opcion opcion : opciones) {
            if (opcion.getTexto().equalsIgnoreCase(textoRespuesta)) {
                return opcion.esCorrecta();
            }
        }
        return false;
    }

}
