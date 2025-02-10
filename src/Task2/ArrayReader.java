package Task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class ArrayReader {
    private String filePath;

    public ArrayReader(String filePath) {
        this.filePath = filePath;
    }

    public int[] readFirstArray() throws IOException {
        List<String> stringArrays = readLines();
        String[] firstArrayStr = stringArrays.getFirst().split("\\s");
        int[] firstArray = new int[firstArrayStr.length];
        for (int i = 0; i < firstArrayStr.length; i++) {
            firstArray[i] = Integer.parseInt(firstArrayStr[i]);
        }
        return firstArray;
    }

    public int[] readSecondArray() throws IOException {
        List<String> stringArrays = readLines();
        String[] secondArrayStr = stringArrays.getLast().split("\\s");
        int[] secondArray = new int[secondArrayStr.length];
        for (int i = 0; i < secondArrayStr.length; i++) {
            secondArray[i] = Integer.parseInt(secondArrayStr[i]);
        }
        return secondArray;
    }
    private List<String> readLines() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader((filePath)));
        List<String> stringArrays = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null)
        {
            stringArrays.add(line);
        }
        reader.close();
        return stringArrays;

    }
}
