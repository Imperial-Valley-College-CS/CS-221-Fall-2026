import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class AppMoveWithMouse extends Application
{
   private Canvas canvas = new Canvas(600, 400);
   private GraphicsContext gc = canvas.getGraphicsContext2D();
   private Group group = new Group(canvas);
   private Scene scene = new Scene(group, 600, 400, Color.BLACK);
   
   //2. Create an EventHandler object
   private HandleMouse handleMouse = new HandleMouse();
   
   @Override
   public void start(Stage stage)
   {
      stage.show();
   }
   
   //1. define a class that implements EventHandler<MouseEvent>
   class HandleMouse implements EventHandler<MouseEvent>
   {
      @Override
      public void handle(MouseEvent event)
      {
      }
   }
}