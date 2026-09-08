import java.util.Scanner;

public class Card
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter a card symbol ");
      String simba = scan.next().toUpperCase();      //AH or 2S or 10C or JD
      
      char rank = simba.charAt(0);
      char suit; 
      
      if( simba.length() > 2 )
         suit = simba.charAt(2);
      else
         suit = simba.charAt(1);
         
      switch( rank )
      {
         case 'A': System.out.print( "Ace of " ); break;
         case '2': System.out.print( "Two of " ); break;
         case '1': System.out.print( "Ten of " ); break;
      }
      switch( suit )
      {
         case 'C': System.out.print( "Clubs" ); break;
      }
   }
}