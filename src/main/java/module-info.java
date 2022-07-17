module example.javafxlogin {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    opens example.javafxlogin to javafx.fxml;
    exports example.javafxlogin;
}