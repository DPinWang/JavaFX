package sample;/**
 * Created by wdphu on 2018/4/14.
 */

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class Dialog extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //test button on dialog
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setOnCloseRequest(event -> {
            System.out.println("i am closed");
        });
        alert.showAndWait();

        primaryStage.show();
    }
}
