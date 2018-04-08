package sample.ui.widget;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sample.controller.UserChannelInfoController;

/**
 * Created by wdphu on 2018/4/8.
 */
public class ChannelInfo {
    public VBox getChannelInfo(Stage primaryStage, UserChannelInfoController controller){
        VBox vBoxAll = new VBox(10);

        //first half
        CreateChannel createChannel = new CreateChannel();
        VBox vBoxCreateChannel = createChannel.getCreateChannelWeight(controller);

        JoinChannel joinChannel = new JoinChannel();
        VBox vBoxJoinChannel = joinChannel.getJoinChannelWeight(controller);

        ExitChannel exitChannel = new ExitChannel();
        VBox vBoxExitChannel = exitChannel.getExitChannelWeight(controller);

        vBoxAll.getChildren().addAll(vBoxCreateChannel, vBoxJoinChannel, vBoxExitChannel);

        //second half
        VBox vBox = new VBox(10);
        vBoxAll.getChildren().add(vBox);

        ListChannel listChannel = new ListChannel();
        vBox.getChildren().add(listChannel.getListChannel());

        return vBoxAll;
    }
}
