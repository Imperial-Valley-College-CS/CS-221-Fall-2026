public class AlphabeticalOrder
{
   public static void main(String[] args)
   {
      String c1 = "Canada";
      String c2 = "Mexico";
      String c3 = "United States";
      
      boolean inAlpha = (c1.compareToIgnoreCase(c2) < 0) && (c2.compareToIgnoreCase(c3) < 0);
      
      System.out.print( "In alphabetical order: " + inAlpha );
   }
}