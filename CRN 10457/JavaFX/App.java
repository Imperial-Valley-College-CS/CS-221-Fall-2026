import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.scene.control.*;

public class App extends Application
{
   TextArea textA = new TextArea("A lot of sentences with a lot of quotes");
   ScrollPane scrollP = new ScrollPane(textA);
   Label l = new Label("TITLE");
   Button b = new Button("Ok");
   Circle c = new Circle(50.0);
   BorderPane pane = new BorderPane();
   Scene scene = new Scene(pane);
      
   @Override
   public void start( Stage stage )
   {
      //add scrollpane to left of borderpane
      pane.setLeft( scrollP );
      //add label to top of borderpane
      pane.setTop( l );
      //add button to bottom of borderpane
      pane.setBottom( b );
      //add circle to center of borderpane
      pane.setCenter( c );
      //add my scene to my stage
      stage.setScene(scene);
      stage.show();
   }   
}