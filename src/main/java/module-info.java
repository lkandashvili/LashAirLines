module com.example.java_lasha_kandashvili {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.java_lasha_kandashvili to javafx.fxml;
    exports com.example.java_lasha_kandashvili;
}