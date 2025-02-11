package Task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {
    public static void writeIntToFile(String filePath, int[] array) throws IOException {
        File file = new File(filePath);
        FileOutputStream outputWriter = new FileOutputStream(file, true);

        for (int i = 0; i < array.length; i++) {
            outputWriter.write((array[i] + " ").getBytes());
        }
        outputWriter.write(("\n").getBytes());
        outputWriter.close();
    }
}
