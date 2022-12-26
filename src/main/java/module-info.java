module com.example.demo2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens ba.etf.unsa.etf.rpr to javafx.fxml;
    exports ba.etf.unsa.etf.rpr;
}