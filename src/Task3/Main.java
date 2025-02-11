package Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Введите путь к первому файлу:");
        String filePath = "src/Task3/file.txt";

        File file = new File(filePath);
        System.out.println("Введите массив целых чисел:");
        String data = scanner.nextLine();
        String[] arrayStr = data.split("\\s");
        int[] array = new int[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++)
        {
            array[i] = Integer.parseInt(arrayStr[i]);
        }
        FileOutputStream clearFile = new FileOutputStream(filePath);
        clearFile.close();
        FileIO.writeIntToFile(filePath,array);

        int[] evenArray = ArrayModifier.evenNumbers(array,array.length);
         int[] oddArray = ArrayModifier.oddNumbers(array,array.length);
         int[] reverseArray = ArrayModifier.reversArray(array,array.length);

        FileIO.writeIntToFile(filePath,evenArray);
        FileIO.writeIntToFile(filePath,oddArray);
        FileIO.writeIntToFile(filePath,reverseArray);




    }
}
