package Task1;


import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к первому файлу:");
        String firstFile = scanner.next();
        File file1 = new File(firstFile);
        System.out.println("Введите путь ко второму файлу:");
        String secondFile = scanner.next();
        File file2 = new File(secondFile);

        compareFileStrings(file1,file2);


    }

    public static List<String> filePrint(File file)
    {
        List <String> linesAsList = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            linesAsList = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null) {
                linesAsList.add(line);
            }

            reader.close();
            return linesAsList;
        }
        catch (IOException e) {
            System.out.println("ERROR");
        };
        return linesAsList;
    }

    public static void compareFileStrings(File file1, File file2)
    {


            List<String> lineList1 = filePrint(file1);
            List<String> lineList2 = filePrint(file2);
            List<String> allLines = new ArrayList<>(lineList1);
            allLines.removeAll(lineList2);
        System.out.println("Несовпадающие строки из каждого файла:");
        for (String line : allLines) {
            System.out.println(line);
        }


    }




    }

