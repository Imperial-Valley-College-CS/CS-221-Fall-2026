public class Pokemon
{
   public static void main(String[] args)
   {
      for( int x = 1; x <= 10; x++ )
      {
         int randy = (int)(6*Math.random());
         
         String pokemon = "";
         switch(randy)
         {
            case 0: pokemon = "Pikachu"; break;
            case 1: pokemon = "Gengar"; break;
            case 2: pokemon = "Bulbasur"; break;
            case 3: pokemon = "Browt"; break;
            case 4: pokemon = "Ditto"; break;
            case 5: pokemon = "Machamp"; break;
         }
         System.out.println( pokemon );
      }
   }
}