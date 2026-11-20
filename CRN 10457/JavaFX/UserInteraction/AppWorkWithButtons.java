import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.event.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;

public class AppWorkWithButtons extends Application
{
   private GridPane pane = new GridPane();
   private Scene scene = new Scene(pane, Color.BLACK);
   private Button[] buttons = new Button[9];
   private double sum = 0;
   
   //2. Create an EventHandler object
   private HandleButtons handleBttns = new HandleButtons();
   
   @Override
   public void start(Stage stage)
   {
      createButtons();
      addButtonsToGrid();
      stage.setScene( scene );
      stage.show();
   }
   
   public void createButtons()
   {
      for( int i = 0; i < buttons.length; i++ )
      {
         buttons[i] = new Button((i+1)+"");
         buttons[i].setOnAction(handleBttns);      //makes buttons come to live
      }
   }
   
   public void addButtonsToGrid()
   {
      int row = 0;
      int col = 0;
      for( int i = 0; i < buttons.length; i++ )
      {
         if( i % 3 == 0 )
         {
            row++;
            col = 0;
         }
         pane.add( buttons[i], col, row );
         col++;
      }
   }
   
   //1. define a class that implements EventHandler<ActionEvent>
   class HandleButtons implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
         Button bttn = (Button)event.getSource();
         String text = bttn.getText();
         double num = Double.parseDouble( text );
         sum += num;
         System.out.println( sum );
      }
   }
}