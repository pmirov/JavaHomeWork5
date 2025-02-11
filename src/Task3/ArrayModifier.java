package Task3;

public class ArrayModifier

{
   private int array[];

   public static int[] evenNumbers(int array[], int n)
   {

       int evenN = 0;
       for (int i = 0 ; i < n; i++) {
           if(array[i] % 2 == 0)
           {
              evenN++;
           }
       }
       int[] evenArray = new int[evenN];
       for (int i = 0, j = 0; i < n; i++) {
           if(array[i] % 2 == 0)
           {
               evenArray[j] = array[i];
               j++;
           }
       }
       return evenArray;
   }

}
