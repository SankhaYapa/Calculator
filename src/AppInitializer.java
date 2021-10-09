import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent parent= FXMLLoader.load(getClass().getResource("View/Calculator.fxml"));
        Scene scene=new Scene(parent);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        //primaryStage.centerOnScreen();
//remove header close button
        primaryStage.initStyle(StageStyle.UNDECORATED);
//create drag on window
        double xOffset=0;
        double yOffset=0;

        parent.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double xOffset = event.getSceneX();
                double yOffset = event.getSceneY();

            }
        });
        parent.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.setX(event.getSceneX() -xOffset);
                primaryStage.setY(event.getSceneY()-yOffset);
            }
        });

        primaryStage.show();

    }
}
