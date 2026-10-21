public class Position
{
   //data fields
   private double x, y;
   
   //constructor
   public Position(double x, double y)
   {
      this.x = x;    //initializes the x-coordinate
      this.y = y;    //initializes the y-coordinate
   }
   
   //methods
   public void setX( double x )
   {
      this.x = x;    //changes (sets) the x-coordinate
   }
   
   public void setY( double y )
   {
      this.y = y;    //changes (sets) the y-coordinate
   }
   
   public double getX()
   {
      return this.x;    //grabs the x-coordinate
   }
   
   public double getY()
   {
      return this.y;    //grabs the y-coordinate
   }
}