import javafx.scene.paint.Color;

public class Invader
{
   //data fields
   private int health, speedX, speedY;
   private boolean isAlive, body[][];
   private String filename;
   private Color color;
   private Position pos;
   
   //constructor
   public Invader(double x, double y)
   {
      this.pos = new Position(x,y);
      this.speedX = Constants.INVADER_SPEED_X;
      this.speedY = Constants.INVADER_SPEED_Y;
      this.color = Color.rgb(255,0,0); //Color.RED;
      this.health = Constants.INVADER_HEALTH;
      this.isAlive = true;
      setBody();
   }
   
   public void setBody()
   {
      try
      {
         File f = new File(filename);
         Scanner scan = new Scanner(f);
         
         int row = 0;
         while( scan.hasNextLine() )
         {
            String line = scan.nextLine();         //"0,0,0,0,1,1,..."
            String[] tokens = line.split(",");     //{"0", "0", "0", "0", "1", "1",...}
            for( int i = 0; i < tokens.length; i++ )
            {
               if( tokens[i].equals("1") )
                  this.body[row][i] = true;
               else
                  this.body[row][i] = false;
            }
            row++;
         }
         
      }catch(FileNotFoundException e)
      {
         System.out.println( filename + " not found.");
      }
   }
}