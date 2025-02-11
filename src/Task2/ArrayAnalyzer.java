package Task2;

public class ArrayAnalyzer {

    int[] firstArray;
    int[] secondArray;

    public ArrayAnalyzer(int[] firstArray, int[] secondArray) {
        this.firstArray = this.firstArray;
        this.secondArray = this.secondArray;
    }

    public int maxValue(int[] firstArray, int[] secondArray, int firstArrayLength, int secondArrayLength)
    {
        int max = firstArray[0];
        for (int i = 0; i < firstArrayLength; i++) {
            if (max < firstArray[i])
            {
                max = firstArray[i];
            }
        }
        for (int i = 0; i < secondArrayLength; i++) {
            if (max < secondArray[i])
            {
                max = secondArray[i];
            }
        }
        return max;
    }
    public int minValue(int[] firstArray, int[] secondArray, int firstArrayLength, int secondArrayLength)
    {
        int min = firstArray[0];
        for (int i = 0; i < firstArrayLength; i++) {
            if (min > firstArray[i])
            {
                min = firstArray[i];
            }
        }
        for (int i = 0; i < secondArrayLength; i++) {
            if (min > secondArray[i])
            {
                min = secondArray[i];
            }
        }
        return min;
    }

    public int elementSum(int[] firstArray, int[] secondArray, int firstArrayLength, int secondArrayLength)
    {
        int sum = 0;
        for (int i = 0; i < firstArrayLength; i++) {
            sum += firstArray[i];
        }
        for (int i = 0; i < secondArrayLength; i++) {
            sum += secondArray[i];
        }
        return sum;
    }

    public int maxArrayValue(int[] firstArray, int firstArrayLength)
    {
        int max = firstArray[0];
        for (int i = 0; i < firstArrayLength; i++) {
            if (max < firstArray[i])
            {
                max = firstArray[i];
            }
        }

        return max;
    }
    public int minArrayValue(int[] firstArray, int firstArrayLength)
    {
        int min = firstArray[0];
        for (int i = 0; i < firstArrayLength; i++) {
            if (min > firstArray[i])
            {
                min = firstArray[i];
            }
        }

        return min;
    }

    public int elementArraySum(int[] firstArray, int firstArrayLength)
    {
        int sum = 0;
        for (int i = 0; i < firstArrayLength; i++) {
            sum += firstArray[i];
        }

        return sum;
    }


}
