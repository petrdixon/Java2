package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    public TextArea upperTextField;

    @FXML
    private TextField lowerTextField;

    @FXML
    private Button doneButton;

    @FXML
    public void initialize(){
        lowerTextField.requestFocus();
    }

    @FXML
    void inputUserText() {

        lowerTextField.requestFocus();
        upperTextField.appendText(lowerTextField.getText() + "\n");
        lowerTextField.clear();


        System.out.println(lowerTextField.getText());
    }

}
