module com.alinares.colorselectorfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.alinares.colorselectorfx to javafx.fxml;
    exports com.alinares.colorselectorfx;
}
