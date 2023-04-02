package com.example.assignment_2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class VideogameController implements Initializable {

    @FXML
    private Button addGameButton;

    @FXML
    private Label companyLabel;

    @FXML
    private TextField companyTextField;

    @FXML
    private ImageView imageView;

    @FXML
    private ListView<String> listView;

    @FXML
    private Label priceLabel;

    @FXML
    private TextField priceTextField;

    @FXML
    private Label titleLabel;

    @FXML
    private TextField titleTextField;

    @FXML
    void addGame(ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> wordsList = FXCollections.observableArrayList();
        wordsList.add(new Videogame("Final Fantasy 7",70,"Square").getTitle());
        wordsList.add(new Videogame("Final Fantasy 12", 50, "Square").getTitle());
        wordsList.add(new Videogame("Resident Evil 4", 20, "Capcom").getTitle());
        wordsList.add(new Videogame("Super Mario Bros 3",80, "Nintendo").getTitle());
        listView.setItems(wordsList);

    }

    public void setVideogame(Store store)
    {



    }

}
