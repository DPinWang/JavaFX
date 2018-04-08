package sample.ui.table;

import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.entity.ChannelListOwnerVO;
import sample.mock.ListChannelMock;

/**
 * Created by wdphu on 2018/4/6.
 */
public class ChannelListOwner {
    public TableView<ChannelListOwnerVO> getListChannelOwner(){
        TableView<ChannelListOwnerVO> tableView = new TableView<>();
        //添加列名
        TableColumn<ChannelListOwnerVO, String> idColumn = new TableColumn<ChannelListOwnerVO, String>("序号");
        TableColumn<ChannelListOwnerVO, String> chanelIdColumn = new TableColumn<ChannelListOwnerVO, String>("通道ID");
        TableColumn<ChannelListOwnerVO, String> partnAddrColumn = new TableColumn<ChannelListOwnerVO, String>("对方地址");
        TableColumn<ChannelListOwnerVO, String> ownerPayColumn = new TableColumn<ChannelListOwnerVO, String>("参与金额");
        //联系列和数据bean
        idColumn.setCellValueFactory(new PropertyValueFactory<ChannelListOwnerVO, String>("id"));
        chanelIdColumn.setCellValueFactory(new PropertyValueFactory<ChannelListOwnerVO, String>("channelId"));
        ownerPayColumn.setCellValueFactory(new PropertyValueFactory<ChannelListOwnerVO, String>("ownerPay"));
        partnAddrColumn.setCellValueFactory(new PropertyValueFactory<ChannelListOwnerVO, String>("partnAddr"));
        //编辑表头
        tableView.getColumns().addAll(idColumn, chanelIdColumn, ownerPayColumn, partnAddrColumn);
        //添加数据
        ListChannelMock listChannelMock = new ListChannelMock();
        ObservableList<ChannelListOwnerVO> data = listChannelMock.getChannelListOwnerData();
        tableView.setItems(data);

        return tableView;
    }
}
