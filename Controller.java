package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    //labels, buttons, and textfields//
    public Label lblUserChoice;
    public Button btnLockIn;
    public TextField textUserInput;
    public Label lblComputersChoice;
    public Label lblWinOrLose;


    public void Choose(ActionEvent actionEvent) {
        //method to get user input from the textfields, get a randomized answer from the computer, and test to see who wins
        String userChoice = textUserInput.getText();
        Integer randomNum = (int) (Math.random() * 3 + 1);
        if (userChoice.equals("Rock")){
            lblUserChoice.setText("Rock");
            if (randomNum.equals(1)){
                lblComputersChoice.setText("Rock");
                lblWinOrLose.setText(("Draw"));
            }
            else if (randomNum.equals(2)){
                lblComputersChoice.setText("Paper");
                lblWinOrLose.setText("Loss");
            }
            else if (randomNum.equals(3)){
                lblComputersChoice.setText("Scissors");
                lblWinOrLose.setText("Win");
            }
        }
        else if (userChoice.equals("Paper")){
            lblUserChoice.setText("Paper");
            if (randomNum.equals(1)){
                lblComputersChoice.setText("Rock");
                lblWinOrLose.setText(("Win"));
            }
            else if (randomNum.equals(2)){
                lblComputersChoice.setText("Paper");
                lblWinOrLose.setText("Draw");
            }
            else if (randomNum.equals(3)){
                lblComputersChoice.setText("Scissors");
                lblWinOrLose.setText("Loss");
            }
        }
        else if (userChoice.equals("Scissors")){
            lblUserChoice.setText("Scissors");
            if (randomNum.equals(1)){
                lblComputersChoice.setText("Rock");
                lblWinOrLose.setText(("Loss"));
            }
            else if (randomNum.equals(2)){
                lblComputersChoice.setText("Paper");
                lblWinOrLose.setText("Win");
            }
            else if (randomNum.equals(3)){
                lblComputersChoice.setText("Scissors");
                lblWinOrLose.setText("Draw");
            }
        }
    }

}
