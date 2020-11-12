package inti;

import java.io.File;
import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.stage.Stage;

public class InitMain extends Application {

	public InitMain() {
		String threadName = Thread.currentThread().getName();
		System.out.println(Thread.currentThread().getName()+"InitMain생성자 호출");
	}
	
	@Override
	public void init() {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName+"application init() 호출");
		
		Parameters params = getParameters();
		List<String> list = params.getRaw();
		System.out.println(list);
		
		Map<String,String> map = params.getNamed();
		System.out.println(map);
		
		//값이 5001이다
	}
	
	@Override
	public void start(Stage primaryStage) {
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName+"application start() 호출");
		primaryStage.show();
	}

	public static void main(String[] args) {
		File file = new File("a");
		System.out.println(file.getAbsolutePath());
		String threadName = Thread.currentThread().getName();
		System.out.println(threadName+"main() 호출");
		launch(args);
		System.out.println(threadName+"main() 종료");
		
	}
}
