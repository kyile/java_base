package code_layout;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CodeLayoutMain extends Application {

	@Override
	public void start(Stage primaryStage) {
		HBox hbox = new HBox();
		Insets insets = new Insets(10,10,10,10);
		insets = new Insets(10);
		hbox.setPadding(insets);
		hbox.setSpacing(10);
		
		TextField textField = new TextField();
		textField.setPrefWidth(200);
		textField.setAlignment(Pos.CENTER_RIGHT);
		
		Button btn = new Button();
		btn.setText("확인");
		btn.setAlignment(Pos.CENTER);
		btn.setPrefWidth(100);
		btn.setPrefHeight(100);
		
		ObservableList<Node> list = hbox.getChildren();
		list.add(textField);
		list.add(btn);
		
		Scene scene = new Scene(hbox);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ㅇㅇ");//제목
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
