package Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorController {
            public TextField txtDisplay;
            public Button btn1;
            public Button btn2;
            public Button btn3;
            public Button btn4;
            public Button btn5;
            public Button btn6;
            public Button btn7;
            public Button btn8;
            public Button btn9;
            public Button btn0;
            public Button btnClear;
            public Button btnPlus;
            public Button btnEqual;
            public Button btnMultiplication;
            public Button btnDevide;
            public Button btnMinus;
    public AnchorPane root;


    float data=0;
            int operation=-1;



            public void handleButtonOnAction(ActionEvent actionEvent) {

                if(actionEvent.getSource()==btn1){
                    txtDisplay.setText(txtDisplay.getText()+"1");
                }
                else if(actionEvent.getSource()==btn2){
                    txtDisplay.setText(txtDisplay.getText()+"2");
                }
                else if(actionEvent.getSource()==btn3){
                    txtDisplay.setText(txtDisplay.getText()+"3");
                }
                else if(actionEvent.getSource()==btn4){
                    txtDisplay.setText(txtDisplay.getText()+"4");
                }
                else if(actionEvent.getSource()==btn5){
                    txtDisplay.setText(txtDisplay.getText()+"5");
                }
                else if(actionEvent.getSource()==btn6){
                    txtDisplay.setText(txtDisplay.getText()+"6");
                }
                else if(actionEvent.getSource()==btn7){
                    txtDisplay.setText(txtDisplay.getText()+"7");
                }
                else if(actionEvent.getSource()==btn8){
                    txtDisplay.setText(txtDisplay.getText()+"8");
                }
                else if(actionEvent.getSource()==btn9){
                    txtDisplay.setText(txtDisplay.getText()+"9");
                }else if(actionEvent.getSource()==btn0){
                    txtDisplay.setText(txtDisplay.getText()+"0");
                }
                else if(actionEvent.getSource()==btnClear){
                    txtDisplay.setText("");
                }
                else if(actionEvent.getSource()==btnPlus){
                   data=Float.parseFloat(txtDisplay.getText());
                   operation=1;
                   txtDisplay.setText("");
                }
                else if(actionEvent.getSource()==btnMinus){
                    data=Float.parseFloat(txtDisplay.getText());
                    operation=2;
                    txtDisplay.setText("");
                }
                else if(actionEvent.getSource()==btnMultiplication){
                    data=Float.parseFloat(txtDisplay.getText());
                    operation=3;
                    txtDisplay.setText("");
                }
                else if(actionEvent.getSource()==btnDevide){
                    data=Float.parseFloat(txtDisplay.getText());
                    operation=4;
                    txtDisplay.setText("");
                }else if(actionEvent.getSource()==btnEqual){

                    Float secondOperand=Float.parseFloat(txtDisplay.getText());
                    switch (operation)
                    {
                        case 1:
                            Float answer=data+secondOperand;
                            txtDisplay.setText(String.valueOf(answer));break;

                        case 2:
                            answer=data-secondOperand;
                            txtDisplay.setText(String.valueOf(answer));break;
                        case 3:
                            answer=data*secondOperand;
                            txtDisplay.setText(String.valueOf(answer));break;
                        case 4:
                            try{
                                answer=data/secondOperand;

                                if(secondOperand==0)
                                {
                                    txtDisplay.setText("INFINITY");
                                }
                                else {
                                    txtDisplay.setText(String.valueOf(answer));
                                }
                                break;
                            }
                            catch (Exception e)
                            {
                                txtDisplay.setText("Error");
                            }
                          break;

                    }

                }
            }


    public void btnCloseOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage)root.getScene().getWindow();

        stage.close();

    }

    public void btnMinOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage)root.getScene().getWindow();
        stage.setIconified(true);
    }
}
