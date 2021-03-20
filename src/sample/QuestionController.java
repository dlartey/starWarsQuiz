package sample;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;


public class QuestionController implements Initializable {

	public static int counter = 0;


	@FXML
	private AnchorPane rootPane2;
	@FXML
	private AnchorPane rootPane3;
	@FXML
	private AnchorPane rootPane4;
	@FXML
	private AnchorPane rootPane5;
	@FXML
	private AnchorPane rootPane6;
	@FXML
	private AnchorPane rootPane7;
	@FXML
	private TextField textBox1;
	@FXML
	private TextField textBox2;
	@FXML
	private TextField textBox3;
	@FXML
	private TextField textBox4;
	@FXML
	private TextField textBox5;
	@FXML
	private Label myMessage;
	@FXML
	private Label myMessage2;
	@FXML
	private Label myMessage3;
	@FXML
	private Label myMessage4;
	@FXML
	private Label myMessage5;
	@FXML
	private Label finalScore;
	@FXML
	private AnchorPane rootPane;



	@FXML void loadSecond(ActionEvent event) throws IOException {
		rootPane2 = FXMLLoader.load(getClass().getResource("Question1.fxml"));
		rootPane.getChildren().setAll(rootPane2);

	}

	@FXML
	private void loadThird(ActionEvent event) throws IOException {
		AnchorPane rootPane3 = FXMLLoader.load(getClass().getResource("Question2.fxml"));
		rootPane2.getChildren().setAll(rootPane3);
	}



	@FXML
	private void loadFourth(ActionEvent event) throws IOException {
		AnchorPane rootPane4 = FXMLLoader.load(getClass().getResource("Question3.fxml"));
		rootPane3.getChildren().setAll(rootPane4);
	}
	@FXML
	private void loadFifth(ActionEvent event) throws IOException {
		AnchorPane rootPane5 = FXMLLoader.load(getClass().getResource("Question4.fxml"));
		rootPane4.getChildren().setAll(rootPane5);
	}
	@FXML
	private void loadSixth(ActionEvent event) throws IOException {
		AnchorPane rootPane6 = FXMLLoader.load(getClass().getResource("Question5.fxml"));
		rootPane5.getChildren().setAll(rootPane6);
	}
	@FXML
	private void loadSeventh(ActionEvent event) throws IOException {
		AnchorPane rootPane7 = FXMLLoader.load(getClass().getResource("Final.fxml"));
		rootPane6.getChildren().setAll(rootPane7);
	}


	@FXML
	private void buttonPressed(ActionEvent event) throws IOException {
		String Q1Answer = textBox1.getText();
		String [] CharacterArray = new String[5];
		CharacterArray[0] = "yoda";
		CharacterArray[1] = "luke skywalker";
		CharacterArray[2] = "han solo";
		CharacterArray[3] = "obi wan kenobi";
		CharacterArray[4] = "r2d2";
		if (Q1Answer.equalsIgnoreCase(CharacterArray[0])) {
			myMessage.setTextFill(Color.web("#00E13C"));
			myMessage.setText("Correct!");
			textBox1.setEditable(false);
			counter++;
		}else {
			myMessage.setTextFill(Color.web("#FF0000"));
			myMessage.setText("Incorrect!");
			textBox1.setEditable(false);
		}
	}
	@FXML
	private void buttonPressed2(ActionEvent event) throws IOException {
		String Q2Answer = textBox2.getText();
		String [] CharacterArray = new String[5];
		CharacterArray[0] = "yoda";
		CharacterArray[1] = "luke skywalker";
		CharacterArray[2] = "han solo";
		CharacterArray[3] = "obi wan kenobi";
		CharacterArray[4] = "r2d2";
		if (Q2Answer.equalsIgnoreCase(CharacterArray[1])) {
			myMessage2.setTextFill(Color.web("#00E13C"));
			myMessage2.setText("Correct!");
			textBox2.setEditable(false);
			counter++;
		}else {
			myMessage2.setTextFill(Color.web("#FF0000"));
			myMessage2.setText("Incorrect!");
			textBox2.setEditable(false);
		}
	}
	@FXML
	private void buttonPressed3(ActionEvent event) throws IOException {
		String Q3Answer = textBox3.getText();
		String [] CharacterArray = new String[5];
		CharacterArray[0] = "yoda";
		CharacterArray[1] = "luke skywalker";
		CharacterArray[2] = "han solo";
		CharacterArray[3] = "obi wan kenobi";
		CharacterArray[4] = "r2d2";
		if (Q3Answer.equalsIgnoreCase(CharacterArray[2])) {
			myMessage3.setTextFill(Color.web("#00E13C"));
			myMessage3.setText("Correct!");
			textBox3.setEditable(false);
			counter++;
		}else {
			myMessage3.setTextFill(Color.web("#FF0000"));
			myMessage3.setText("Incorrect!");
			textBox3.setEditable(false);
		}
	}
	@FXML
	private void buttonPressed4(ActionEvent event) throws IOException {
		String Q4Answer = textBox4.getText();
		String [] CharacterArray = new String[5];
		CharacterArray[0] = "yoda";
		CharacterArray[1] = "luke skywalker";
		CharacterArray[2] = "han solo";
		CharacterArray[3] = "obi wan kenobi";
		CharacterArray[4] = "r2d2";
		if (Q4Answer.equalsIgnoreCase(CharacterArray[3])) {
			myMessage4.setTextFill(Color.web("#00E13C"));
			myMessage4.setText("Correct!");
			textBox4.setEditable(false);
			counter++;
		}else {
			myMessage4.setTextFill(Color.web("#FF0000"));
			myMessage4.setText("Incorrect!");
			textBox4.setEditable(false);
		}
	}
	@FXML
	private void buttonPressed5(ActionEvent event) throws IOException {
		String Q5Answer = textBox5.getText();
		String [] CharacterArray = new String[5];
		CharacterArray[0] = "yoda";
		CharacterArray[1] = "luke skywalker";
		CharacterArray[2] = "han solo";
		CharacterArray[3] = "obi wan kenobi";
		CharacterArray[4] = "r2d2";
		if (Q5Answer.equalsIgnoreCase(CharacterArray[4])) {
			myMessage5.setTextFill(Color.web("#00E13C"));
			myMessage5.setText("Correct!");
			textBox5.setEditable(false);
			counter++;
		}
		else {
			myMessage5.setTextFill(Color.web("#FF0000"));
			myMessage5.setText("Incorrect!");
			textBox5.setEditable(false);
		}
	}
	@FXML
	public void buttonPressed6(ActionEvent event) throws IOException {
		finalScore.setText(Integer.toString(counter));

	}




	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}




}



