public class StringOperations
{
   public static void main(String[] args)
   {
      System.out.println( validatePassword("toby357") );
      System.out.println( validatePassword("lukeV@der12") );
      System.out.println( validatePassword("peterParker3") );
      System.out.println( validatePassword("eagles67") );
   }
   
   public static boolean validatePassword( String password )
   {
      if( password.length() < 8 )
         return false;
         
      int count = 0;
      
      for(int i = 0; i < password.length(); i++)
      {  
         char let = password.toLowerCase().charAt(i);
         if( !(let >= 97 && let <= 122) && !(let >=48 && let <= 57) )
            return false;
         if( let >= 48 && let <= 57)
            count++;
      }
      
      return count >= 2;
   }
}