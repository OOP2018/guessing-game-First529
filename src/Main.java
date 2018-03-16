import java.net.URL;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main extends Application{

	@Override
	public void start(Stage primaryStage) {
		try {
			
			URL url = this.getClass().getResource("GameUI.fxml");
			if (url == null) {
				System.out.println("Could not find file GameUI.fxml");
				Platform.exit();
			}
			
			// Load the FXML and get reference to the loader
			FXMLLoader loader = new FXMLLoader(url);

			// Create the UI. This will instantiate the controller object, too.
			Parent root = loader.load();
			GameController controller = loader.getController();

			Scene scene = new Scene(root,1200,70);
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.sizeToScene();
			primaryStage.setTitle("Guesssing Game");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	
}
