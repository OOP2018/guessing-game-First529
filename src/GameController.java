import java.util.Observable;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GameController extends Observable{
	
	@FXML
	TextField textfield1;
	@FXML
	Label label1;
	@FXML
	Label label2;
	
	private Counter counter;
	
	private CounterView cv;
	
	private ConsoleView console;
	
	private NumberGame f;
	
	private LastNumber ln;
	
	private int lastNumber = 0;
	
	private final int UPPERBOUND = 100;
	
	
	public void handleGuess(ActionEvent event) {
		try {
			int text = Integer.parseInt(textfield1.getText().trim());
			if (text > UPPERBOUND) {
				textfield1.setText("Out of range!");
				textfield1.setStyle("-fx-text-fill: red;");
			} else {
				boolean tf = f.guess(text);
				lastNumber(text);
				counter.add(1);
				ln.setLastNumber(text);
				label1.setText(f.getMessage());
				if (tf) initialize();
				label2.setText(f.getCount()+ "");
			}
			

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
		f = new FirstGame(UPPERBOUND);
		counter = new Counter();
		cv = new CounterView(counter);
		counter.addObserver(cv);
		cv.run();
		
		ln = new LastNumber();
		console = new ConsoleView(ln);
		ln.addObserver(console);
		console.run();
		
		
		
	}
	
	public void lastNumber(int num) {
		this.lastNumber = num;

        setChanged();
        notifyObservers();
	}
	
	
	

}
