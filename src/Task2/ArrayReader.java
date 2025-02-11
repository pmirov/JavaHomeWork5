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

    public int[] readArray(int index) throws IOException {
        List<String> stringArrays = readLines();
        String[] arrayStr = stringArrays.get(index).split("\\s");
        int[] array = new int[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++) {
            array[i] = Integer.parseInt(arrayStr[i]);
        }
        return array;
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
