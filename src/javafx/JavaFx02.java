package javafx;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
public class JavaFx02 extends Application{
    @Override
    public void start(Stage stage){
        Text text = new Text("我是鲤鱼尾大王") ;
        text.setFont(new Font(40));
        text.setFill(Color.RED);

        FadeTransition ft = new FadeTransition(Duration.millis(700));
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.setCycleCount(Animation.INDEFINITE);
        ft.setAutoReverse(true);
        ft.setNode(text);
        ft.play();

        // 设置主舞台场景
        StackPane rootNode = new StackPane();
        rootNode.getChildren().add(text);
        Scene scene = new Scene(rootNode,500,500);
        stage.setTitle("鲤鱼尾的淡入淡出动画");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[]args){
        Application.launch(args);
    }
}

