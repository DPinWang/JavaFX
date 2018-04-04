package sample;/**
 * Created by wdphu on 2018/4/4.
 */

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InfoUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private String priKey;
    private String pubKey;
    private String address;
    private String priKeyBase64;
    private String pubKeyBase64;

    //    private Address address;

    public InfoUI(){
        this.address = "this is an address";
    }

    public InfoUI(String priKey, String pubKey){
        this.priKey = priKey;
        this.pubKey = pubKey;
        this.address = "this is an address";
    }


    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox(5); //the outermost layer
        vBox.setAlignment(Pos.CENTER);

        GridPane gridPaneTop = new GridPane();//the first half container
        gridPaneTop.setAlignment(Pos.CENTER);
        GridPane gridPaneBottom = new GridPane(); //the second half container
        gridPaneBottom.setLayoutY(150);
        gridPaneBottom.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(gridPaneTop, gridPaneBottom);

        //the first half container
        Text textFirst = new Text("用户信息");
        gridPaneTop.add(textFirst, 0, 0);

        Text textFirstAddressLable = new Text("当前地址：");
        gridPaneTop.add(textFirstAddressLable, 0, 2);
        Text textFirstAddress = new Text(address);
        gridPaneTop.add(textFirstAddress, 1, 2);

        Text textFirstBalanceLable = new Text("总余额：");
        gridPaneTop.add(textFirstBalanceLable, 1, 4);
        Text textFirstBalance = new Text(getUserBalance(address));
        gridPaneTop.add(textFirstBalance, 2, 4);

        Text textFirstBalanceCurrentLable = new Text("本地余额：");
        gridPaneTop.add(textFirstBalanceCurrentLable, 1, 6);
        Text textFirstBalanceCurrent = new Text(getUserBalanceCurrent(address));
        gridPaneTop.add(textFirstBalanceCurrent, 2, 6);

        Text textFirstBalanceChannelLable = new Text("通道余额：");
        gridPaneTop.add(textFirstBalanceChannelLable, 1, 8);
        Text textFirstBalanceChannel = new Text(getUserBalanceChannel(address));
        gridPaneTop.add(textFirstBalanceChannel, 2, 8);

        //the first half container
        Text textSecond = new Text("通道相关：");
        gridPaneBottom.add(textSecond, 0, 0);

        Button buttonCreate = new Button("创建通道");
        buttonCreate.setOnAction(event -> {
            Controller.infoOnButtonCreateAction();
        });
        gridPaneBottom.add(buttonCreate, 1, 2);

        Button buttonJoin = new Button("加入通道");
        buttonJoin.setOnAction(event -> {
            Controller.infoOnButtonJoinAction();
        });
        gridPaneBottom.add(buttonJoin, 1, 4);

        Button buttonCancel = new Button("撤销通道");
        buttonCancel.setOnAction(event -> {
            Controller.infoOnButtonCancelAction();
        });
        gridPaneBottom.add(buttonCancel, 1, 6);

        Scene scene = new Scene(vBox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String getUserBalance(String address){
        return "i am balance total";
    }

    private String getUserBalanceCurrent(String address){
        return "i am balance current";
    }

    private String getUserBalanceChannel(String address){
        return "i am balance channel";
    }
}
