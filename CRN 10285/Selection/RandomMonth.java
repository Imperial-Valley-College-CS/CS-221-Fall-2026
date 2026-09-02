public class RandomMonth
{
   public static void main(String[] args)
   {
      int scale = 12;
      int offset = 1;
      int randNum = (int)(scale*Math.random())+offset;
      
      //use a switch to assign a value to month
      String month = "";
      
      switch(randNum)
      {
         case 1: month = "January"; break;
      }
      
      System.out.println("Random Month: " + month);
   }
}