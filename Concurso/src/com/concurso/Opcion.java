package com.concurso;

public class Opcion {
    private String texto;
    private boolean esCorrecta;


    public Opcion(String texto, boolean esCorrecta) {
        this.texto = texto;
        this.esCorrecta = esCorrecta;
    }


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public boolean esCorrecta() {
        return esCorrecta;
    }

    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }
}
