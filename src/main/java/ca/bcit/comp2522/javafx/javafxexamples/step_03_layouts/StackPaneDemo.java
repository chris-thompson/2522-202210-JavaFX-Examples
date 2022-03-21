package ca.bcit.comp2522.javafx.javafxexamples.step_03_layouts;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import javafx.stage.Stage;

/**
 * Demonstrates how to use a StackPane.
 * https://openjfx.io/javadoc/13/javafx.graphics/javafx/scene/layout/StackPane.html
 *
 * @author BCIT
 * @version 2020
 */
public class StackPaneDemo extends Application {
    
    /**
     * Creates the StackPane.
     *
     * @param primaryStage a Stage
     */
    public void start(Stage primaryStage) {

        // Evelyn Berezin built the first real word processor
        // She just died a few years ago.  She was 93.  She was brilliant.
        ImageView imageView = new ImageView(new Image("evelynBerezin.jpg"));

        Rectangle rect = new Rectangle(500, 500, null);
        rect.setStroke(Color.ORANGE);
        rect.setStrokeWidth(6);

        // Here is where we construct the StackPane object
        // openjfx.io/javadoc/11/javafx.graphics/javafx/scene/layout/StackPane.html
        StackPane imagePane = new StackPane(imageView, rect);
        imagePane.setStyle("-fx-background-color: black");

        Scene scene = new Scene(imagePane, 1000, 600);

        primaryStage.setTitle("StackPane Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Launches the JavaFX application.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
