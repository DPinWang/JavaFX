package sample;/**
 * Created by wdphu on 2018/4/15.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextFiledTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextField textField = new TextField();
        Button button = new Button("button");
        button.setOnAction(event -> {
            String str = textField.getText();
            if(str == null){
                System.out.println("null");
            }
            else if(str.equals("")){
                System.out.println("空");
            }
            else{
                System.out.println("other: " + str);
            }

        });
        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(textField, button);

        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
