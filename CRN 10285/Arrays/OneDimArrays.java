public class OneDimArrays
{
   public static void main(String[] args)
   {
      int[] grades = {93, 86, 82, 75};
      int ans = min(grades);
      System.out.println( ans );
      
      int[] temps = {98, 105, 101, 101, 100, 97};
      ans = min(temps);
      System.out.println( ans );
   }
   
   public static int min(int[] arr)
   {
      int smallest = arr[0];
      for(int i = 0; i < arr.length; i++)
      {
         if(arr[i] < smallest)
         {
            smallest = arr[i];
         }
      }
      return smallest;
   }
}