package spacex;

import com.sun.glass.ui.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;




public class SpaceX extends Application 
{
    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void start(Stage theStage) 
    {   
        
        Group root = new Group();
        Scene theScene = new Scene( root );
        theStage.setScene( theScene );
        AnchorPane anchorPane = new AnchorPane();
         AnchorPane anchorPane1 = new AnchorPane();
        anchorPane.setLayoutX(600);
        anchorPane.setLayoutY(600);
        Image naveImage = new Image("Nave.png", 70, 70, false, false);
        Image spaceImage = new Image("Space.png");
        ImageView nave = new ImageView(naveImage);
        ImageView space = new ImageView(spaceImage);
        anchorPane.getChildren().add(space);
        anchorPane1.getChildren().add(nave);
        root.getChildren().add(anchorPane);
        root.getChildren().add(anchorPane1);
        
       theScene.setOnKeyPressed ((KeyEvent event) -> {
           if ( null != event.getCode ( ) ) switch (event.getCode ( )) {
                case RIGHT:
                    nave.setTranslateX(nave.getTranslateX() + 5);
                    break;
                case LEFT:
                    nave.setTranslateX(nave.getTranslateX() - 5);
                    break;
               case DOWN:
                    nave.setTranslateY(nave.getTranslateY() + 5);
                    break;
               case UP:
                    nave.setTranslateY(nave.getTranslateY() - 5);
                    break;
                default:
                    break;
            }
        });
       root.getChildren().add(nave);
        theStage.setScene(theScene);
        
        theStage.show();
    }
}
