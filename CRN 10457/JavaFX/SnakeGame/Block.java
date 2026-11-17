import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Block
{
   //data fields
   private double x, y;
   private Image im;
   private ImageView imView;
   
   //constructor
   public Block( double x, double y )
   {
      this.x = x;
      this.y = y;
   }
   
   //methods
   public void setX( double x ){ this.x = x; }
   public void setY( double y ){ this.y = y; }
   public double getX(){ return this.x; }
   public double getY(){ return this.y; }
}