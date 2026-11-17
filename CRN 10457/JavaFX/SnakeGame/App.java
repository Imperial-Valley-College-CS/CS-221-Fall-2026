import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.event.EventHandler;
import javafx.scene.input.*;
import javafx.animation.AnimationTimer;
import java.util.ArrayList;

public class App extends Application
{
   private Canvas canvas = new Canvas(Constants.SCN_WIDTH, Constants.SCN_HEIGHT);
   private GraphicsContext gc = canvas.getGraphicsContext2D();
   private Group group = new Group(canvas);
   private Scene scene = new Scene(group, Constants.SCN_WIDTH, Constants.SCN_HEIGHT, Constants.SCN_COLOR);
   private HandleKey keyHandle = new HandleKey();     //create EventHandler to give to setOnKeyPressed
   private KeyCode key;
   private Timer timer = new Timer();
   private double startX = 50;
   private double startY = 30;
   private ArrayList<Block> snake = new ArrayList<>(3);
   
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
      gc.setFill( Constants.SCN_COLOR );
      gc.fillRect(0,0,Constants.SCN_WIDTH,Constants.SCN_HEIGHT);
      gc.setFill( Constants.BLOCK_COLOR );
      gc.fillRect(x,y,Constants.BLOCK_SIZE,Constants.BLOCK_SIZE);
   }
   
   class HandleKey implements EventHandler<KeyEvent>
   {
      @Override
      public void handle(KeyEvent event)        //handle methods is invoked when there's a KeyEvent
      {
         key = event.getCode();         
      }
   }
   
   class Timer extends AnimationTimer
   {
      @Override
      public void handle(long now)     //handle method is invoked on EVERY computational frame
      {
         // if( key == KeyCode.UP )
//             y -= Constants.DELTA;
//          if( key == KeyCode.LEFT )
//             x -= Constants.DELTA;
//          if( key == KeyCode.DOWN )
//             y += Constants.DELTA;
//          if( key == KeyCode.RIGHT )
//             x += Constants.DELTA;
            
         drawSquare();
      }
   }
}