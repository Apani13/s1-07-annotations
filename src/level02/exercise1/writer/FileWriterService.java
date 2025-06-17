package level02.exercise1.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterService implements Writer {

    @Override
    public void writeToFile(String content, String path) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(content);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write to file", e);
        }
    }

}
