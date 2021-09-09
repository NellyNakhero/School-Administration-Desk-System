module administartion_desk {
    requires javafx.controls;
    requires javafx.fxml;

    opens administartion_desk to javafx.fxml;
    exports administartion_desk;
}
