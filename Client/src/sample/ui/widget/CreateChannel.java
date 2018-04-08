package sample.ui.widget;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import sample.controller.UserChannelInfoController;

/**
 * Created by wdphu on 2018/4/8.
 */
public class CreateChannel {
    public VBox getCreateChannelWeight(UserChannelInfoController controller){
        VBox vBox = new VBox(10);

        HBox hBoxFirst = new HBox();    //HBox First
        hBoxFirst.setAlignment(Pos.CENTER);
        HBox hBoxSecond = new HBox();   //HBox Second
        hBoxSecond.setAlignment(Pos.CENTER);
        HBox hBoxThird = new HBox();    //HBox Third
        hBoxThird.setAlignment(Pos.CENTER);

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
            controller.onCreateButtonAction();
        });
        hBoxThird.getChildren().add(buttonCreateChannel);

        HBox hBoxAll = new HBox(10);
        hBoxAll.getChildren().addAll(hBoxFirst, hBoxSecond, hBoxThird);
        vBox.getChildren().add(hBoxAll);

        return vBox;
    }
}
