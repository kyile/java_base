package e01_event_handler;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class EventHandlerMain extends Application {

	public void start(Stage primaryStage) {
		HBox hbox = new HBox();
		hbox.setPrefSize(200,50);
		hbox.setAlignment(Pos.CENTER);
		Button btn1 = new Button("버튼1");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("버튼1 클릭");
				System.out.println(event);
			}
		});
		
		Button btn2 = new Button("버튼2");
		btn2.setOnAction(event->{
			System.out.println("버튼 2 클릭");
		});
		Button btn3 = new Button("버튼3");
		btn3.setOnAction(event->{
			System.out.println("버튼 3을 클릭");
			System.out.println(event.getTarget());
		});
		
		ObservableList<Node> list = hbox.getChildren();
		list.add(btn1);
		list.add(btn2);
		list.add(btn3);
		Scene s = new Scene(hbox);
		primaryStage.setScene(s);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
