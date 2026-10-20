import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFromFile
{
   public static void main(String[] args)
   {
      String filename = "SquidMatrix.txt";
      
      try
      {
         File f = new File(filename);
         Scanner scan = new Scanner(f);
         System.out.println( scan.nextLine() );
         System.out.println( scan.nextLine() );
         
      }catch(FileNotFoundException e)
      {
         System.out.println( filename + " not found.");
      }
   }
}