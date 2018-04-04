package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.security.acl.Group;

/*
 *Java FX 页面间的跳转
 */
public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox(8);
        Scene scene = new Scene(vBox, 400, 300);

        Text text = new Text("123");
        Button button = new Button("button");
        button.setOnAction(event -> {
            System.out.println("button pressed");
            InfoUI infoUI = new InfoUI(text.getText());
            infoUI.start(new Stage());
            primaryStage.hide();
        });

        vBox.getChildren().add(button);
        vBox.getChildren().add(text);
        vBox.setAlignment(Pos.BOTTOM_CENTER);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}