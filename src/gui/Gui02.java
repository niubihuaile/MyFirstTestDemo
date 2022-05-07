package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
public class Gui02 extends Application {
    @Override
    public void start(Stage stage) {
        FlowPane rootNode = new FlowPane();
        rootNode.setOrientation(Orientation.VERTICAL);
        rootNode.setPadding(new Insets(15,10,15,10));
        rootNode.setVgap(10);
        rootNode.setHgap(10);
        rootNode.setStyle("-fx-background-color:#DAE6F3");
        Button [] buttons = new Button[8];
        for(int i = 0; i < 8; i++) {
            buttons[i] = new Button("按钮"+(i+1));
            rootNode.getChildren().add(buttons[i]);
        }
        Scene scene = new Scene(rootNode, 300, 100);
        stage.setTitle("鲤鱼尾的title");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}