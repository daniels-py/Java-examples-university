package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class BancoPreguntas {
    private List<Pregunta> banco;

    // Constructor que inicializa la lista de preguntas
    public BancoPreguntas() {
        banco = new ArrayList<>();
        cargarPreguntas();  // Carga las preguntas al inicio
    }

    // Método para agregar una pregunta al banco
    public void agregarPregunta(Pregunta p) {
        banco.add(p);
    }

    // Método para cargar algunas preguntas predeterminadas al banco
    private void cargarPreguntas() {
        // Pregunta 1: Capital de Francia
        List<Opcion> opciones1 = new ArrayList<>();
        opciones1.add(new Opcion("París", true));
        opciones1.add(new Opcion("Londres", false));
        opciones1.add(new Opcion("Roma", false));
        opciones1.add(new Opcion("Berlín", false));
        banco.add(new Pregunta("¿Cuál es la capital de Francia?", opciones1, 0));

        // Pregunta 2: Capital de España
        List<Opcion> opciones2 = new ArrayList<>();
        opciones2.add(new Opcion("Madrid", true));
        opciones2.add(new Opcion("Barcelona", false));
        opciones2.add(new Opcion("Valencia", false));
        opciones2.add(new Opcion("Sevilla", false));
        banco.add(new Pregunta("¿Cuál es la capital de España?", opciones2, 0));

        // Pregunta 3: Autor de 'Don Quijote'
        List<Opcion> opciones3 = new ArrayList<>();
        opciones3.add(new Opcion("Miguel de Cervantes", true));
        opciones3.add(new Opcion("Gabriel García Márquez", false));
        opciones3.add(new Opcion("Mario Vargas Llosa", false));
        opciones3.add(new Opcion("Carlos Fuentes", false));
        banco.add(new Pregunta("¿Quién escribió 'Don Quijote'?", opciones3, 0));

        // Pregunta 4: Elemento químico con el símbolo 'O'
        List<Opcion> opciones4 = new ArrayList<>();
        opciones4.add(new Opcion("Oxígeno", true));
        opciones4.add(new Opcion("Oro", false));
        opciones4.add(new Opcion("Osmio", false));
        opciones4.add(new Opcion("Oganesón", false));
        banco.add(new Pregunta("¿Qué elemento químico tiene el símbolo 'O'?", opciones4, 0));

        // Pregunta 5: Inventor de la bombilla
        List<Opcion> opciones5 = new ArrayList<>();
        opciones5.add(new Opcion("Thomas Edison", true));
        opciones5.add(new Opcion("Nikola Tesla", false));
        opciones5.add(new Opcion("Alexander Graham Bell", false));
        opciones5.add(new Opcion("Albert Einstein", false));
        banco.add(new Pregunta("¿Quién inventó la bombilla?", opciones5, 0));

        // Pregunta 6: Año en que llegó el hombre a la Luna
        List<Opcion> opciones6 = new ArrayList<>();
        opciones6.add(new Opcion("1969", true));
        opciones6.add(new Opcion("1975", false));
        opciones6.add(new Opcion("1967", false));
        opciones6.add(new Opcion("1971", false));
        banco.add(new Pregunta("¿En qué año llegó el hombre a la Luna?", opciones6, 0));

        // Pregunta 7: Continente con más población
        List<Opcion> opciones7 = new ArrayList<>();
        opciones7.add(new Opcion("Asia", true));
        opciones7.add(new Opcion("África", false));
        opciones7.add(new Opcion("Europa", false));
        opciones7.add(new Opcion("América", false));
        banco.add(new Pregunta("¿Cuál es el continente con más población?", opciones7, 0));

        // Pregunta 8: Capital de Japón
        List<Opcion> opciones8 = new ArrayList<>();
        opciones8.add(new Opcion("Tokio", true));
        opciones8.add(new Opcion("Osaka", false));
        opciones8.add(new Opcion("Seúl", false));
        opciones8.add(new Opcion("Pekín", false));
        banco.add(new Pregunta("¿Cuál es la capital de Japón?", opciones8, 0));

        // Pregunta 9: ¿Quién pintó la Mona Lisa?
        List<Opcion> opciones9 = new ArrayList<>();
        opciones9.add(new Opcion("Leonardo da Vinci", true));
        opciones9.add(new Opcion("Pablo Picasso", false));
        opciones9.add(new Opcion("Vincent van Gogh", false));
        opciones9.add(new Opcion("Claude Monet", false));
        banco.add(new Pregunta("¿Quién pintó la Mona Lisa?", opciones9, 0));

        // Pregunta 10: ¿Cuál es el animal terrestre más grande?
        List<Opcion> opciones10 = new ArrayList<>();
        opciones10.add(new Opcion("Elefante africano", true));
        opciones10.add(new Opcion("Rhinoceros", false));
        opciones10.add(new Opcion("Jirafa", false));
        opciones10.add(new Opcion("Hipopótamo", false));
        banco.add(new Pregunta("¿Cuál es el animal terrestre más grande?", opciones10, 0));
    }

    // Método para obtener una pregunta aleatoria usando Collections.shuffle
    public Pregunta obtenerPreguntaAleatoria() {
        Collections.shuffle(banco);  // Baraja las preguntas
        return banco.get(0);  // Retorna la primera pregunta después de barajar
    }

    // Método para obtener una pregunta aleatoria usando Arrays.sort
    public Pregunta obtenerPreguntaAleatoriaConSort() {
        Random random = new Random();
        banco.sort((p1, p2) -> random.nextInt(3) - 1);  // Ordena las preguntas aleatoriamente
        return banco.get(0);  // Retorna la primera pregunta después de ordenar
    }
}
