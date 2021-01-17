package v1ch13fx.notHelloWorld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Cay Horstmann
 * @version 1.4 2017-12-23
 */
public class NotHelloWorld extends Application {
    private static final int MESSAGE_X = 75;
    private static final int MESSAGE_Y = 100;

    private static final int PREFERRED_WIDTH = 300;
    private static final int PREFERRED_HEIGHT = 200;

    public void start(Stage stage) {
        Text message = new Text(MESSAGE_X, MESSAGE_Y,
                "Not a Hello World program");

        Pane root = new Pane(message);
        root.setPrefSize(PREFERRED_WIDTH, PREFERRED_HEIGHT);

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("NotHelloWorld");
        stage.show();
    }
}
