package sample;

import com.sun.javafx.robot.impl.FXRobotHelper;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;
import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        primaryStage.setTitle("Hello World");

        AnchorPane anchorPane = new AnchorPane();

        Button button1 = new Button("hello world");
        button1.setLayoutX(100);
        button1.setLayoutY(100);


        Button cmItem2 = new Button("Save Image");
        cmItem2.setOnAction((ActionEvent e) -> {
            FileChooser fileChooser1 = new FileChooser();
            fileChooser1.setTitle("Save Image");
            File file = fileChooser1.showSaveDialog(primaryStage);
            System.out.println("depin " + file.getAbsolutePath());
            if (file != null) {
                try {
                    file = new File("hello.txt");
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });

        anchorPane.getChildren().add(button1);
        anchorPane.getChildren().add(cmItem2);
        primaryStage.setScene(new Scene(anchorPane, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    private String getFilePath(Stage primaryStage){
        final FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(primaryStage);
        if (file != null) {
            System.out.println("hello world");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getPath());
        }
        return file.getPath();
    }

}
