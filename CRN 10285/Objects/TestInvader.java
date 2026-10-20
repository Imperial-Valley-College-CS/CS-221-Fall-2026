import java.util.Arrays;

public class TestInvader
{
   public static void main(String[] args)
   {
      Invader invader = new Invader("squid", 50.0, 20.0);
      boolean[][] body = invader.getBody();
//       double x = invader.getPosition().getX();
//       double y = invader.getPosition().getY();
//       System.out.println( "Position - x: " + x + " y: " + y );     
      for( boolean[] row : body )
         System.out.println( Arrays.toString( row ) );
   }
}