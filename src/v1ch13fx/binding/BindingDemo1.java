package v1ch13fx.binding;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Cay Horstmann
 * @version 1.0 2017-12-29
 */
public class BindingDemo1 extends Application {
    public void start(Stage stage) {
        TextArea shipping = new TextArea();
        TextArea billing = new TextArea();
        billing.textProperty().bindBidirectional(shipping.textProperty());
        VBox root = new VBox(
                new Label("Shipping"), shipping,
                new Label("Billing"), billing);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
