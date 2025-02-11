package Task2;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayReader arrayReader = new ArrayReader(("src/Task2/file.txt"));
        int[] firstArray = arrayReader.readArray(0);
        int [] secondArray = arrayReader.readArray(1);

        System.out.println("Массив 1: ");
        for (int value : firstArray) {
            System.out.print(value + " ");
        }

        System.out.println("\nМассив 2: ");
        for (int value : secondArray) {
            System.out.print(value + " ");
        }

        ArrayAnalyzer arrayAnalyzer = new ArrayAnalyzer(firstArray, secondArray);

        int maxFirstArrayValue = arrayAnalyzer.maxArrayValue(firstArray,firstArray.length);
        System.out.println("\nМаксимальное значение первого массива: "+ maxFirstArrayValue);

        int minFirstValue = arrayAnalyzer.minArrayValue(firstArray,firstArray.length);
        System.out.println("Минимальное значение первого массива: "+ minFirstValue);

        int sumFirstArray = arrayAnalyzer.elementArraySum(firstArray, firstArray.length);
        System.out.println("Cумма элементов первого массива: "+ sumFirstArray);

        int maxSecondArrayValue = arrayAnalyzer.maxArrayValue(secondArray,secondArray.length);
        System.out.println("\nМаксимальное значение второго массива: "+ maxSecondArrayValue);

        int minSecondValue = arrayAnalyzer.minArrayValue(secondArray,secondArray.length);
        System.out.println("Минимальное значение второго массива: "+ minSecondValue);

        int sumSecondArray = arrayAnalyzer.elementArraySum(secondArray, secondArray.length);
        System.out.println("Cумма элементов первого массива: "+ sumSecondArray);

        int max = arrayAnalyzer.maxValue(firstArray,secondArray,firstArray.length,secondArray.length);
        System.out.println("\nММаксимальное значение из двух массивов: "+ max);

        int min = arrayAnalyzer.minValue(firstArray,secondArray,firstArray.length,secondArray.length);
        System.out.println("Минимальное значение из двух массивов: "+ min);

        int sum = arrayAnalyzer.elementSum(firstArray,secondArray,firstArray.length,secondArray.length);
        System.out.println("Общая сумма элементов массивов: "+ sum);
    }
}
