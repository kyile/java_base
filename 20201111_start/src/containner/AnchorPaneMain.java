package containner;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPaneMain extends Application {


	@Override
	public void start(Stage primaryStage) {
		try {
		
			AnchorPane root = FXMLLoader.load(getClass().getResource("root.fxml"));
			primaryStage.setScene(new Scene(root));
			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
