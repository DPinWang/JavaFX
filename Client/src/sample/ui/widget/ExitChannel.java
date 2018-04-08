package sample.ui.widget;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import sample.controller.UserChannelInfoController;

/**
 * Created by wdphu on 2018/4/8.
 */
public class ExitChannel {
    public VBox getExitChannelWeight(UserChannelInfoController controller){
        VBox vBox = new VBox(10);

        HBox hBox = new HBox(10);

        Text textJoinTitle = new Text("退出通道");
        //搜索框
        Text textInputLable = new Text("输入通道ID：");
        TextField textFieldInputAddress = new TextField("input address here");
        //TODO need input a double var
        Button buttonCreateChannel = new Button("退出通道");
        buttonCreateChannel.setOnAction(event -> {
            controller.onExitButtonAction();
        });
        hBox.getChildren().addAll(textInputLable, textFieldInputAddress, buttonCreateChannel);

        vBox.getChildren().add(hBox);
        return vBox;
    }
}
