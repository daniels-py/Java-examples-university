package controlador;

import vista.UserView;
import  modelo.User;

public class UserController {
    // atributos de modelo y vista

    private  User model;
    private UserView view;

    // contructor
    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    // actulizar usuario
    public void setUserName(String name) {
        model.setName(name);
    }

    // actulizar correo
    public void setUserEmail(String email) {
        model.setEmail(email);
    }

    // actulizar nombre y correo en vista usuario
    public void updateUserView() {
        view.displayUser(model.getName(), model.getEmail());
    }
}
