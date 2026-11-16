import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.Group;

public class AppMoveWithKeys extends Application
{
   Group group = new Group();       //Group is a Parent
   Scene scene = new Scene(group);  
   HandleKey handleKey = new HandleKey();    //create an EventHandler object
   
   @Override
   public void start(Stage stage)
   {
      //makes Keyboard come to life when key is pressed
      scene.setOnKeyPressed(handleKey);   //method needs an EventHandler<KeyEvent> 
      stage.setScene( scene );   //give Scene to Stage
      stage.show();
   }
   
   class HandleKey implements EventHandler<KeyEvent>     //KeyEvent, MouseEvent, ActionEvent
   {
      @Override
      public void handle(KeyEvent e)
      {
         System.out.println( e.getCode() );
      }
   }
}