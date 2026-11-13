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
   private Timer timer = new Timer();
   private double x = 50;
   private double y = 30;
   
   @Override
   public void start(Stage stage)
   {
      timer.start();
      scene.setOnKeyPressed(keyHandle);   //makes keyboard come to life
      stage.setScene( scene );
      stage.show();
   }
   
   public void drawSquare()
   {
      gc.setFill( Color.BLACK );
      gc.fillRect(0,0,600,400);
      gc.setFill( Color.RED );
      gc.fillRect(x,y,20,20);
   }
   
   class HandleKey implements EventHandler<KeyEvent>
   {
      @Override
      public void handle(KeyEvent event)        //handle methods is invoked when there's a KeyEvent
      {
         key = event.getCode();
         System.out.println( key ); //print KeyEvent code
      }
   }
   
   class Timer extends AnimationTimer
   {
      @Override
      public void handle(long now)     //handle method is invoked on EVERY computational frame
      {
         if( key == KeyCode.UP )
            y -= 10;
         if( key == KeyCode.LEFT )
            x -= 10;
         if( key == KeyCode.DOWN )
            y += 10;
         if( key == KeyCode.RIGHT )
            x += 10;
            
         drawSquare();
      }
   }
}