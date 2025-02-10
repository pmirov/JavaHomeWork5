package Task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/Task2/file.txt"));
        List <String> stringArrays = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            stringArrays.add(line);
        }

        String[] firstArrayStr = stringArrays.getFirst().split("\\s");
        int[] firstArray = new int[firstArrayStr.length];
        for(int i = 0;i < firstArrayStr.length;i++)
        {
            firstArray[i] = Integer.parseInt(firstArrayStr[i]);
        }
        String[] secondArray = stringArrays.getLast().split("\\s");

        System.out.println("Массив 1: ");

        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");

        }
        System.out.println("\nМассив 2: ");
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");

        }


    }
}
