module administartion_desk {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens administartion_desk to javafx.fxml;
    exports administartion_desk;
}
