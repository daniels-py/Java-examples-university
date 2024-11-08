import controlador.UserController;
import modelo.User;
import vista.UserView;

public class Main {

    public static void main(String[] args) {
        // Crear el modelo (User)
        User model = new User();

        // Crear la vista (UserView) - Ya no es necesario en la consola, pero en JavaFX es una aplicación completa
        UserView view = new UserView();

        // Crear el controlador (UserController)
        UserController controller = new UserController(model, view);

        // Establecer el nombre y el correo del usuario
        controller.setUserName("John Doe");
        controller.setUserEmail("johndoe@example.com");

        // Actualizar la vista con los datos del usuario
        controller.updateUserView();  // Aquí se actualizará la interfaz gráfica con el nombre y correo
    }
}
