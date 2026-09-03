public class AscendingOrder
{
   public static void main(String[] args)
   {
      int num1 = 7;
      int num2 = 3;
      int num3 = 9;
      
      if( num1 < num2 && num1 < num3 )
      {
         System.out.print( num1 + ", " );
         if( num2 < num3 )
            System.out.print( num2 + ", " + num3 );
         else
            System.out.print( num3 + ", " + num2 );
      }
   }
}