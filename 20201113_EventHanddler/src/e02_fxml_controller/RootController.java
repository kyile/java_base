package e02_fxml_controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;

public class RootController implements Initializable {

	@FXML private Button btn1;//어노테이션 FXML을 사용하면 편하게 가지고올수있다.
	@FXML private Button btn2;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {//location 사용처, 
		System.out.println(location);
		System.out.println(resources);
		System.out.println(resources.getLocale());
		System.out.println(resources.getString("btn1"));
		/*
		btn1.setOnAction(event->{
			System.out.println("버튼 1클릭");
		});
		*/
		btn1.setOnAction(event->handleBtnAction(event));//버튼 1을누르면  메소드로 이동
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {//내장 객체
			@Override
			public void handle(ActionEvent event) {
				handleBtnAction(event);
			}
		});//버튼 2을클릭하면 메소드로 이동
	}
	
	
	public void handleBtnAction(ActionEvent event) {
		Node n = (Node)event.getTarget(); //실제 이밴트가 발생한 요소//fxml요소가 node를 상속받음 
		Button btn = (Button)n;
		System.out.println(event.getEventType());//어떤 이벤트인지 알려줌
		System.out.println();
	}
}
