package sample.ui.widget;/**
 * Created by wdphu on 2018/4/6.
 */

import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import sample.entity.ChannelListAllVO;
import sample.entity.ChannelListOwnerVO;
import sample.mock.ListChannelMock;
import sample.ui.table.ChannelListAll;
import sample.ui.table.ChannelListOwner;

public class ListChannel{
    public VBox getListChannel() {
        ListChannelMock listChannelMock = new ListChannelMock();

        VBox vBox = new VBox(10);

        TabPane tabPane = new TabPane();
        Tab tabListAll = new Tab("所有通道");   //tab--channel list all
        Tab tabListOwner = new Tab("我的通道"); //tab--channel list owner
        tabPane.getTabs().addAll(tabListOwner, tabListAll);

        //channel list all
        ChannelListAll channelListAll = new ChannelListAll();
        TableView<ChannelListAllVO> tableViewListAll = channelListAll.getListChannelAll();
        tableViewListAll.setItems(listChannelMock.getChannelListAllData());

        ScrollPane scrollPaneAll = new ScrollPane();
        scrollPaneAll.setContent(tableViewListAll);
        tabListAll.setContent(scrollPaneAll);

        //channel list owner
        ChannelListOwner channelListOwner = new ChannelListOwner();
        TableView<ChannelListOwnerVO> tableViewListOwner = channelListOwner.getListChannelOwner();
        tableViewListOwner.setItems(listChannelMock.getChannelListOwnerData());

        ScrollPane scrollPaneOwner = new ScrollPane();
        scrollPaneOwner.setContent(tableViewListOwner);
        tabListOwner.setContent(scrollPaneOwner);

        vBox.getChildren().add(tabPane);

        return vBox;
    }
}
