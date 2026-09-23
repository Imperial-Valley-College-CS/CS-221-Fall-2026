public class NumberSense
{
   public static void main(String[] args)
   {
      // System.out.println( "10946 in resverse order: " + reverse(10946) );
//       System.out.println( "15051 is a palindrome: " + isPalindrome(15051) );
//       System.out.println( "1578 is a palindrome: " + isPalindrome(1578) );
//       System.out.println( "78846 sum of digits: " + sumDigits(78846) );
//       System.out.println( "Sorted ascending: " );      
      displaySortedNumbers( 8, 10, 12 ); System.out.println();      
      displaySortedNumbers( 12, 10, 8 ); System.out.println();
      displaySortedNumbers( 10, 12, 8 ); System.out.println();
      System.out.printf( "107.5 degF is %.2f degC\n",fahrenheitToCelsius( 107.5 ));
      // System.out.printf( "43.5 degC is %.2f degF\n",celsiusToFahrenheit( 43.5 ));
      // System.out.println( "17 is a prime number: "+isPrime( 17 ));
//       System.out.println( "27 is a prime number: "+isPrime( 27 ));
   }
   
   public static double fahrenheitToCelsius( double tempF )
   {
      double tempC = (5.0/9.0)*(tempF-32);
      return tempC;
   }
   
   public static void displaySortedNumbers(int var1, int var2, int var3)
   {
      if( var1 <= var2 && var1 <= var3 )
      {
         System.out.print(var1 + " ");
         if(var2 <= var3)
            System.out.print( var2 + " " + var3 );
         else
            System.out.print( var3 + " " + var2 );
      }
      if( var2 < var1 && var2 < var3 )
      {
         System.out.print(var2 + " ");
         if(var1 < var3)
            System.out.print( var1 + " " + var3 );
         else
            System.out.print( var3 + " " + var1 );
      }
      if( var3 < var1 && var3 < var2 )
      {
         System.out.print(var3 + " ");
         if(var2 < var1)
            System.out.print( var2 + " " + var1 );
         else
            System.out.print( var1 + " " + var2 );
      }
   }
}