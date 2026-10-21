import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Invader
{
   private String filename = "SquidMatrix.txt";
   private boolean[][] body = new boolean[8][12];
   private Position position;
   
   public Invader(String type, double a, double b)
   {
      switch( type )
      {
         case "squid": this.filename = "SquidMatrix.txt"; break;
         case "crab": this.filename = "CrabMatrix.txt"; break;
         case "octopus": this.filename = "OctopusMatrix.txt"; break;
      }
      this.position = new Position(a, b);
      setBody();
   }
   
   public boolean[][] getBody()
   {
      return this.body;
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