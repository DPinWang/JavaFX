package dialog;

import javafx.scene.control.Alert;

/**
 * Created by wdphu on 2018/4/19.
 */
public class Dialog {
    public static Alert newAlert(String info){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(info);
        return alert;
    }
}
