import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.event.EventHandler;
import javafx.scene.input.*;
import javafx.animation.AnimationTimer;

public class AppMoveWithKeys extends Application
{
   private Canvas canvas = new Canvas(600, 400);
   private GraphicsContext gc = canvas.getGraphicsContext2D();
   private Group group = new Group(canvas);
   private Scene scene = new Scene(group, 600, 400, Color.BLACK);
   private HandleKey keyHandle = new HandleKey();     //create EventHandler to give to setOnKeyPressed
   private KeyCode key;
   
   @Override
   public void start(Stage stage)
   {
      gc.setFill( Color.RED );
      gc.fillRect(50,30,20,20);
      scene.setOnKeyPressed(keyHandle);   //makes keyboard come to life
      stage.setScene( scene );
      stage.show();
   }
   
   class HandleKey implements EventHandler<KeyEvent>
   {
      @Override
      public void handle(KeyEvent event)        //handle methods is invoked when there's a KeyEvent
      {
         key = event.getCode();
         System.out.println( key  ); //print KeyEvent code
      }
   }
}