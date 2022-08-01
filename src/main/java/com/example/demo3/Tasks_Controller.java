package com.example.demo3;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

import static com.example.demo3.Static_Menu_Controller.taskList;

public class Tasks_Controller {


        @FXML
        private TextArea addTask;

        @FXML
        private ListView<Tasks> taskListView;

    public void initialize(URL arg0, ResourceBundle arg1) {
        //taskListView.setItems(taskList);
        System.out.println("1");
        System.out.println(taskList.get(0).getTaskDate()) ;
    }



}
