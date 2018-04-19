package property;/**
 * Created by wdphu on 2018/4/19.
 */

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.concurrent.Task;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {
    StringProperty func = new SimpleStringProperty();

    public String getFunc() {
        return func.get();
    }

    public StringProperty funcProperty() {
        return func;
    }

    public void setFunc(String func) {
        this.func.set(func);
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox vBox = new VBox(10);
        Text text = new Text();
        text.textProperty().bind(func);
        vBox.getChildren().add(text);

        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                System.out.println("blah blah...");

                Scanner scanner = new Scanner(System.in);
                String cmd = null;

                while ((cmd = scanner.nextLine()) != null){
                    System.out.println("cmd is " + cmd);
                    switch (cmd){
                        case "add":
                            setFunc("add");
                            updateMessage("add");
                            break;
                        case "sub":
                            setFunc("sub");
                            updateMessage("sub");
                            break;
                        case "mul":
                            updateMessage("mul");
                            break;
                        case "div":
                            updateMessage("div");
                            break;
                        default:
                            break;
                    }
                }

                System.out.println("end blah blah...");
                return null;
            }
        };

        new Thread(task).start();

//        text.textProperty().bind(task.messageProperty());
        Scene scene = new Scene(vBox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
