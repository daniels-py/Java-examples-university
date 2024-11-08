package vista;

import javax.swing.*;
import java.awt.*;

public class UserView {
    private JFrame frame;
    private JLabel nameLabel;
    private JLabel emailLabel;

    public UserView() {
        // Inicializa el marco (ventana)
        frame = new JFrame("Información del Usuario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Inicializa las etiquetas
        nameLabel = new JLabel();
        emailLabel = new JLabel();

        // Cambiar el texto de las etiquetas a algo vacío por ahora
        nameLabel.setHorizontalAlignment(JLabel.CENTER);
        emailLabel.setHorizontalAlignment(JLabel.CENTER);

        // Layout con GridLayout (2 filas, 1 columna)
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1)); // 2 filas, 1 columna
        panel.add(nameLabel);
        panel.add(emailLabel);

        // Agrega el panel al marco (ventana)
        frame.add(panel);

        // Establecer que la ventana sea visible
        frame.setVisible(true);
    }

    // Método para actualizar la vista con el nombre y correo del usuario
    public void displayUser(String name, String email) {
        nameLabel.setText("Nombre: " + name);
        emailLabel.setText("Correo: " + email);
    }
}
