package com.lab1.e1_json_datnt_c2306l.Controller;

import com.example.demo.FxmlLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class MenuController implements Initializable {
    @FXML public TableView category;
    @FXML public Menu fileMenu;
    @FXML public MenuItem mCategory;
    @FXML private BorderPane mainBorderPane;
    @FXML Pane viewPane;

    @FXML public void OpenCategory(ActionEvent event) {
        FxmlLoader fxmlLoader = new FxmlLoader();
        viewPane = fxmlLoader.getViewPane("/com/lab1/e1_json_datnt_c2306l/Category.fxml");
        mainBorderPane.setCenter(viewPane);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    public void OpenProductList(ActionEvent actionEvent) {
        FxmlLoader fxmlLoader = new FxmlLoader();
        viewPane = fxmlLoader.getViewPane("/com/lab1/e1_json_datnt_c2306l/Product.fxml");
        mainBorderPane.setCenter(viewPane);
    }
}
