package gui;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class Gui01 extends Application {
    @Override
    public void start(Stage stage) {
        Reflection reflection = new Reflection();
        reflection.setFraction(1.0);
        // 为文本设置倒影特效
        Text text = new Text(10.0,50.0,"我真的是鲤鱼尾");
        text.setCache(true);
        text.setFill(Color.web("0x3b596d"));
        text.setFont(Font.font(null, FontWeight.BOLD, 30));
        text.setEffect(reflection);

        Group rootNode = new Group();
        rootNode.getChildren().addAll(text);
        Scene scene = new Scene(rootNode,300,200);
        stage.setTitle("Effect");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
