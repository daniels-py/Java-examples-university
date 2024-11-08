package com.concurso;

public class Concurso {

    private BancoPreguntas bancoPreguntas;
    private  int nivelActual;
    private  int puntaje;

    // contructor
    public Concurso(BancoPreguntas bancoPreguntas) {
        this.bancoPreguntas = bancoPreguntas;
        this.nivelActual = 1;
        this.puntaje = 0;

    }

    // metodos para la dificultad segun el nivel inicial

    private  String obtenerDificultad(){

        switch (nivelActual){
            case 1:
                return  "facil";
            case 2:
                return  "intermedia";
            case 3:
                return "dificil";
            default:
                return "facil";
        }
    }

    // metodo para obtener una pregunta del  nivel actual

    public Pregunta obtenerPreguntaActual(){
        return  bancoPreguntas.obtenerPreguntaAleatoria(obtenerDificultad());
    }

    // metodo para verificar las respuesta del concursante

    public boolean verificarRespuestas(Pregunta pregunta, String respuesta){
        if(pregunta.verificarRespuesta(respuesta)){
            puntaje+= 1000;
            avanzarNivel();
            return  true;
        }
        return false;
    }

    // metodo para poder avanzar de nivel

    public void  avanzarNivel(){
        if (nivelActual < 3){
            nivelActual++;
        }
    }



    public int getNivelActual() {
        return nivelActual;
    }

    public int getPuntaje() {
        return puntaje;
    }
}
