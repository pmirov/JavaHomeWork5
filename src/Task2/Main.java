package Task2;


import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        ArrayReader arrayReader = new ArrayReader(("src/Task2/file.txt"));
        int[] firstArray = arrayReader.readFirstArray();
        int [] secondArray = arrayReader.readSecondArray();

        System.out.println("Массив 1: ");
        for (int value : firstArray) {
            System.out.print(value + " ");
        }

        System.out.println("\nМассив 2: ");
        for (int value : secondArray) {
            System.out.print(value + " ");
        }


    }
}
