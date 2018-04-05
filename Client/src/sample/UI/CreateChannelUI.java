package sample.UI;/**
 * Created by wdphu on 2018/4/4.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.Controller.CreateChannelController;


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
        Text textOwnerPayLable = new Text("己方输入金额：");
        TextField textFieldOwnerPay = new TextField("0.00");
        //TODO 设置输入为数字和小数点组合
        hBoxFirst.getChildren().addAll(textOwnerPayLable, textFieldOwnerPay);

        //HBox Second
        Text textOtherPayLable = new Text("对方输入金额：");
        TextField textFieldOtherPay = new TextField("0.00");
        hBoxSecond.getChildren().addAll(textOtherPayLable, textFieldOtherPay);

        //HBox Third
        Button buttonCreateChannel = new Button("创建通道");
        buttonCreateChannel.setOnAction(event -> {
            CreateChannelController.onButtonCreateChannelAction();
        });
        hBoxThird.getChildren().add(buttonCreateChannel);

        Scene scene = new Scene(vBox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
