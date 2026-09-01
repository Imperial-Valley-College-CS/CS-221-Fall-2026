public class QuadraticFormula
{
   public static void main(String[] args)
   {
      double a = 1;
      double b = 2;
      double c = 3;
      
      double disc = b*b-4*a*c;
      
      if( disc < 0 )
      {
         System.out.println("There are no real roots.");
      }else
      {
         if( disc > 0 )
         {
            double root1 = ( -b+Math.sqrt(disc) )/(2*a);
            double root2 = ( -b-Math.sqrt(disc) )/(2*a);
            System.out.println("Root 1: " + root1 + ", Root 2: " + root2 );
         }else
         {
            double root = -b/(2*a);
            System.out.println("Single Root: " + root);
         }
      }
      
   }//end main
}//end class