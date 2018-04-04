package sample;/**
 * Created by wdphu on 2018/4/4.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CreateChannelUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox(10);
        HBox hBoxFirst = new HBox();    //HBox First
        hBoxFirst.setAlignment(Pos.CENTER);
        HBox hBoxSecond = new HBox();   //HBox Second
        hBoxSecond.setAlignment(Pos.CENTER);
        HBox hBoxThird = new HBox();    //HBox Third
        hBoxThird.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(hBoxFirst, hBoxSecond, hBoxThird);

        //HBox First
        Text text = new Text("己方输入金额：");

        //HBox Second

        //HBox Third

    }
}
