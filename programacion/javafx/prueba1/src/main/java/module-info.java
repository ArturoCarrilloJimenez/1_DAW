module jv.prueba1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens jv.prueba1 to javafx.fxml;
    exports jv.prueba1;
}