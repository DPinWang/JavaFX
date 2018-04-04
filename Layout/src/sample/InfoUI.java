package sample;/**
 * Created by wdphu on 2018/4/4.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InfoUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private String string;

    public InfoUI(){}

    public InfoUI(String string){
        this.string = string;
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox(20);
        HBox hBox1 = new HBox(10);
        hBox1.setAlignment(Pos.CENTER);
        Text text1 = new Text("text1");
        hBox1.getChildren().add(text1);

        HBox hBox2 = new HBox(10);
        hBox2.setAlignment(Pos.CENTER);
        Text text2 = new Text("text2");
        hBox2.getChildren().add(text2);

        Button button = new Button("button");
        button.setOnAction(event -> {
            System.out.println(string);
        });
        HBox hBox3 = new HBox(10);
        hBox3.setAlignment(Pos.CENTER);
        hBox3.getChildren().add(button);

        vBox.getChildren().addAll(hBox1, hBox2, hBox3);

        Scene scene = new Scene(vBox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
