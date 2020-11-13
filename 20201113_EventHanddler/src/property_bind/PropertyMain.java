package property_bind;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PropertyMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root
		= FXMLLoader.load(getClass().getResource("root.fxml"));//root에 올리고
		primaryStage.setScene(new Scene(root));//받은 스테이지에서 장면을 올린다.
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
