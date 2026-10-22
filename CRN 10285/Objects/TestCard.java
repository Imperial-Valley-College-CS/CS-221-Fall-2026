

public class TestCard
{
   public static void main(String[] args)
   {
      Card card1 = new Card("10C");
      Card card2 = new Card("AC");
      System.out.println( card1 );
      System.out.println( card2 );
      int ans = card2.compareTo( card1 );
      System.out.println( "Answer: " + ans );
   }
   
}