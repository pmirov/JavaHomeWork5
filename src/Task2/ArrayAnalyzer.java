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
}
