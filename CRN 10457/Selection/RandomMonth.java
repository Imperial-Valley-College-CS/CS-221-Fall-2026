public class RandomMonth
{
   public static void main(String[] args)
   {
      int scale = 12;
      int offset = 1;
      int randy = (int)(scale*Math.random())+offset;
      
      String month = "";
      
      switch(randy)
      {
         case 1: month = "January"; break;
         case 2: month = "February"; break;
         case 3: month = "March"; break;
         default: month = "Invalid month"; break;
      }
      
      System.out.println("Month: " + month);
   }
}