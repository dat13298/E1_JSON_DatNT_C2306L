module com.lab1.e1_json_datnt_c2306l {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;

    opens com.lab1.e1_json_datnt_c2306l to javafx.fxml;
//    exports com.lab1.e1_json_datnt_c2306l;
    exports com.lab1.e1_json_datnt_c2306l.Controller;
    opens com.lab1.e1_json_datnt_c2306l.Controller to javafx.fxml;
    exports com.example.demo;
    opens com.example.demo to javafx.fxml;
}