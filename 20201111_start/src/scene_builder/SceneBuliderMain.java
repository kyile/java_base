package scene_builder;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SceneBuliderMain extends Application {

	@Override
	public void start(Stage stage) {
		try {
			/*FXMLLoader : 작성한 FXML 파일을 읽어들여 선언된 내용을 객체화하는 것.
			 * load() 메서드가 리턴하는 타입은 Parent 타입입니다. 
			 * 실제 객체는 FXML 파일에서 루트 태그로 선언된 컨테이너입니다. 
			 * FXML파일에서 루트 태그가 <HBox>이면 타입 변환이 가능합니다.
			 * getClass() : 현재 클래스 리턴
			 * getResource("xxx.fxml") : 클래스가 위치하는 곳에서 상대 경로로 리소스 URL 리턴
			 * */
			AnchorPane root = FXMLLoader.load(getClass().getResource("root.fxml"));
			Button btn = new Button();
			Scene scene = new Scene(root);
			btn.setText("hi");
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
