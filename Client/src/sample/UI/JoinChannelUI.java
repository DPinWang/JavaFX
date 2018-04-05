package sample.UI;/**
 * Created by wdphu on 2018/4/4.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JoinChannelUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox(10);

        //first field container
        HBox hBoxFirst = new HBox(10);
        hBoxFirst.setAlignment(Pos.CENTER_LEFT);

        //second field container
        HBox hBoxSecond = new HBox(10);
        GridPane  gridPaneSecond = new GridPane();
        hBoxSecond.getChildren().add(gridPaneSecond);

        //third field container
        HBox hBoxThird = new HBox(10);
        //TODO it will be contain a line

        //fourth filed container
        HBox hBoxFourth = new HBox(10);
        hBoxFourth.setAlignment(Pos.CENTER);


        //title
        Text textJoinTitle = new Text("加入通道");
        hBoxFirst.getChildren().add(textJoinTitle);

        //搜索框
        Text textInputLable = new Text("输入地址：");
        TextField textFieldInputAddress = new TextField("input address here");
        //TODO need input a double var
        hBoxSecond.getChildren().addAll(textInputLable, textFieldInputAddress);

        //展示所有已有通道相关信息

    }
}
