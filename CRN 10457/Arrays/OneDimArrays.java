import java.util.Arrays;

public class OneDimArrays
{
   public static void main(String[] args)
   {
      int[] a = {3,5,12,13,20,34,56};
      int[] b = {9,10,23,25,41,78};
      int[] c = merge(b,a);
      System.out.println( Arrays.toString(c) );
   }
   
   public static int[] merge(int[] orr, int[] err)
   {
      int[] arr = new int[orr.length+err.length];
      int i = 0; int j = 0; int k = 0;
      
      while( i < orr.length && j < err.length )
      {
         if( orr[i] < err[j] )
         {
            arr[k] = orr[i];
            i++;
         }else
         {
            arr[k] = err[j];
            j++;
         }
         k++;
      }
      
      while( i < orr.length )
      {
         arr[k] = orr[i];
         i++;
         k++;
      }
      
      while( j < err.length )
      {
         arr[k] = err[j];
         j++;
         k++;
      }
      
      return arr;
   }
}