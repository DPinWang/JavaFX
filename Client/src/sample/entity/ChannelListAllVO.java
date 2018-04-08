package sample.entity;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by wdphu on 2018/4/5.
 */
public class ChannelListAllVO {
    private StringProperty id = new SimpleStringProperty();
    private StringProperty channelId = new SimpleStringProperty();
    private StringProperty ownerAddr = new SimpleStringProperty();
    private StringProperty partnAddr = new SimpleStringProperty();
    private StringProperty ownerPay = new SimpleStringProperty();
    private StringProperty partnPay = new SimpleStringProperty();

    public ChannelListAllVO() {

    }

    public ChannelListAllVO(String id, String channelId, String ownerAddr, String partnAddr, String ownerPay, String partnPay) {
        this.setId(id);
        this.setChannelId(channelId);
        this.setOwnerAddr(ownerAddr);
        this.setPartnAddr(partnAddr);
        this.setOwnerPay(ownerPay);
        this.setPartnPay(partnPay);
    }

    public String getId() {
        return this.id.get();
    }

    public void setId(String id) {
        this.id.set(id);
    }

    public String getChannelId() {
        return this.channelId.get();
    }

    public void setChannelId(String channelId) {
        this.channelId.set(channelId);
    }

    public String getOwnerAddr() {
        return this.ownerAddr.get();
    }

    public void setOwnerAddr(String ownerAddr) {
        this.ownerAddr.set(ownerAddr);
    }

    public String getPartnAddr() {
        return this.partnAddr.get();
    }

    public void setPartnAddr(String partnAddr) {
        this.partnAddr.set(partnAddr);
    }

    public String getOwnerPay() {
        return this.ownerPay.get();
    }

    public void setOwnerPay(String ownerPay) {
        this.ownerPay.set(ownerPay);
    }

    public String getPartnPay() {
        return this.partnPay.get();
    }

    public void setPartnPay(String partnPay) {
        this.partnPay.set(partnPay);
    }

    public StringProperty getIdProperty(){
        return this.id;
    }

    public StringProperty getChannelIdProperty(){
        return this.id;
    }

    public StringProperty getOwnerAddrProperty(){
        return this.id;
    }

    public StringProperty getPartnAddrProperty(){
        return this.id;
    }

    public StringProperty getOwnerPayProperty(){
        return this.id;
    }

    public StringProperty getPartnPayProperty(){
        return this.id;
    }
}
