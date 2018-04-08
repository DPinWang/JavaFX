package sample.ui.widget;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import sample.controller.UserChannelInfoController;

/**
 * Created by wdphu on 2018/4/8.
 */
public class UserInfo {
    public VBox getUserInfo(String address, UserChannelInfoController infoController){
        VBox vBox = new VBox(10);

        GridPane gridPane = new GridPane();

        Text textFirst = new Text("用户信息");
        gridPane.add(textFirst, 0, 0);

        Text textFirstAddressLable = new Text("当前地址：");
        gridPane.add(textFirstAddressLable, 0, 2);
        Text textFirstAddress = new Text(address);
        gridPane.add(textFirstAddress, 1, 2);

        Text textFirstBalanceLable = new Text("总余额：");
        gridPane.add(textFirstBalanceLable, 1, 4);
        Text textFirstBalance = new Text(infoController.getUserBalance(address));
        gridPane.add(textFirstBalance, 2, 4);

        Text textFirstBalanceCurrentLable = new Text("本地余额：");
        gridPane.add(textFirstBalanceCurrentLable, 1, 6);
        Text textFirstBalanceCurrent = new Text(infoController.getUserBalanceCurrent(address));
        gridPane.add(textFirstBalanceCurrent, 2, 6);

        Text textFirstBalanceChannelLable = new Text("通道余额：");
        gridPane.add(textFirstBalanceChannelLable, 1, 8);
        Text textFirstBalanceChannel = new Text(infoController.getUserBalanceChannel(address));
        gridPane.add(textFirstBalanceChannel, 2, 8);

        vBox.getChildren().add(gridPane);
        return vBox;
    }
}
