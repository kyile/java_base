package margin_padding;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MarginPaddingMagin extends Application {

	@Override
	public void start(Stage stage) {
		HBox hbox = new HBox();
		Button button = new Button("button1");
		/*
		hbox.setPadding(new Insets(50,10,10,50));//패딛ㅇ
		//너비와 높이 동시지정
		button.setPrefSize(100,100);//버튼크기
		*/
		button.setPrefSize(100, 100);
		
		HBox.setMargin(button,new Insets(10,10,50,50));
		hbox.getChildren().add(button);
		stage.setScene(new Scene(hbox));
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
