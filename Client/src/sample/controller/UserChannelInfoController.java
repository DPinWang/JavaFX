package sample.controller;

/**
 * Created by wdphu on 2018/4/8.
 */
public class UserChannelInfoController {
    public void onCreateButtonAction(){
        System.out.println("onCreateButtonAction");
    }

    public void onJoinButtonAction(){
        System.out.println("onJoinButtonAction");
    }

    public void onExitButtonAction(){
        System.out.println("onExitButtonAction");
    }

    public String getUserBalance(String address){
        return "i am balance total";
    }

    public String getUserBalanceCurrent(String address){
        return "i am balance current";
    }

    public String getUserBalanceChannel(String address){
        return "i am balance channel";
    }
}
