module com.example.dsasociety {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.dsasociety to javafx.fxml;
    exports com.example.dsasociety;
}