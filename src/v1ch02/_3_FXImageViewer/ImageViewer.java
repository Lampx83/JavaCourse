package v1ch02._3_FXImageViewer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * A program for viewing images.
 *
 * @author Cay Horstmann
 * @version 1.40 2017-12-10
 */
public class ImageViewer extends Application {
    private static final int MIN_SIZE = 400;

    public void start(Stage stage) throws IOException {
        BorderPane pane = new BorderPane();
        MenuBar bar = new MenuBar();
        pane.setTop(bar);
        Menu fileMenu = new Menu("File");
        bar.getMenus().add(fileMenu);
        MenuItem openItem = new MenuItem("Open");
        openItem.setOnAction(event -> load(stage, pane));
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setOnAction(event -> System.exit(0));
        fileMenu.getItems().addAll(openItem, exitItem);
        stage.setScene(new Scene(pane, MIN_SIZE, MIN_SIZE));
        stage.setTitle("_2_ImageViewer");
        stage.show();
    }

    /**
     * Loads an image.
     *
     * @param stage the stage above which to place the file chooser
     * @param pane  the pane into which to place the image view
     */
    public void load(Stage stage, BorderPane pane) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
                new ExtensionFilter("All Files", "*.*"));
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
            try {
                Path path = file.toPath();
                Image image = new Image(Files.newInputStream(path));
                pane.setCenter(new ImageView(image));
            } catch (IOException e) {
                Alert alert = new Alert(AlertType.ERROR,
                        "Cannot open file.");
                alert.showAndWait();
            }
        }
    }
}
