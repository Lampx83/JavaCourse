package v1ch13fx.font;

import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Cay Horstmann
 * @version 1.4 2017-12-23
 */
public class FontTest extends Application {
    private static final int PREFERRED_WIDTH = 400;
    private static final int PREFERRED_HEIGHT = 400;

    public void start(Stage stage) {
        // Construct message at (0, 0)
        Text message = new Text("Bonjour le monde!");
        Font f = Font.font("Lucida Bright", FontWeight.BOLD, 36);
        message.setFont(f);

        // Get message dimensions
        Bounds messageBounds = message.getBoundsInParent();
        double ascent = -messageBounds.getMinY();
        double descent = messageBounds.getMaxY();
        double width = messageBounds.getWidth();

        // Center message horizontally
        double baseY = 100;
        double topY = baseY - ascent;
        double leftX = (PREFERRED_WIDTH - width) / 2;
        message.relocate(leftX, topY);

        // Construct bounding rectangle and baseline
        Rectangle rect = new Rectangle(leftX, topY,
                width, ascent + descent);
        rect.setFill(Color.TRANSPARENT);
        rect.setStroke(Color.GRAY);
        Line baseline = new Line(leftX, baseY,
                leftX + width, baseY);
        baseline.setStroke(Color.GRAY);

        // Center image directly below the message
        ImageView image = new ImageView("font/world.png");
        Bounds imageBounds = image.getBoundsInParent();
        image.relocate((PREFERRED_WIDTH - imageBounds.getWidth()) / 2,
                baseY + descent);

        Pane root = new Pane(message, rect, baseline, image);
        root.setPrefSize(PREFERRED_WIDTH, PREFERRED_HEIGHT);
        stage.setScene(new Scene(root));
        stage.setTitle("FontTest");
        stage.show();
    }
}
