package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;



public class Login_Controller {

    @FXML
    private Button Reg_button;

    @FXML
    private Button loginButton;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    private User admin = new User("","");

    static Stage stage = new Stage();
    @FXML
    void login(ActionEvent event) throws IOException {
        System.out.println(admin.getUserName());
        String username = this.username.getText();
        String password = this.password.getText();
        User adminCheck = new User(username, password);
        boolean i = false;
        String usern = adminCheck.getUserName();
        String pass = adminCheck.getPassword();
        if (this.admin.getUserName().equals(usern) && this.admin.getPassword().equals(pass)) {
            Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("Static_Menu.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Admin Panel");
            stage.setScene(scene);
            Main.stage.close();
            stage.show();
            i = true;
        } else {
            i = false;
        }

        if (i) {
           // JOptionPane.showMessageDialog((Component)null, "Welcome to Admin Panel", "Welcome", 1);
        } else {
           // JOptionPane.showMessageDialog((Component)null, "Your id or password Wrong!", "Wrong Information", 0);
        }
    }

    @FXML
    void showRegisterStage(MouseEvent event) {

    }

}
