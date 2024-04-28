package org.example.playdices;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;
import java.util.Random;

public class TelaInicialController {

    @FXML
    private Label dicevalue;
    @FXML
    private Label dicevalue2;
    @FXML
    private Label soma;
    @FXML
    private Label result;
    @FXML
    private ImageView dice1;
    @FXML
    private ImageView dice2;

    public void rollDice(ActionEvent event){
        Random random = new Random();
        int diceres = random.nextInt(6)+1;
        int diceres2 = random.nextInt(6)+1;
        int sum = diceres+diceres2;
        dicevalue.setText(String.valueOf(diceres));
        dicevalue2.setText(String.valueOf(diceres2));
        soma.setText("Soma dos números: "+sum);

        dice1.setImage(new Image(
                        getClass().getResourceAsStream("img/dado"+diceres+".png")
                ));
        dice2.setImage(new Image(
                        getClass().getResourceAsStream("img/dado"+diceres2+".png")
                ));

        if (sum == 7){
            result.setText("Parabéns, você venceu!");
            result.setStyle("-fx-background-color: #5cb85c;");
        }else {
            result.setText("Que pena, você perdeu!");
            result.setStyle("-fx-background-color: #d9534f;");
        }

    }

}
