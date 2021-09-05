package sample;

import javafx.fxml.FXML;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public TextField textGetName;
    public Button btnGetName;
    public Label lblTotalCoins;
    public Label lblAmountBet;
    public Label lblDice;
    public double totalCoins = 100;
    public TextField textCoinsBet;
    public int lastNum = 0;
    public int currentNum = 0;
    public double currentBet;
    public int timesPlayed;
    public Label lblLastNumber;
    public double betWin;
    public Button btnRollDice;
    public Button btnBet;
    public Button btnHigher;
    public Button btnLower;

    public void printName(ActionEvent actionEvent) {
        String name = textGetName.getText();
        System.out.println(name);
    }

    public void bet(ActionEvent actionEvent) {
        btnBet.setDisable(false);
        double num = Double.parseDouble(textCoinsBet.getText());
        currentBet = num;
        if (timesPlayed == 0) {
            btnLower.setDisable(true);
            btnHigher.setDisable(true);
        }
        else if (currentBet > totalCoins || currentBet < 0) {
            System.out.println("Invalid Number");
        }
        else {
            lblTotalCoins.setText(Double.toString(totalCoins));
            lblAmountBet.setText(Double.toString(num));
            textCoinsBet.clear();
            btnBet.setDisable(true);
            btnLower.setDisable(false);
            btnHigher.setDisable(false);
        }
        if (timesPlayed != 1) {
            currentNum = 0;
            lblDice.setText("");
            lblLastNumber.setText(Integer.toString(lastNum));
        }
    }

    public void roll(ActionEvent actionEvent) {
        if (timesPlayed == 0) {
            lastNum = (int) (Math.random() * 6 + 1);
            lblLastNumber.setText(Integer.toString(lastNum));
            timesPlayed = 1;
            btnRollDice.setDisable(true);
            btnBet.setDisable(false);
        }
    }

    public void higher(ActionEvent actionEvent) {
        btnHigher.setDisable(false);
        currentNum = (int) (Math.random() * 6 + 1);
        lblDice.setText(Integer.toString(currentNum));
        if (currentNum > lastNum) {
            betWin = currentBet * 2;
            totalCoins += betWin;
            System.out.println("You won");
            lblTotalCoins.setText(Double.toString(totalCoins));
        }
        else if (currentNum < lastNum) {
            totalCoins -= currentBet;
            if (totalCoins == 0) {
                System.out.println("Game over");
                System.exit(0);
            }
            System.out.println("You lost");
            lblTotalCoins.setText(Double.toString(totalCoins));
            }
        else if (currentNum == lastNum) {
            totalCoins -= currentBet;
            if (totalCoins == 0) {
                System.out.println("Game over");
                System.exit(0);
            }
            System.out.println("You lost");
        }
        timesPlayed += 1;
        lastNum = currentNum;
        btnHigher.setDisable(true);
        btnBet.setDisable(false);
        btnLower.setDisable(true);
        }

    public void lower(ActionEvent actionEvent) {
        btnLower.setDisable(false);
        currentNum = (int) (Math.random() * 6 + 1);
        lblDice.setText(Integer.toString(currentNum));
        if (currentNum > lastNum) {
            totalCoins -= currentBet;
            System.out.println("You lost");
            if (totalCoins == 0) {
                System.out.println("Game over");
                System.exit(0);
            }
            lblTotalCoins.setText(Double.toString(totalCoins));
        }
        else if (currentNum < lastNum) {
            betWin = currentBet * 2;
            totalCoins += betWin;
            System.out.println("You won");
            lblTotalCoins.setText(Double.toString(totalCoins));
        }
        else if (currentNum == lastNum) {
            System.out.println("You lost");
            totalCoins -= currentBet;
            if (totalCoins == 0) {
                System.out.println("Game over");
                System.exit(0);
            }
            lblTotalCoins.setText(Double.toString(totalCoins));
        }
        timesPlayed += 1;
        lastNum = currentNum;
        btnHigher.setDisable(true);
        btnBet.setDisable(false);
        btnLower.setDisable(true);
        }
}