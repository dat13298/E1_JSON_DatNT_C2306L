package com.example.demo;

import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class FxmlLoader {
    private Pane view;

    public Pane getViewPane(String fileNamePane) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fileNamePane));
            view = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return view;
    }
}
