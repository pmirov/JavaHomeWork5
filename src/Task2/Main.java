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
        int max = arrayAnalyzer.maxValue(firstArray,secondArray,firstArray.length,secondArray.length);
        System.out.println("\nМаксимальное значение из двух массивов: "+ max);

    }
}
