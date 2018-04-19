package dialog;

import javafx.application.Platform;
import javafx.scene.control.Alert;

import java.util.Scanner;

/**
 * Created by wdphu on 2018/4/19.
 */
public class ReadCmd extends Thread{
    private String cmd;

    @Override
    public void run(){
        cmd = "test";
        startRead();
    }

    public String getCmd(){
        System.out.println("cmd : " + cmd);
        return cmd;
    }
    public void startRead(){
        Scanner scanner = new Scanner(System.in);
        String cmd = null;

        while ((cmd = scanner.nextLine()) != null){
            System.out.println("cmd is " + cmd);
            switch (cmd){
                case "add":
                    this.cmd = cmd;
                    Property.cmd.set("add");
                    onAdd();
                    System.out.println("cmd is " + cmd);
                    break;
                case "sub":
                    this.cmd = cmd;
                    Property.cmd.set("sub");
                    onAdd();
                    break;
                case "mul":
                    Property.cmd.set("mul");
                    break;
                case "div":
                    Property.cmd.set("div");
                    break;
                default:
                    Property.cmd.set("cmd");
                    break;
            }
        }
    }

    public void onAdd(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Alert alert = Dialog.newAlert(cmd);
                alert.showAndWait();
            }
        });
    }
}
