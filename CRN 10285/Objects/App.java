import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class App extends Application
{
   Color sceneColor = Color.BLACK;
   Canvas canvas = new Canvas(600, 400);
   Group g = new Group(canvas);
   Scene scene = new Scene(g, 600, 400, sceneColor);
   GraphicsContext gc = canvas.getGraphicsContext2D();
   
   @Override
   public void start(Stage stage)
   {
      drawInvader("squid", 20, 50);
      stage.setScene(scene);
      stage.show();
   }
   
   public void drawInvader(String type, double x, double y)
   {
      gc.setFill( Color.WHITE );
      gc.fillRect(x, y, 10, 10);
   }
}