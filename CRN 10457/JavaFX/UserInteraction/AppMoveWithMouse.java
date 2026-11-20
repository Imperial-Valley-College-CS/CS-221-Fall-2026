import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.Group;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;

public class AppMoveWithMouse extends Application
{
   private Canvas canvas = new Canvas(600, 400);
   private GraphicsContext gc = canvas.getGraphicsContext2D();
   private Group group = new Group(canvas);
   private Scene scene = new Scene(group, 600, 400, Color.BLACK);
   private Image image = new Image("pikachu.png");
   
   //2. Create an EventHandler object
   private HandleMouse handleMouse = new HandleMouse();
   
   @Override
   public void start(Stage stage)
   {
      scene.setOnMouseDragged(handleMouse);       //makes mouse alive
      stage.setScene( scene );
      stage.show();
   }
   
   //1. define a class that implements EventHandler<MouseEvent>
   class HandleMouse implements EventHandler<MouseEvent>
   {
      @Override
      public void handle(MouseEvent event)
      {
         double x = event.getX();
         double y = event.getY();
         gc.setFill( Color.WHITE );
         gc.fillRoundRect(x,y,10,10,9,9);
         //gc.drawImage(image, x, y, 50, 50); 
      }
   }
}