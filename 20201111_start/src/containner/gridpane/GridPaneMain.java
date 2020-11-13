package containner.gridpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GridPaneMain extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent grid = FXMLLoader.load(getClass().getResource("grid.fxml"));//그리드패널 해도됨
			primaryStage.setScene(new Scene(grid));
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
