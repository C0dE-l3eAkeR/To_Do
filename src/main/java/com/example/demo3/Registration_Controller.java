package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;

import static com.example.demo3.Main.stage;

public class Registration_Controller {
    @FXML
    private TextField tfUserName;
    @FXML
    private PasswordField passField;
    @FXML
    private PasswordField C_passField;
    @FXML
    private Button btnSubmit;

    String path = "/Users/rafiqulbari/IdeaProjects/To_Do/Registration.txt";

    void reset()
    {
        passField.setText("");
        C_passField.setText("");
    }


    @FXML
    void btnSubmitClicked(ActionEvent event) throws IOException {

        if((passField.getText()).equals(C_passField.getText())) {
            try {
                FileWriter writer = new FileWriter(path, true);
                //BufferedWriter bw = new BufferedWriter(writer);
                PrintWriter output = new PrintWriter(writer);
                output.println(tfUserName.getText() + " " + passField.getText());

                output.close();
                writer.close();


                Main.stage.show();


                // set Alert
                Alert a = new Alert(Alert.AlertType.CONFIRMATION, "Registration Successful!", ButtonType.OK);
                a.show();



            } catch (IOException ex) {
                System.out.println(ex.fillInStackTrace());
            }


        }
        else
        {
            Alert a = new Alert(Alert.AlertType.ERROR, "Confirm Password is not match.Please try again!", ButtonType.OK);
            a.show();
            reset();

        }





//            try {
//                FileWriter writer = new FileWriter(path, true);
//                //BufferedWriter bw = new BufferedWriter(writer);
//                PrintWriter output = new PrintWriter(writer);
//                output.println(tfUserName.getText() + " " + passField.getText());
//
//                output.close();
//                writer.close();
//
//            } catch (IOException ex) {
//                System.out.println(ex.fillInStackTrace());
//            }
        }


}



