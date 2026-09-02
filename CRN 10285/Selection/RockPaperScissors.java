public class RockPaperScissors
{
   public static void main(String[] args)
   {
      // 1-rock, 2-paper, 3-scissors
      int myHand = 1;      //scan this from user
      
      int compHand = (int)(3*Math.random())+1;
      
      String myFist = "";
      String compFist = "";
      String out = "";
      
      switch( myHand )
      {
         case 1: myFist = "rock"; break;
         case 2: myFist = "paper"; break;
         case 3: myFist = "scissor"; break;
      }
      
      if( (myHand == 1 && compHand == 3) || (myHand == 2 && compHand == 1) || (myHand == 3 && compHand == 2) )
         out = "win";
      
      System.out.println("Your hand is " + myFist + ".Computer hand is " + compFist + ".You " + out);      
   }
}