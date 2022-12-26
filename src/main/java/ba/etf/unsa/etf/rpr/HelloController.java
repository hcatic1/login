package ba.etf.unsa.etf.rpr;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;

public class HelloController {
    public TextField fieldUsername;
    public PasswordField filedPassword;
    @FXML
    private Label welcomeText;
    @FXML
    public void initialize(){
        fieldUsername.getStyleClass().add("poljeNijeIspravno");
        fieldUsername.textProperty().addListener(new ChangeListener<String>(){
            @Override
            public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                if(fieldUsername.getText().trim().isEmpty()){
                    fieldUsername.getStyleClass().removeAll("poljeJeIspravno");
                    fieldUsername.getStyleClass().add("poljeNijeIspravno");
                }
                else{
                    fieldUsername.getStyleClass().removeAll("poljeNijeIspravno");
                    fieldUsername.getStyleClass().add("poljeJeIspravno");
                }
            }
        });
    }
    @FXML
    protected void buttonClick() throws IOException {
        if(fieldUsername.getText().trim().isEmpty()){
            fieldUsername.getStyleClass().removeAll("poljeJeIspravno");
            fieldUsername.getStyleClass().add("poljeNijeIspravno");
            return;
        }
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("noviprozor.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), USE_COMPUTED_SIZE, USE_COMPUTED_SIZE);
        NoviprozorController noviprozor = fxmlLoader.getController();
        noviprozor.labela.setText(noviprozor.labela.getText() + fieldUsername.getText());
        stage.setTitle("Novi prozor!");
        stage.setScene(scene);
        stage.show();
    }
}