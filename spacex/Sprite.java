package spacex;


import javafx.scene.image.Image;
import javafx.scene.canvas.GraphicsContext;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

 public class Sprite extends Rectangle {
        boolean dead = false;
        ImageView imageView;

        Sprite(int x, int y, ImageView iv) {

            imageView.setTranslateX(x);
            imageView.setTranslateY(y);
        }

        public void moveLeft() {
            imageView.setTranslateX(imageView.getTranslateX() - 5);
        }

        public void moveRight() {
            imageView.setTranslateX(getTranslateX() + 5);
        }

       public  void moveUp() {
            imageView.setTranslateY(getTranslateY() - 5);
        }

        public void moveDown() {
           imageView.setTranslateY(getTranslateY() + 5);
        }
}