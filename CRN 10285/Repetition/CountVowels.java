import java.util.Scanner;

public class CountVowels
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("What city would you like to travel to? ");
      String city = scan.nextLine();
      
      int lenCity = city.length();
      int vowels = 0;
      for( int i = 0; i < lenCity; i++ )
      {
         char let = city.toLowerCase().charAt(i);
         if( let == 'a' || let == 'e' || let == 'i' || let == 'o' || let == 'u' )
         {
            vowels++;
         }
      }
      System.out.println( city + " has " + vowels + " vowels in it." );
   }
}