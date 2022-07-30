package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Static_Menu_Controller {

    @FXML
    private Button Important;

    @FXML
    private StackPane Menu;

    @FXML
    private Pane My_Day_View;

    @FXML
    private Button My_day;

    @FXML
    private Button Planned;

    @FXML
    private StackPane Suggestion;

    @FXML
    private Button Tasks;

    @FXML
    private FlowPane flowpane;

    @FXML
    private BorderPane borderpane;

    @FXML
    void Impt(ActionEvent event) {
       Parent root = null;
        try {
            root= FXMLLoader.load(getClass().getResource("Important.fxml"));
        } catch (Exception e) {
        }
       borderpane.setCenter(root);
    }

    @FXML
    void MyDay(ActionEvent event) throws IOException {

        Parent root = null;
        try {
            root= FXMLLoader.load(getClass().getResource("My_Day.fxml"));
            root.getScene().getWindow();
        } catch (Exception e) {
        }
        borderpane.setCenter(root);
    }

    @FXML
    void plnd(ActionEvent event) {

    }

    @FXML
    void tasks(ActionEvent event) {
       Parent root = null;
        try {
            root= FXMLLoader.load(getClass().getResource("tasks.fxml"));

        } catch (Exception e) {
        }
        borderpane.setCenter(root);
    }

}
