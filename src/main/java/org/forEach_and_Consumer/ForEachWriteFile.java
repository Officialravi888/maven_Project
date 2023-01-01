package org.forEach_and_Consumer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ForEachWriteFile {

    public static void main(String[] args) {

        ForEachWriteFile obj = new ForEachWriteFile();
        obj.save(Paths.get("src/main/java/org/forEach_and_Consumer/File.txt"), obj.createDummyFiles());
    }

    public void save(Path path, List<DummyFile> files) {

        if (!Files.isDirectory(path)) {
            throw new IllegalArgumentException("Path must be a directory");
        }

        files.forEach(f -> {
            try {
                int id = f.getId();
                // create a filename
                String fileName = id + "File.txt";
                Files.write(path.resolve(fileName),
                        f.getContent().getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }

    public List<DummyFile> createDummyFiles() {
        return Arrays.asList(
                new DummyFile(1, "hello"),
                new DummyFile(2, "world"),
                new DummyFile(3, "java"));
    }

    class DummyFile {
        int id;
        String content;

        public DummyFile(int id, String content) {
            this.id = id;
            this.content = content;
        }

        public int getId() {
            return id;
        }

        public String getContent() {
            return content;
        }
    }
}
