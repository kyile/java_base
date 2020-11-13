package containner.tile;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TilePaneMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root
		= FXMLLoader.load(getClass().getResource("tile.fxml"));
		Scene scene = new Scene(root);
		//메인 무대의 크기를 변경
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
