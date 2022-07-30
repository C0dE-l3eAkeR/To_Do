package com.example.demo3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    static Stage stage ;
   // @Override
    /*public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Static_Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }*/

   //
   // @Override

    public Main() {
    }

    public void start(Stage primaryStage) throws IOException  {
        try {
            stage = primaryStage;
            BorderPane root = (BorderPane) FXMLLoader.load(this.getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            scene.getWindow();
          //  scene.getStylesheets().add(this.getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }
    public static void main(String[] args) {
        launch(args);
    }
}