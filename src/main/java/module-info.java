module com.example.javamy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javamy to javafx.fxml;
    exports com.example.javamy;
    exports com.example.javamy.Syntax.VSE_VSE;
    opens com.example.javamy.Syntax.VSE_VSE to javafx.fxml;
}