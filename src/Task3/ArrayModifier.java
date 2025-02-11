package Task3;

public class ArrayModifier

{

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
    public static int[] oddNumbers(int array[], int n)
    {

        int oddN = 0;
        for (int i = 0 ; i < n; i++) {
            if(array[i] % 2 != 0)
            {
                oddN++;
            }
        }
        int[] oddArray = new int[oddN];
        for (int i = 0, j = 0; i < n; i++) {
            if(array[i] % 2 != 0)
            {
                oddArray[j] = array[i];
                j++;
            }
        }
        return oddArray;
    }

    public static int[] reversArray(int array[], int n)
    {

       int[] reversArray = new int[n];
        for (int i = n-1; i >= 0; i--) {
            reversArray[n-1-i] = array[i];
        }

        return reversArray;
    }

}
