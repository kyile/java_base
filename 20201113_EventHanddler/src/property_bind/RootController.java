package property_bind;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class RootController implements Initializable {

	@FXML private TextArea txtArea1,txtArea2;
	
	@Override
	public void initialize(URL l,ResourceBundle r) {
		Bindings.bindBidirectional(
				txtArea1.textProperty(),
				txtArea2.textProperty()
				);//Binding메소드에서 사용할수 있는 것이여얗나다. 
	}
}
