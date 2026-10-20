import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFromFile
{
   public static void main(String[] args)
   {
      System.out.println( System.getProperty("user.dir") );
      String filename = "InvaderData.csv";
      
      try
      {
         File f = new File(filename);
         Scanner scan = new Scanner(f);
         
      }catch(FileNotFoundException e)
      {
         System.out.println( filename + " not found.");
      }
   }
}