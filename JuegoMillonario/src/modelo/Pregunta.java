package modelo;

import java.util.List;

public class Pregunta {
    private String pregunta;  // Texto de la pregunta.
    private List<Opcion> opciones;  // Lista de opciones disponibles para la pregunta.
    private int respuestaCorrecta;  // Índice de la opción correcta.

    // Constructor
    public Pregunta(String pregunta, List<Opcion> opciones, int respuestaCorrecta) {
        this.pregunta = pregunta;
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    // Getters y Setters
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public List<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<Opcion> opciones) {
        this.opciones = opciones;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(int respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
}
