package v1ch13fx.binding;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import static javafx.beans.binding.Bindings.createBooleanBinding;
import static javafx.beans.binding.Bindings.lessThanOrEqual;

/**
 * @author Cay Horstmann
 * @version 1.0 2017-12-29
 */
public class BindingDemo3 extends Application {
    public void start(Stage stage) {
        Button smaller = new Button("Smaller");
        Button larger = new Button("Larger");
        Rectangle gauge = new Rectangle(0, 5, 50, 15);
        Rectangle outline = new Rectangle(0, 5, 100, 15);
        outline.setFill(null);
        outline.setStroke(Color.BLACK);
        Pane pane = new Pane(gauge, outline);

        smaller.setOnAction(
                event -> gauge.setWidth(gauge.getWidth() - 10));
        larger.setOnAction(
                event -> gauge.setWidth(gauge.getWidth() + 10));

        // Using Bindings operator

        smaller.disableProperty().bind(
                lessThanOrEqual(gauge.widthProperty(), 0));

        // Creating a binding from a _4_lambda

        larger.disableProperty().bind(
                createBooleanBinding(
                        () -> gauge.getWidth() >= 100, // This _4_lambda is computed ...
                        gauge.widthProperty())); // ... when this property changes

        Scene scene = new Scene(new HBox(10, smaller, pane, larger));
        stage.setScene(scene);
        stage.show();
    }
}