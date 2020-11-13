package property_listener;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RootController implements Initializable{

	@FXML private Slider slider;
	@FXML private ImageView img;
	@FXML private ToggleButton toggle;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {//초기정보를 저장받음,어떤정보로 화면을 구성하는가,로케이션:xml의 주소,ResourceBundle:한글인지 영어 매칭
		slider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {//observable :지금실시간값,oldValue: 이전값,newValue:봐뀐값
					System.out.println("oldValue:"+oldValue);//이전값
					System.out.println("newValue:"+newValue);//새로운값
					setImageWidth(newValue.doubleValue());
			}
		});
		
		toggle.selectedProperty().addListener(new ChangeListener<Boolean>() {//토글 속성을 읽어오겟다.

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {//observable:실시간값
				
				Image image = new Image(getClass().getResource("./images/animals/dog.jpg").toString());//
				if(newValue) {
					image = new Image(getClass().getResource("./images/animals/cat3.jpg").toString());//
				}
				img.setImage(image);	

			}
			
		});
	}
	 
	public void setImageWidth(double value) {
		// 최대 크기 -> root container 의 폭 = 350
		double width =(350/100.0)*value;
		System.out.println("width : "+ width);
		width = width == 0 ? 1 : width;
		img.setFitWidth(width);
		
	}
}
