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
        //String filePath = scanner.next();
        File file = new File("src/Task3/file.txt");
        System.out.println("Введите массив целых чисел:");
        String data = scanner.nextLine();
        String[] arrayStr = data.split("\\s");
        int[] array = new int[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++) {
            array[i] = Integer.parseInt(arrayStr[i]);
        }
        FileOutputStream outputWriter = new FileOutputStream(file);
//        for(int i=0; i < array.length; i++)
//        {
//            outputWriter.write(array[i]);
//        }
        outputWriter.write(data.getBytes());
         int[] evenArray = ArrayModifier.evenNumbers(array,array.length);
         int[] oddArray = ArrayModifier.oddNumbers(array,array.length);
         int[] reverseArray = ArrayModifier.reversArray(array,array.length);

        for (int i : reverseArray) {
            System.out.println(i);
        }

         
    }
}
