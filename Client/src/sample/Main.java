package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("登录");

        VBox vBox = new VBox(20);
        vBox.setAlignment(Pos.CENTER);

        Button buttonRead = new Button("导入秘钥");
        buttonRead.setOnAction(event -> {
            Controller.mainOnButtonReadAction();
        });

        Button buttonCreate = new Button("生成秘钥");
        buttonCreate.setOnAction(event -> {
            Controller.mainOnButtonCreateAction();
        });

        HBox hBox1 = new HBox(10);
        hBox1.setAlignment(Pos.CENTER);
        hBox1.getChildren().add(buttonRead);

        HBox hBox2 = new HBox(10);
        hBox2.setAlignment(Pos.CENTER);
        hBox2.getChildren().add(buttonCreate);

        vBox.getChildren().addAll(hBox1, hBox2);

        Scene scene = new Scene(vBox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
