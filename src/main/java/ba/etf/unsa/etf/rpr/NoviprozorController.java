package ba.etf.unsa.etf.rpr;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class NoviprozorController {
    public Label labela;

    public void buttonZatvori(ActionEvent actionEvent) {
        Stage stage = (Stage) labela.getScene().getWindow();
        stage.close();
    }
}
