package com.example.assignment_2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
    private ListView<Videogame> listView;

    @FXML
    private Label priceLabel;

    @FXML
    private TextField priceTextField;

    @FXML
    private Label titleLabel;

    @FXML
    private TextField titleTextField;

    private Videogame currentGame;

    private ObservableList<Videogame> gameList = FXCollections.observableArrayList();

    @FXML
    void addGame(ActionEvent event) {
        String titleFromUser = titleTextField.getText();
        double priceFromUser = Double.parseDouble(priceTextField.getText());
        String companyFromUser = companyTextField.getText();
        gameList.add(new Videogame(titleFromUser,priceFromUser,companyFromUser));

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gameList.add(new Videogame("Final Fantasy 7",70,"Square"));
        gameList.add(new Videogame("Final Fantasy 12", 50, "Square"));
        gameList.add(new Videogame("Resident Evil 4", 20, "Capcom"));
        gameList.add(new Videogame("Super Mario Bros 3",80, "Nintendo"));
        listView.setItems(gameList);
        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Videogame>() {
            @Override
            public void changed(ObservableValue<? extends Videogame> observableValue, Videogame s, Videogame t1) {

                currentGame = listView.getSelectionModel().getSelectedItem();
                titleLabel.setText("Title: "+ currentGame.getTitle());
                priceLabel.setText("Price "+ currentGame.getPrice());
                companyLabel.setText("Company: " + currentGame.getCompany());
                imageView.setImage(currentGame.getImage());



            }
        });

    }



}
