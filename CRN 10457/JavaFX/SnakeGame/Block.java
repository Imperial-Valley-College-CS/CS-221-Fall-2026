import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Block
{
   //data fields
   private double x, y;
   private Image im;
   private ImageView imView;
   private Color color;
   
   //constructor
   public Block( double x, double y )
   {
      this.x = x;
      this.y = y;
      this.im = new Image("mario.jpg");
      this.imView = new ImageView(this.im);
   }
   
   //methods
   public void setX( double x ){ this.x = x; }
   public void setY( double y ){ this.y = y; }
   public double getX(){ return this.x; }
   public double getY(){ return this.y; }
   public Image getImage()
   {
      return this.im;
   }
   public Color getColor()
   {
      int red = (int)(256*Math.random());
      int green = (int)(256*Math.random());
      int blue = (int)(256*Math.random());
      
      return Color.rgb(red, green, blue);
   }
}