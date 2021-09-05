package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public TextField textGetName;
    public TextField textGetAge;
    public TextField textGetGender;
    public Button btnCreateFriend;
    public ListView<Friend> friendList = new ListView<>();
    public Label lblAge;
    public Label lblName;
    public Label lblGender;
    public Button btnDeleteFriend;

    public void createFriend(ActionEvent actionEvent) {
        Friend newFriend = new Friend(textGetName.getText(), Integer.parseInt(textGetAge.getText()), textGetGender.getText());
        friendList.getItems().add(newFriend);
        textGetName.clear();
        textGetAge.clear();
        textGetGender.clear();
    }

    public void displayFriend(MouseEvent mouseEvent) {
        Friend newFriend;
        newFriend = friendList.getSelectionModel().getSelectedItem();
        lblName.setText(newFriend.getName());
        lblAge.setText(Integer.toString(newFriend.getAge()));
        lblGender.setText(newFriend.getGender());
    }

    public void deleteFriend(ActionEvent actionEvent) {
        Friend temp;
        temp = friendList.getSelectionModel().getSelectedItem();
        friendList.getItems().remove(temp);
        lblName.setText("");
        lblAge.setText("");
        lblGender.setText("");
    }
}
