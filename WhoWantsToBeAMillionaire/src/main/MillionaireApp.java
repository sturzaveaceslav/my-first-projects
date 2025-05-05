package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MillionaireApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Bine ai venit!");
        Button btn = new Button("Start joc");

        btn.setOnAction(e -> {
            Game game = new Game();
            try {
                game.start();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        VBox layout = new VBox(20, label, btn);
        layout.setStyle("-fx-alignment: center; -fx-padding: 80;");
        Scene scene = new Scene(layout, 600, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Milionar JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
