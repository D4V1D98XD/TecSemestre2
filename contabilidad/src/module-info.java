module contabilidad {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
	requires javafx.base;

    exports application;
    exports controllers;

    opens application to javafx.fxml;
    opens controllers to javafx.fxml;
    opens gui to javafx.fxml;
}
