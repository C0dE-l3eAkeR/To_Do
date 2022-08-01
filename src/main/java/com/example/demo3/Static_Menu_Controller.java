package com.example.demo3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.*;

import java.io.IOException;
import java.time.LocalDate;


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
    private ComboBox<String> taskType;

    @FXML
    private TextField addTask;

    @FXML
    private Button Tasks;

    @FXML
    private FlowPane flowpane;

    @FXML
    private BorderPane borderpane;

    @FXML
    private DatePicker taskDate;

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
        String task = (String)this.addTask.getText();
        System.out.println(task);

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

    @FXML
    private DatePicker TaskDate;

    static ObservableList<Tasks> taskList = FXCollections.observableArrayList();
    @FXML
    void handleAddTask(KeyEvent event){

            if (  event.getCode().equals(KeyCode.ENTER)) {

               // taskList.add(new Tasks("acx","xas",new Date(2323223232L)));

               String task = (String)this.addTask.getText();
               System.out.println(task);
               String taskType = (String)this.taskType.getValue();
               Date TaskDate = Date.valueOf((LocalDate)this.taskDate.getValue());
             //  taskList.add(new Tasks(task,"bal",new Date(2323223232L)));
               System.out.println(taskList.get(0).getTaskName());
            }
    }



    public void initialize(URL arg0, ResourceBundle arg1) {
        List<String> types = Arrays.asList("Task","Groceries");
        for(String t:types)
        this.taskType.getItems().add(t);

    }

}
