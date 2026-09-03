public class AdditionQuiz
{
   public static void main(String[] args)
   {
      int low = 5;
      int high = 20;
      
      int num1 = (int)((high-low+1)*Math.random())+low;      
      int num2 = (int)((high-low+1)*Math.random())+low;
      
      System.out.print("What is " + num1 + " + " + num2 + " = ");
   }
}