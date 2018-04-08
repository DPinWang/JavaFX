package sample.mock;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.entity.ChannelListAllVO;
import sample.entity.ChannelListOwnerVO;

/**
 * Created by wdphu on 2018/4/8.
 */
public class ListChannelMock {
    public ObservableList<ChannelListAllVO> getChannelListAllData(){
        ObservableList<ChannelListAllVO> result = FXCollections.observableArrayList(
                new ChannelListAllVO("1", "111", "123", "234", "1.1", "2.2"),
                new ChannelListAllVO("1", "222", "133", "233", "1.2", "1.2")
        );
        return result;
    }

    public ObservableList<ChannelListOwnerVO> getChannelListOwnerData(){
        ObservableList<ChannelListOwnerVO> result = FXCollections.observableArrayList(
                new ChannelListOwnerVO("1", "111", "123",  "2.2"),
                new ChannelListOwnerVO("1", "222", "133", "1.2")
        );
        return result;
    }
}
