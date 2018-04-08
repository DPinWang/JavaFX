package sample.entity;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by wdphu on 2018/4/6.
 */
public class ChannelListOwnerVO {
    private StringProperty id = new SimpleStringProperty();
    private StringProperty channelId = new SimpleStringProperty();
    private StringProperty ownerPay = new SimpleStringProperty();
    private StringProperty partnAddr = new SimpleStringProperty();

    public ChannelListOwnerVO(){}

    public ChannelListOwnerVO(String id, String channelId, String ownerPay, String partnAddr){
        this.setId(id);
        this.setChannelId(channelId);
        this.setOwnerPay(ownerPay);
        this.setPartnAddr(partnAddr);
    }

    public String getId(){
        return this.id.get();
    }

    public void setId(String id){
        this.id.set(id);
    }

    public String getChannelId(){
        return this.channelId.get();
    }

    public void setChannelId(String channelId){
        this.channelId.set(channelId);
    }

    public String getOwnerPay(){
        return this.ownerPay.get();
    }

    public void setOwnerPay(String ownerPay){
        this.ownerPay.set(ownerPay);
    }

    public String getPartnAddr(){
        return this.partnAddr.get();
    }

    public void setPartnAddr(String partnAddr){
        this.partnAddr.set(partnAddr);
    }

    public StringProperty getIdProperty() {
        return id;
    }

    public StringProperty getChannelIdProperty() {
        return channelId;
    }

    public StringProperty getOwnerPayProperty() {
        return ownerPay;
    }

    public StringProperty getPartnAddrProperty() {
        return partnAddr;
    }
}
