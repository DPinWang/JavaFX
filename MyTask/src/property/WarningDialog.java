package property;

import javafx.scene.control.Alert;

/**
 * Created by wdphu on 2018/4/19.
 */
public class WarningDialog {
    public static Alert getAlert(String cmd){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText(cmd);
        return alert;
    }
}
