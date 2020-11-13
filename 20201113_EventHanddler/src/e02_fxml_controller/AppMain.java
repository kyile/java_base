package e02_fxml_controller;



import java.util.Locale;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception  {
		
		
		for(Locale l: Locale.getAvailableLocales()) {
			System.out.println(l);
			//locale = new Locale("en","UK");
			
		}
		//System.out.println(Locale.getDefault());
		Locale locale = Locale.getDefault();
		locale = new Locale("en","UK");
		//System.out.println(locale);
		
		ResourceBundle bundle
			= ResourceBundle.getBundle("prop.s",locale);
		System.out.println(bundle);
		
		Parent root = FXMLLoader.load(getClass().getResource("hbox.fxml"),bundle);//fxml이장면
		primaryStage.setScene(new Scene(root));//그리고 스테이지에 올린다.
		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent event) {
				System.out.println("종료 클릭");
			}
		});//닫을때 반환하는 익명함수 핸들러
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
