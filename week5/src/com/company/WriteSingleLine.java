package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;


public class WriteSingleLine {
    public static void main(String[] args) {
        try {
            writeLines();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writeLines() throws IOException {
        Path path = Paths.get("src/com/company/my-file.txt");
        String name = "John Dorian";
        Files.writeString(path, name);
    }
}
