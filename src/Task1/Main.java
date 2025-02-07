package Task1;


import java.io.*;
import java.util.ArrayList;
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

        //filePrint(file1);
        //filePrint(file2);
        compareFileStrings(file1,file2);


    }

    public static String[] filePrint(File file)
    {
        String [] linesAsArray = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            List<String> lines = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            linesAsArray = lines.toArray(new String[0]);
            reader.close();
//            for (String item : linesAsArray)
//            {
//                System.out.println(item);
//            }
            return linesAsArray;
        }
        catch (IOException e) {
            System.out.println("ERROR");
        };
        return linesAsArray;
    }

    public static void compareFileStrings(File file1, File file2)
    {


            String [] lineArray1 = filePrint(file1);
            String [] lineArray2 = filePrint(file2);
            int len1 = lineArray1.length;
            int len2 = lineArray2.length;
            String [] allLines = new String[len1 + len2];
            System.arraycopy(lineArray1,0,allLines,0,lineArray1.length);
            System.arraycopy(lineArray2, 0, allLines, lineArray1.length, lineArray2.length);
            List<String> duplicates = new ArrayList<>();
        for (int i = 0; i < allLines.length; i++) {
            String item1 = allLines[i];
            if (item1 == null) continue;
            for (int j = 0; j < allLines.length; j++) {
                if( i == j) continue;
                String item2 = allLines[j];
                if (item1.equals((item2)))
                {
                    duplicates.add(item2);
                }
            }


        }

        for (String item : duplicates)
        {
            System.out.println(item);
        }


    }




    }

