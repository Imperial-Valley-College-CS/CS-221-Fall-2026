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
   private Block snack = new Block(0,0);
   
   @Override
   public void start(Stage stage)
   {
      initializeSnake();
      updateSnack();
      timer.start();                      //handle method in timer is invoked
      scene.setOnKeyPressed(keyHandle);   //makes keyboard come to life
      stage.setScene( scene );
      stage.show();
   }
   
   public void initializeSnake()
   { 
      snake.add( new Block(startX, startY) );      //head of snake
      snake.add( new Block(startX-Constants.BLOCK_SIZE, startY) );      //body of snake
      snake.add( new Block(startX-2*Constants.BLOCK_SIZE, startY) );      //tail of snake      
   }
   
   public void updateSnack()
   {
      double randX = (int)(Constants.SCN_WIDTH*Math.random()/10)*10;
      double randY = (int)(Constants.SCN_HEIGHT*Math.random()/10)*10;
      snack.setX(randX);
      snack.setY(randY);
   }
   
   public void updateSnake()
   {
      Block head = snake.get(0);
      double headX = head.getX();
      double headY = head.getY();
      
      double newX = headX;
      double newY = headY;
      
      if( key == KeyCode.UP )
         newY -= Constants.BLOCK_SIZE;
      if( key == KeyCode.DOWN )
         newY += Constants.BLOCK_SIZE;
      if( key == KeyCode.RIGHT )
         newX += Constants.BLOCK_SIZE;
      if( key == KeyCode.LEFT )
         newX -= Constants.BLOCK_SIZE;
         
      boolean ate = ateSnack( newX, newY );
      
      // hitWall(newX, newY);
      
      //add new head
      snake.add(0, new Block(newX, newY) );
      
      if( ate )
         updateSnack();    //update snack and don't remove tail
      else         
         snake.remove( snake.size()-1 );    //remove tail  
   }
   
   public void hitWall( double headX, double headY )
   {
      if( headX >= Constants.SCN_WIDTH || headX <= 0 )
         timer.stop();
      if( headY >= Constants.SCN_HEIGHT || headY <= 0 )
         timer.stop();
   }
   
   public boolean ateSnack(double headX, double headY)
   {
      return ( headX == snack.getX() && headY == snack.getY() );
   }
   
   public void drawSnake()
   { 
      //paints entire Canvas black
      gc.setFill( Constants.SCN_COLOR );
      gc.fillRect(0,0,Constants.SCN_WIDTH,Constants.SCN_HEIGHT);
      
      //paint snack on Canvas
      gc.setFill( Constants.SNACK_COLOR );
      gc.fillRect( snack.getX(), snack.getY(),Constants.BLOCK_SIZE,Constants.BLOCK_SIZE);
      
      
      //paint snake on Canvas
      for( Block b : snake )
      {
         //set snake color
         gc.setFill( b.getColor() );
         gc.fillRect(b.getX(),b.getY(),Constants.BLOCK_SIZE,Constants.BLOCK_SIZE);
         //gc.drawImage(b.getImage(), b.getX(),b.getY(),Constants.BLOCK_SIZE,Constants.BLOCK_SIZE);
      }
       
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
         updateSnake();
         drawSnake();
      }
   }
}