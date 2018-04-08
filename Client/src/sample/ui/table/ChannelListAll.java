package sample.ui.table;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.entity.ChannelListAllVO;

/**
 * Created by wdphu on 2018/4/6.
 */
public class ChannelListAll {
    public TableView<ChannelListAllVO> getListChannelAll(){
        //展示所有已有通道相关信息
        TableView<ChannelListAllVO> tableView = new TableView<>();
        //添加列名
        TableColumn<ChannelListAllVO, String> idColumn = new TableColumn<ChannelListAllVO, String>("序号");
        TableColumn<ChannelListAllVO, String> chanelIdColumn = new TableColumn<ChannelListAllVO, String>("通道ID");
        TableColumn<ChannelListAllVO, String> ownerAddrColumn = new TableColumn<ChannelListAllVO, String>("地址1");
        TableColumn<ChannelListAllVO, String> ownerPayColumn = new TableColumn<ChannelListAllVO, String>("金额1");
        TableColumn<ChannelListAllVO, String> partnAddrColumn = new TableColumn<ChannelListAllVO, String>("地址2");
        TableColumn<ChannelListAllVO, String> partnPayColumn = new TableColumn<ChannelListAllVO, String>("金额2");
        TableColumn<ChannelListAllVO, String> ownerColumn = new TableColumn<ChannelListAllVO, String>("所有者");
        TableColumn<ChannelListAllVO, String> partnColumn = new TableColumn<ChannelListAllVO, String>("加入者");
        //联系列和数据bean
        idColumn.setCellValueFactory(new PropertyValueFactory<ChannelListAllVO, String>("id"));
        chanelIdColumn.setCellValueFactory(new PropertyValueFactory<ChannelListAllVO, String>("channelId"));
        ownerAddrColumn.setCellValueFactory(new PropertyValueFactory<ChannelListAllVO, String>("ownerAddr"));
        ownerPayColumn.setCellValueFactory(new PropertyValueFactory<ChannelListAllVO, String>("ownerPay"));
        partnAddrColumn.setCellValueFactory(new PropertyValueFactory<ChannelListAllVO, String>("partnAddr"));
        partnPayColumn.setCellValueFactory(new PropertyValueFactory<ChannelListAllVO, String>("partnPay"));
        //编辑表头
        ownerColumn.getColumns().addAll(ownerAddrColumn, ownerPayColumn);
        partnColumn.getColumns().addAll(partnAddrColumn, partnPayColumn);
        tableView.getColumns().addAll(idColumn, chanelIdColumn, ownerColumn, partnColumn);

        return tableView;
    }
}
