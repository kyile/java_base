package property_bindings;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

public class BindingController implements Initializable {
	
	@FXML private AnchorPane root;
	@FXML private Circle cir;
	

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cir.centerXProperty().bind(Bindings.divide(root.prefWidthProperty(), 2));		
		cir.centerYProperty().bind(Bindings.divide(root.prefHeightProperty(), 2));
		cir.radiusProperty().bind(Bindings.divide(root.prefWidthProperty(), 2));
	}
	
}
