package sample;

import javafx.application.Application;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 *
 * @author Administrator
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label=new Label("my table view");
        //定义一个tableview
        TableView<TestTableView> tableView=new TableView<>();

        //定义不同多个tablecolumn
        TableColumn<TestTableView,String> nameColumn=new TableColumn<TestTableView,String>("name");
        TableColumn<TestTableView,String> name2Column=new TableColumn<TestTableView,String>("name2");
        TableColumn<TestTableView,String> firstColumn=new TableColumn<TestTableView,String>("firstName");
        TableColumn<TestTableView,String> LastColumn=new TableColumn<TestTableView,String>("lastName");
        TableColumn<TestTableView,String> ageColumn=new TableColumn<TestTableView,String>("agee");

        //把列和bean对应起来，这个很重要，两种写法，第一种
//        firstColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<TestTableView, String>, ObservableValue<String>>() {
//
//            @Override
//            public ObservableValue<String> call(TableColumn.CellDataFeatures<TestTableView, String> param) {
//                return param.getValue().getFirstProperty();
//            }
//        });

        //testing
        TableColumn<TestTableView, String> testColumn = new TableColumn<TestTableView, String>("agee");
        testColumn.setCellValueFactory(new PropertyValueFactory<TestTableView, String>("agee"));

        //第二种用法
        firstColumn.setCellValueFactory(new PropertyValueFactory<TestTableView,String>("firstName"));
        LastColumn.setCellValueFactory(new PropertyValueFactory<TestTableView,String>("lastName"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<TestTableView,String>("agee"));
        System.out.println("zhge s  ces hide ");

//        LastColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<TestTableView, String>, ObservableValue<String>>() {
//
//            @Override
//            public ObservableValue<String> call(TableColumn.CellDataFeatures<TestTableView, String> param) {
//                return param.getValue().getLastProperty();
//            }
//        });
//        ageColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<TestTableView, String>, ObservableValue<String>>() {
//            @Override
//            public ObservableValue<String> call(TableColumn.CellDataFeatures<TestTableView, String> param) {
//                return param.getValue().getAgeProperty();
//            }
//        });
        nameColumn.getColumns().addAll(firstColumn,testColumn);
        name2Column.getColumns().addAll(LastColumn, ageColumn);
        tableView.getColumns().addAll(nameColumn, name2Column);

        ObservableList<TestTableView> list=FXCollections.observableArrayList(
                new TestTableView("zhang", "san", "45", "test"),
                new TestTableView("li", "si", "34", "test"),
                new TestTableView("wang", "wu", "78", "test")
        );

        tableView.setItems(list);

        HBox hBox=new HBox();
        hBox.getChildren().add(tableView);
        HBox.setHgrow(tableView, Priority.ALWAYS);

        VBox vBox=new VBox();
        vBox.getChildren().addAll(label,hBox);


        StackPane root = new StackPane();
        root.getChildren().add(vBox);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
