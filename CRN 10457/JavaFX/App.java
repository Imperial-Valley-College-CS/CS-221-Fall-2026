import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.scene.control.*;
import javafx.scene.image.*;

public class App extends Application
{
   Image im = new Image("FortniteLlama.png", 200, 400, true, true);
   ImageView imView = new ImageView(im);
   RadioButton bttn1 = new RadioButton("hi");
   RadioButton bttn2 = new RadioButton("bye");
   RadioButton bttn3 = new RadioButton("yay");
   RadioButton bttn4 = new RadioButton("aww");
   GridPane gridPane = new GridPane();
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
      //add bttn1 and bttn2 to gridpane
      gridPane.add( bttn1, 1, 0);
      gridPane.add( bttn2, 2, 0);
      gridPane.add( bttn3, 1, 1);
      gridPane.add( bttn4, 2, 1);
      //add gridPane to right of borderpane
      pane.setRight( gridPane );
      //add scrollpane to left of borderpane
      pane.setLeft( scrollP );
      //add label to top of borderpane
      pane.setTop( l );
      //add button to bottom of borderpane
      pane.setBottom( b );
      //add imageView to center of borderpane
      pane.setCenter( imView );
      //add my scene to my stage
      stage.setScene(scene);
      stage.show();
   }   
}