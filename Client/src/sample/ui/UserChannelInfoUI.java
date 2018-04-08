package sample.ui;/**
 * Created by wdphu on 2018/4/8.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;
import sample.controller.UserChannelInfoController;
import sample.ui.widget.ChannelInfo;
import sample.ui.widget.UserInfo;

public class UserChannelInfoUI extends Application {
    String priKey;
    String pubKey;
    String address;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TabPane tabPane = new TabPane();
        Tab tabUserInfo = new Tab("用户钱包");
        Tab tabChannelInfo = new Tab("通道信息");
        tabPane.getTabs().addAll(tabUserInfo, tabChannelInfo);

        //tab of 用户钱包
        UserInfo userInfo = new UserInfo();
        UserChannelInfoController userChannelInfoController = new UserChannelInfoController();
        tabUserInfo.setContent(userInfo.getUserInfo(address, userChannelInfoController));

        //tab of 用户通道
        ChannelInfo channelInfo = new ChannelInfo();
        tabChannelInfo.setContent(channelInfo.getChannelInfo(primaryStage, userChannelInfoController));

        Scene scene = new Scene(tabPane, 1200, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
