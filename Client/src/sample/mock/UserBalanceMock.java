package sample.mock;

/**
 * Created by wdphu on 2018/4/8.
 */
public class UserBalanceMock {
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
