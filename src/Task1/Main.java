package Task1;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к первому файлу:");
        String firstFile = scanner.next();
        File file1 = new File(firstFile);
        System.out.println("Введите путь ко второму файлу:");
        String secondFile = scanner.next();
        File file2 = new File(secondFile);

        filePrint(file1);
        filePrint(file2);


    }

    public static void filePrint(File file)
    {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            List<String> lines = new ArrayList<String>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            String [] linesAsArray = lines.toArray(new String[0]);
            reader.close();
            for (String item : linesAsArray)
            {
                System.out.println(item);
            }

        } catch (IOException e) {
            System.out.println("ERROR");
        };
    }




    }

