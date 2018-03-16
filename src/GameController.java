import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GameController {
	
	@FXML
	TextField textfield1;
	@FXML
	Label label1;
	@FXML
	Label label2;
	
	private NumberGame f;
	
	private int upperbound = 100;
	
	public void handleGuess(ActionEvent event) {
		try {
			int text = Integer.parseInt(textfield1.getText().trim());
			boolean tf = f.guess(text);
			label1.setText(f.getMessage());
			if (tf) initialize();
			label2.setText(f.getCount()+ "");

		} catch (NumberFormatException ex) {
			textfield1.setText("Invalid input");
			textfield1.setStyle("-fx-text-fill: red;");
		}
	}
	
	public void handleClear(ActionEvent event) {
		textfield1.clear();
		textfield1.setStyle("-fx-text-fill: black;");
		
	}
	
	public void initialize() {
		f = new FirstGame(upperbound);
	}
	
	
	

}
